/*
* Name:    Asma Ahmed 
* Date:    7/14/20
* Purpose: Demonstrate ability to create abstract classes and methods
* 		   Demonstrate ability to use concrete and abstract methods in an abstract class
* 		   Demonstrate ability to use abstract methods to impose rules on all child classes
* Notes:   Windows Machine
*/

//child class (tea)
//extends drink, has type. Temperature is always 100c
class Tea extends Drink{

	//variables
	private String type;
	
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
		return "Tea\nType: " + type + "\nSize(Ounces): " + getSize() + "\nTemperature (Celcius): " +  getTemp() + "\n" + ratio() +"\n";
	}//close string
}//close tea
