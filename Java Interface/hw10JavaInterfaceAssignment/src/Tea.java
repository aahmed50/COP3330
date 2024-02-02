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

//child class (tea)
//extends drink, has type. Temperature is always 100c
class Tea extends Drink implements Content, Straw, Time{

	//variables
	private String type;
	int sugar;
	int items = 2;
	int heat;

	//tea constructor
	public Tea(String type, int size, int temp) {
		super(size, temp); //inherit from parent
		this.type=type;
		}//close construct
	
	//abstract method override
	public String ratio() {
		String amount = "Ratio: 1:1";
		return amount;
		}
	
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
	
	//get/set type
	public String getType() {
		return type;
		}
	public void setType(String type) {
		this.type = type;
		}
	
	//override toString() method
	@Override
	public String toString() {
		return "Tea\nType: " + type + "\nSize(Ounces): " + getSize() + "\nTemperature (Celcius): " +  getTemp() + "\n" + ratio();
	}//close string
}//close tea
