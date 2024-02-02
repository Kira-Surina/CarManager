package casa.walter.carmanager;

public class PassengerCar extends Car {

	public PassengerCar(String nameOfCar, int yearOfProduction, Price price, int weight, Color color) {
		super(nameOfCar, yearOfProduction, price, weight, color);
		// super это конструктор базового класса
	}

	@Override
	public boolean service() {
		
	if (distanceToService > 10000) {
//		readyToService = true;
		System.out.println("Машине Пора на сервис");
		return true;
		
	}else {
//		readyToService = false;
		System.out.println("Машине На сервис НЕ надо");
		return false;


	

}		
	}
	
}
