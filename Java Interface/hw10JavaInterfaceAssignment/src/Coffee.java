/*
* Name:    Asma Ahmed 
* Date:    7/19/20
* Purpose: Demonstrate ability to create abstract classes and interfaces
* 		   Demonstrate ability to distinguish the purpose of an interface versus abstract class
* Notes:   Windows Machine
* 		   Abstract parent class (Drink) has a size, a temperature, and a ratio (abstract method)
* 		   Child Class (Tea) extends (Drink) has type, size, temperature, and ratio
* 		   Child Class (Coffee) extends (Drink) and has  roast, size, temperature, cream, sugar, and ratio
* 		   Abstract method: each drink sub-category has its own ratio
*/


//child class (coffee)
//extends drink, has roast, sugar, cream. Temperature is always 100c
class Coffee extends Drink implements Content, Straw, Time{
	
	//variables
	private String roast;
	private boolean hasSugar;
	private boolean hasCream;
	int sugar;
	int items = 3;
	int heat;
	
	//coffee constructor
	public Coffee(String roast, int size, int temp, boolean hasCream, boolean hasSugar) {
		super(size, temp); //inherit from parent
		this.roast=roast;
		this.hasCream=hasCream;
		this.hasSugar=hasSugar;
	}//close construct
	
	//straw interface
	@Override
	public boolean needsStraw(){
		System.out.println("Needs Straw? " + false);
		return false;
		}//close needsStraw 
	
	//sugar content interface
	@Override
	public void sugarContent(int newSugar) {
		sugar = newSugar;
		System.out.println("Sugar Content: " + sugar + "%");
		}//close sugarContent
	
	//heat time interface
	@Override
	public void heatTimeNeeded(int newHeat) {
		heat = items * newHeat;
		System.out.println("Time needed: " + heat + " minutes \n");
		}//close heatTimeNeeded
	
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
		return "Coffee\nRoast: " + roast + "\nSize(Ounces): " + getSize() + "\nTemperature (Celcius): " + getTemp() + "\nCream? " + hasCream + "\nSugar? " + hasSugar +"\n" + ratio();
	}//close string
}//close coffee
