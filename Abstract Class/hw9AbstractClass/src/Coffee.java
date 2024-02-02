/*
* Name:    Asma Ahmed 
* Date:    7/14/20
* Purpose: Demonstrate ability to create abstract classes and methods
* 		   Demonstrate ability to use concrete and abstract methods in an abstract class
* 		   Demonstrate ability to use abstract methods to impose rules on all child classes
* Notes:   Windows Machine
*/

//child class (coffee)
//extends drink, has roast, sugar, cream. Temperature is always 100c
class Coffee extends Drink {
	
	//variables
	private String roast;
	private boolean hasSugar;
	private boolean hasCream;
	
	//coffee constructor
	public Coffee(String roast, int size, int temp, boolean hasCream, boolean hasSugar) {
		super(size, temp); //inherit from parent
		this.roast=roast;
		this.hasCream=hasCream;
		this.hasSugar=hasSugar;
	}//close construct
	
	//abstract method override 
		public String ratio() {
			String amount = "Ratio: 1:4:2";
			return amount;
		}
	
	//get/set type
	public String getRoast() {
		return roast;
		}
	public void setRoast(String roast) {
		this.roast = roast;
		}
	
	//get/set has sugar
	public Boolean getSugar() {
		return hasSugar;
		}	
	public void setSugar(Boolean hasSugar) {
		this.hasSugar = hasSugar;
		}

	//get/set has cream
	public Boolean getCream() {
		return hasCream;
		}	
	public void setCream(Boolean hasCream) {
		this.hasCream = hasCream;
		}
		
	//override toString() method
	@Override
	public String toString() {
		return "Coffee\nRoast: " + roast + "\nSize(Ounces): " + getSize() + "\nTemperature (Celcius): " + getTemp() + "\nCream? " + hasCream + "\nSugar? " + hasSugar +"\n" + ratio() + "\n";
	}//close string
}//close coffee
