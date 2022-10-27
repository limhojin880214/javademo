package nsc.prob.test12;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("1", "apple,1200,3");
		prop.setProperty("2", "banana,2500,2");
		prop.setProperty("3", "grape,4500,5");
		prop.setProperty("4", "orange,800,10");
		prop.setProperty("5", "melon,5000,2");
		
		for(int i = 1; i<=prop.size();i++) {
			String data = (String)prop.get(Integer.toString(i));
			
			String[] arr = data.split(",");
			System.out.printf("%s = %s, %s원, %s개\n",i, arr[0],arr[1],arr[2] );
		}
		
		
		 
		// 명시한 사용 데이터를 prop 에 기록한다.
		// fileSave() 메소드를 호출한다.

		// fileOpen() 메소드를 호출한다.

	}

	public void fileSave(Properties p) {

	}

	public void fileOpen(Properties p) {

	}
}
