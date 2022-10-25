package ncs.test9;

public class Airplane extends Plane{

	public Airplane() {
	
	}
	
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	public void flight(int distance) {
		setFuelSize(getFuelSize()-(distance/10*30));
		System.out.printf("%s\t%d\n", getPlaneName(), getFuelSize() );
	}
}
