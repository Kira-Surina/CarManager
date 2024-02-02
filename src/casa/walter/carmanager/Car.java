package casa.walter.carmanager;

import java.util.Objects;

public abstract class Car {    // класс car получает свои поля:
	
	String nameOfCar;
	int yearOfProduction;
	Price price;
	int weight;
	Color color;
	private int distance = 0;
	protected int distanceToService = 0;
	static boolean readyToService;
	
	
		
	//КОНСТРУКТОР:	
	public Car(String nameOfCar, int yearOfProduction, Price price, int weight, Color color) { //
		this.nameOfCar = nameOfCar;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = color;
	
		}
	
	//МЕТОД addDistance нужен для.......... 
	public void addDistance(int additionalDistance){
	/* public для доступа из другого класса
	> void тк метод не должен возвращать никаких данных, он должен только принимать данные.
	> имя метода
	> принимает int - число , имя значения
	> {}фигурные скобки внутри тело метода, т.е то, что будет происходить в этом методе*/
	
		distance = distance + additionalDistance;	// distance += additionalDistance; используем оператор +=, что бы не повторять distance 2 раза.
		distanceToService = distanceToService + additionalDistance;
	}
	
	public abstract boolean service(); 
//	{if(distanceToService > 10000){
////			readyToService = true;
//			System.out.println("Транспорту ПОРА на сервис");
//			return true;
//			
//		}else {
////			readyToService = false;
//			System.out.println("Транспорту на сервис НЕ надо");
//		return false;
//		
//	}
//	}
//	
//	public int ZeroDistance() {
//		
//		if(distanceToService > 10000) {
//			
//			distanceToService = distance - distanceToService;
//			System.out.println("Сервис прошел!");
//		return distanceToService;
//		}else {
//			
//			System.out.println("Сервис не прошел");
//			return distanceToService;
//		}}
	
	//МЕТОД GETTER, что бы получать данные из этого поля
	public int getDistance() {
		return distance;
			}
	
	
	public int getDistaceToService() {
		return distanceToService;
	}

	@Override
	public String toString() {
		return "Trasporto [nameOfCar=" + nameOfCar + ", yearOfProduction=" + yearOfProduction + ", price=" + price
				+ ", weight=" + weight + ", color=" + color + ", distance=" + distance + ", distanceToService=" 
				+ distanceToService + ", readyToService=" + service() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((nameOfCar == null) ? 0 : nameOfCar.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + weight;
		result = prime * result + yearOfProduction;
		return result;
	}
// МЕТОД equals, создается в ручную или с помощюю Source>Genrate hashCode() and equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //сравнивает если это один и тот же объект
			return true;  //если это один и тот же объект, возвращает true
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())// если разные типы, то сразу перестает сравнивать. 
										 // как сравнить автомобиль и газонокосилку.
			return false;
		
		Car other = (Car) obj;// приводится к типу car и далее сравнивается по полям. 
							  //если хотябы одно поле не совпадает, то возвращает false
		if (color != other.color)
			return false;
		if (nameOfCar == null) {
			if (other.nameOfCar != null)
				return false;
		} else if (!nameOfCar.equals(other.nameOfCar))
			return false;
		if (price != other.price)
			return false;
		if (weight != other.weight)
			return false;
		if (yearOfProduction != other.yearOfProduction)
			return false;
		return true;
	}

		
//	public boolean differenceCar () {
//		if (distance > 10000 ){
//			return true;
//		}else {
//			return false;
//			}
//		
//	}
//	
//	public boolean differeceBus() {
//		if(distance > 50000) {
//			return true;
//		}else {
//			return false;
//		}
//		
//	}	
	

	
}
