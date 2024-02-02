package casa.walter.carmanager;

public class Bus extends Car {

	public Bus(String nameOfCar, int yearOfProduction, Price price, int weight, Color color) {
		super(nameOfCar, yearOfProduction, price, weight, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean service() {
		
	if (distanceToService > 50000) {
//		readyToService = true;
		System.out.println("Автобусу Пора на сервис");
		return true;
		
	}else {
//		readyToService = false;
		System.out.println("Автобусу На сервис не надо");
		return false;
}		
	}
	
	
}
