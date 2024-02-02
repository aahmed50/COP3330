/*
* Name:    Asma Ahmed 
* Date:    7/14/20
* Purpose: Demonstrate ability to create abstract classes and methods
* 		   Demonstrate ability to use concrete and abstract methods in an abstract class
* 		   Demonstrate ability to use abstract methods to impose rules on all child classes
* Notes:   Windows Machine
*/

//child class (coffee)
//extends drink, has type, sugar, milk. Temperature is always -0.28c
class Boba extends Drink {

	//variables
	private String flavor;
	private boolean hasSugar;
	private boolean hasMilk;
	private boolean hasPearls;
		
	//boba constructor
	public Boba(String flavor, int size, int temp, boolean hasMilk, boolean hasSugar, boolean hasPearls) {
		super(size, temp); //inherit from parent
		this.flavor=flavor;
		this.hasMilk=hasMilk;
		this.hasSugar=hasSugar;
		this.hasPearls=hasPearls;
	}//close construct
		
	//abstract method override
	public String ratio() {
		String amount = "Ratio: 6:1:1:2";
		return amount;
		}
		
	//get/set type
	public String getFlavor() {
		return flavor;
		}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
		}
		
	//get/set has sugar
	public Boolean getSugar() {
		return hasSugar;
		}	
	public void setSugar(Boolean hasSugar) {
		this.hasSugar = hasSugar;
		}

	//get/set has milk
	public Boolean getMilk() {
		return hasMilk;
		}	
	public void setMilk(Boolean hasMilk) {
		this.hasMilk = hasMilk;
		}
		
	//get/set has pearls
	public Boolean getPearls() {
		return hasPearls;
		}	
	public void setPearls(Boolean hasPearls) {
		this.hasPearls = hasPearls;
		}
		
	//override toString() method
	@Override
	public String toString() {
		return "Boba\nFlavor: " + flavor + "\nSize(Ounces): " + getSize() + "\nTemperature (Celcius): " + getTemp() + "\nMilk? " + hasMilk + "\nSugar? " + hasSugar + "\nPearls? " + hasPearls + "\n" + ratio() + "\n";
	}//close string
}//close boba
