package casa.walter.carmanager;

public class MotoManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Motorcycle suzuki = new Motorcycle ("Suzuki GSX-R1000", 2021, 16000, 600, "  black", "disel", true);
		
		Motorcycle yamaha = new Motorcycle("Yamaha FZ1", 2007, 9000, 700, "orangE", "gas", false);
		
		
		suzuki.addDistance(30000);
		suzuki.addDistance(200);
	
		
		System.out.println(suzuki);
		System.out.println();
		System.out.println(yamaha);

//		System.out.println(suzuki.equals(yamaha));
//		System.out.println(suzuki.equals(suzuki));
		
		
		
	}}
	

