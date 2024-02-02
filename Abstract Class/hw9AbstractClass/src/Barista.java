/*
* Name:    Asma Ahmed 
* Date:    7/14/20
* Purpose: Demonstrate ability to create abstract classes and methods
* 		   Demonstrate ability to use concrete and abstract methods in an abstract class
* 		   Demonstrate ability to use abstract methods to impose rules on all child classes
* Notes:   Windows Machine
* 		   Test Class: Barista
* 		   Abstract parent class (Drink) has a size, a temperature, and a ratio (abstract method)
* 		   Child Class (Tea) extends (Drink) has type, size, temperature, and ratio
* 		   Child Class (Coffee) extends (Drink) and has  roast, size, temperature, cream, sugar, and ratio
* 		   Child Class (Boba) extends (Drink) and has flavor, size, temperature, milk, sugar, pearls, and ratio
* 		   Abstract method: each drink sub-category has its own ratio
*/


//test class Barista 
public class Barista {

	public static void main(String[] args) {
		
		//tea test
		//(Type, size, temperature)
		Tea t1 = new Tea("oolong", 14, 100);
        System.out.println(t1);

        //coffee test
        //(roast, size, temperature, cream, sugar)
        Coffee c1 = new Coffee("Dark", 12, 100, true, false);
        System.out.println(c1);
        
        //boba test 
        //(flavor, size, temperature, milk, sugar, pearls)
        Boba b1 = new Boba("Milk Tea", 12, 0, true, false, true);
        System.out.println(b1);
	}//close main	
}//close Barista 
