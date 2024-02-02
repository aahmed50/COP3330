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


//Parent class (drink)
abstract class Drink implements Content{

	//variables
	private int size;
	private int temp;
	
	//drink construct
	public Drink(int size, int temp) {
		setSize(size);
		setTemp(temp);
		}//end  construct

	//call abstract method: each drink sub-category has its own ratio
	abstract public String ratio();
	
	//get/set size
	public int getSize() {
	      return size;
	      }

	public void setSize(int size) {
	     this.size = size;
	   	 }
	
	 //get/set temperature
	 public int getTemp() {
	     return temp;
	     }

	 public void setTemp(int temp) {
	     this.temp = temp;
	   	 }	
}//close Drink lid
