package ncs.test9;

public class PlaneTest {

	public static void main(String[] args) {
		// Airplane 과 Cargoplane 객체 생성
		// 생성된 객체의 정보 출력
		// Airplane 과 Cargoplane 객체에 100 씩 운항
		// 100 운항 후 객체 정보 출력
		// Airplane 과 Cargoplane 객체에 200 씩 주유
		// 200 주유 후 객체 정보 출력
		
		Airplane ap = new Airplane();
		ap.setPlaneName("L747");
		ap.setFuelSize(1000);
		
		Cargoplane cp = new Cargoplane();
		cp.setPlaneName("C40");
		cp.setFuelSize(1000);
		
		System.out.printf("%s\t%s\n", "Plane", "fuelSize");
		System.out.println("----------------");
		System.out.printf("%s\t%d\n", ap.getPlaneName(), ap.getFuelSize());
		System.out.printf("%s\t%d\n", cp.getPlaneName(), cp.getFuelSize());
		
		int flight = 100;
		System.out.println(flight + " 운항");
		System.out.printf("%s\t%s\n", "Plane", "fuelSize");
		System.out.println("----------------");
		ap.flight(flight);
		cp.flight(flight);
		int re = 200;
		System.out.println(re + " 주유");
		System.out.printf("%s\t%s\n", "Plane", "fuelSize");
		System.out.println("----------------");
		ap.refuel(re);
		cp.refuel(re);
	}
}
