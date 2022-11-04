package project;

import java.util.List;

public class GoodsController {
	private GoodsDAO dao;
	
	public GoodsController() {
		dao = GoodsDAO.getInstance();
	}
	
	public List<GoodsDTO> readProcess(){
		return dao.readGoods();
	}
	
	public int createProcess(GoodsDTO dto) {
		return dao.createGoods(dto);
	}
	
	public int updateProcess(GoodsDTO dto) {
		return dao.updateGoods(dto);
	}
	
	public int deleteProcess(String name) {
		return dao.deleteGoods(name);
	}
	
	public void tableProcess() {
		dao.checkTable();
	}
}
