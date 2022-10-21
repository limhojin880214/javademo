package java017_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

/*
 * [프로그램 출력결과]
 * kim	56	78	12	146
 * hong	46	100	97	243
 * park	96	56	88	240
 * 
 */
public class Java183_Vector_1 {

	public static void main(String[] args) {
		String path = "./src/java017_collection/score.txt";
		Vector<Sawon> vt = lines(path);
		prnDisplay(vt);
		
	}//end main()
	
	private static Vector<Sawon> lines(String fileName){
		//strName 매개변수의 값을 이용해서 Vector애 데이터를 저장한후
		//리턴하는 프로그램을 구현하시오.
		File file=new File(fileName);
		FileReader fr = null;
		int data;
		String d = "";
		try {
			fr = new FileReader(file);
			while((data = fr.read()) != -1) {
				d += (char)data;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//System.out.println(d);
		Vector<Sawon> vt = new Vector<Sawon>();
		String[] res = d.split("\r\n");
		for(int i = 0; i<res.length ;i++) {
			String[] info = res[i].split(":");
			//이름은 info[0]
			String[] jumsu = info[1].split("/");
			vt.add(new Sawon(info[0], Integer.parseInt(jumsu[0]), Integer.parseInt(jumsu[1]), Integer.parseInt(jumsu[2])));
		}
		return vt;
	}
	
	private static void prnDisplay(Vector<Sawon> vt) {
		//vt에 저장된 객체들을 출력결과와 같이 프로그램을 구현하시오.
		for(Sawon data : vt)
			System.out.println(data.toString());
	}
}//end class 
