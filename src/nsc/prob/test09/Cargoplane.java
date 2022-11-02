package nsc.prob.test09;

public class Cargoplane extends Plane{

	public Cargoplane() {
	
	}
	
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	public void flight(int distance) {
		setFuelSize(getFuelSize()-(distance/10*50));
		System.out.printf("%s\t%d\n", getPlaneName(), getFuelSize());
	}
}
