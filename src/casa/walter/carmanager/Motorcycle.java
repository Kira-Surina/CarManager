package casa.walter.carmanager;

public class Motorcycle {
	String name;
	int yearOfProduct;
	int price;
	int weight;
	String color;
	String engineType;// тип мотора
	boolean isReadyToDrive;
	private int distance = 0;
	//boolean destroy; 
	//int destroyLimit = 200000;
	protected int distanceToService = 0;
	static boolean isReadyToService;
	
	//КОНСТРУКТОР:	
	public Motorcycle(String name, int yearOfProduct, int price, int weight, String color, String engineType,
			boolean isReadyToDrive) {
		
		//String colorRemoveSpaces = color.replaceAll(" ",""); // убирает пробел. меняем вид того, что написано под color в Motomanager
		// color. colorRemoveSpaces2 = colorRemoveSpaces.replace("black", "Black");
		//String colorToUppercase = color.toUpperCase();
		this.name = name;
		this.yearOfProduct = yearOfProduct;
		this.price = price;
		this.weight = weight;
	    this.color = color.valueOf(color.replace(" ", "").toUpperCase().replace ("BLACK", "Black").replace("ORANGE", "Orange"));
		//this.color = String.valueOf(colorToUppercase);    
		//this.color = color;
		//this.color = color.replace(" ", "");
		//this.color = color.toUpperCase();
	    //this.color = Color.valueOf(color);
		this.engineType = engineType;
		this.isReadyToDrive = isReadyToDrive;
	}
	
	public void addDistance(int additionalDistance){
			distance = distance + additionalDistance;
			distanceToService = distanceToService + additionalDistance;
			}
	
	
	public int getDistance() {
		return distance;
	}
	
	public int getDistanceToService() {
		return distanceToService;
	}
	
	public boolean service() {
		
		if(distanceToService > 8000){
			System.out.println("MOTO pronto per manutenzione");
			return true;
			
		}else {
			
			System.out.println("MOTO NON pronto per manutenzione");
		return false;
		
	}
	}
	//public void repair(boolean repairMoto) {
			//			}
	
	//public boolean destroy () {
		//if(distance >= destroyLimit)
			//return true;
		//}
	
	
	
		
	
	
		@Override
		public String toString() {
			return "Motorcycle [name=" + name + ", yearOfProduct=" + yearOfProduct + ", price=" + price + ", weight="
					+ weight + ", color=" + color + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive
					+ ", distance=" + distance + ", distanceToService=" + distanceToService + ", readyToService=" + service() + "]";
		}}
		
		

