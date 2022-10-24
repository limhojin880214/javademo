package java018_collection;

public class Java197_User {

	public static void main(String[] args) {
		box<Integer> intBox = new box<Integer>();
		intBox.setData(10);
		System.out.println(intBox.getData());
		
		box<String> strBox = new box<String>("java"); 
		System.out.println(strBox.getData());
		
		box<Double> dleBox = new box<Double>(4.5); 
		System.out.println(dleBox.getData());

	}//end main()
	
}//end class
