package casa.walter.carmanager;

public enum Color {

	WhItE001("== White =="), 
	GrEeN002("== Green =="), 
	_black ("Black"), 
	BLUE_004("Blue"),
	orangE("Orange");
	
	
	String elseColor; //МЕТОД выводит в консоль, то, что в скобках Using Enum values as String literals
	Color(String elseColor) {// КОНСТРУКТОР
		this.elseColor = elseColor;
		}



}
