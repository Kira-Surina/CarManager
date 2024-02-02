package casa.walter.carmanager;

public class CarManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PassengerCar prius = new PassengerCar("Tayota Prius", 2008, Price.euro_150000, 1200, Color.GrEeN002);
		
		Bus laguna = new Bus("Renault Laguna", 2000, Price.euro_9700, 1600, Color.WhItE001);
		
		Car laguna2 = new PassengerCar("Renault Laguna", 2000, Price.euro_9700, 1600, Color.WhItE001);
		
		prius.addDistance(1000);
		prius.addDistance(200);
		prius.addDistance(50000);
		laguna.addDistance(3000);
		laguna2.addDistance(2590);
		laguna2.addDistance(2590);
		laguna2.addDistance(2590);
		laguna2.addDistance(2590);
		laguna2.addDistance(2590);
		

				
		System.out.println(prius);
		System.out.println();
		System.out.println(laguna);
		System.out.println();
		System.out.println(laguna2);
		System.out.println();
		
//		laguna2.ZeroDistance();
		
//		System.out.println(prius.equals(laguna));
//		System.out.println(laguna.equals(laguna2));
		
		
	}
	

}
