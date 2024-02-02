/*
* Name:    Asma Ahmed 
* Date:    7/14/20
* Purpose: Demonstrate ability to create abstract classes and methods
* 		   Demonstrate ability to use concrete and abstract methods in an abstract class
* 		   Demonstrate ability to use abstract methods to impose rules on all child classes
* Notes:   Windows Machine
*/

//abstract parent class (drink)
abstract class Drink {

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
