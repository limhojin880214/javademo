package java018_collection;

import java.util.Vector;

public class Java200_Vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("java");
		v.add("jsp");
		v.add("spring");
		
		System.out.println(v.toString());
		
		Vector<String> t = new Vector<String>();
		t.add("java");
		t.add("mysql");
		System.out.println(t.toString());
		System.out.println(t.toString().length());
		
		v.removeAll(t);	//v.toString- t.toString()
		System.out.println(v.toString());
	}//end main()
	
}//end class
