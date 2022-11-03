package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GoodsDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static GoodsDAO dao = new GoodsDAO();
	
	private GoodsDAO() {}
	
	public static GoodsDAO getInstance() {
		return dao;
	}
	
	private Connection init() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		return DriverManager.getConnection(url, username, password);
	}//end init()
	
	private void exit() throws SQLException {
		if(rs!=null)
			rs.close();
		
		if(stmt != null)
			stmt.close();
		
		if(pstmt != null) 
			pstmt.close();
		
		if(conn != null)
			conn.close();
	}//end exit()
	
	public List<GoodsDTO> readGoods(){
		List<GoodsDTO> aList = new ArrayList<GoodsDTO>();
		try {
			conn = init();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			String sql = "SELECT * FROM goods ORDER BY name";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				GoodsDTO dto = new GoodsDTO();
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getInt("price"));
				dto.setAmount(rs.getInt("amount"));
				aList.add(dto);
			}
	
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return aList;
	}//end readGoods()
	
	public int createGoods(GoodsDTO dto) {
		int chk = -1;
		try {
			conn = init();
			conn.setAutoCommit(false);
			
			String sql = "INSERT INTO goods(name,price,amount) ";
			sql	+= "VALUES(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getPrice());
			pstmt.setInt(3, dto.getAmount());
			
			chk = pstmt.executeUpdate();
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return chk;
	}//end createGoods()
	
	public int updateGoods(GoodsDTO dto) {
		int chk = -1;
		try {
			conn = init();
			conn.setAutoCommit(false);
			
			String sql="UPDATE goods SET price=?, amount=? WHERE name=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getPrice());
			pstmt.setInt(2, dto.getAmount());
			pstmt.setString(3, dto.getName());
			
			chk = pstmt.executeUpdate();
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return chk;
	}//end updateGoods()
	
	public int deleteGoods(String name) {
		int chk = -1;
		try {
			conn = init();
			conn.setAutoCommit(false);
			
			String sql="DELETE FROM goods WHERE name=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			chk = pstmt.executeUpdate();
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return chk;
	}//end deleteGoods()

}//end GoodsDAO
