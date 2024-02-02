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


//child class (boba)
//extends drink, has type, sugar, milk. Temperature is always -0.28c
class Boba extends Drink implements Content, Straw, Time{

	//variables
	private String flavor;
	private boolean hasSugar;
	private boolean hasMilk;
	private boolean hasPearls;
	int sugar;
	int items = 4;
	int heat;
		
	//boba constructor
	public Boba(String flavor, int size, int temp, boolean hasMilk, boolean hasSugar, boolean hasPearls) {
		super(size, temp); //inherit from parent
		this.flavor=flavor;
		this.hasMilk=hasMilk;
		this.hasSugar=hasSugar;
		this.hasPearls=hasPearls;
	}//close construct
	
	//straw interface
	@Override
	public boolean needsStraw(){
		System.out.println("Needs Straw? " + true);
		return true;
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
		return "Boba\nFlavor: " + flavor + "\nSize(Ounces): " + getSize() + "\nTemperature (Celcius): " + getTemp() + "\nMilk? " + hasMilk + "\nSugar? " + hasSugar + "\nPearls? " + hasPearls + "\n" + ratio();
	}//close string
}//close boba
