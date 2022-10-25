package ncs.test9;

public class Airplane extends Plane{

	public Airplane() {
	
	}
	
	public Airplane(String planeName, int fuelSize) {
		
	}
	
	public void flight(int distance) {
		System.out.println(distance + "운항");
		//fuelSize -= distance/10 * 30;
	}
}
