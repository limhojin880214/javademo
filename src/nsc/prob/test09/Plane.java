package nsc.prob.test09;

abstract class Plane {
	private String planeName;
	private int fuelSize;
	
	public Plane() {
	
	}

	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}

	public void refuel(int fuel) {
		System.out.printf("%s\t%d\n", planeName, this.fuelSize += fuel);
	}
	
	public void flight(int distance) {
		System.out.printf("%s %d\n", this.planeName, this.fuelSize);
	}
	
}
