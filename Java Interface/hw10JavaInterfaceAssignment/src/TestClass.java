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
* 		   Interfaces: Content (sugar content), Time (brewing time = heat needed * number of items), Straw (boolean)
*/

public class TestClass {
	public static void main(String[] args) {
		
		//tea test
		//(Type, size, temperature)
		Tea t1 = new Tea("oolong", 14, 100);
        System.out.println(t1);
        t1.needsStraw();
        t1.sugarContent(0);
        t1.heatTimeNeeded(2);

        //coffee test
        //(roast, size, temperature, cream, sugar)
        Coffee c1 = new Coffee("Dark", 12, 100, true, false);
        System.out.println(c1);
        c1.needsStraw();
        c1.sugarContent(20);
        c1.heatTimeNeeded(2);
        
        //boba test 
        //(flavor, size, temperature, milk, sugar, pearls)
        Boba b1 = new Boba("Milk Tea", 12, 0, true, false, true);
        System.out.println(b1);
        b1.needsStraw();
        b1.sugarContent(60);
        b1.heatTimeNeeded(1);
	}//close main	
}//close TestClass
