/*
* Name:    Asma Ahmed 
* Date:    7/8/20
* Purpose: Demonstrate ability to use utilize inheritance and IS A and HAS A relationships
* Notes:   Windows Machine
*/

//has a name age height
//animal class (Parent Class)
public class Animal {
	   
	//declare variables
	String name;
	int age;
	int height;
	   
	//animal constructor
	public Animal(String name, int age, int height) {
	    this.name = name;
	    this.age = age;
	    this.height = height;
	   	}//end construct
	  
	public Animal()//overloaded method of constructor in hierarchy
	{}

	//override toString() method
	   @Override
	   public String toString() {
	       return "Animal \nName: " + name + " \nAge: " + age + " \nHeight: " + height + "\n";
	   }

	   //get/set height
	   public int getHeight() {
	       return height;
	       }

	   public void setHeight(int height) {
	       this.height = height;
	   	   }

	   //get/set name
	   public String getName() {
	       return name;
	   	   }

	   public void setName(String name) {
	       this.name = name;
	   	   }

	   //get/set age
	   public int getAge() {
	       return age;
	   	   }

	   public void setAge(int age) {
	       this.age = age;
	   	   }
	  
}//close animal