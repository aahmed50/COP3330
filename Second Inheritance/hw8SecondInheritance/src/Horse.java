/*
* Name:    Asma Ahmed 
* Date:    7/8/20
* Purpose: Demonstrate ability to use utilize inheritance and IS A and HAS A relationships
* Notes:   Windows Machine
*/

// animal has a name age height 
// horse is an animal, has a breed hands isFoal
//horse subclass (child) >> extend Animal
public class Horse extends Animal {
	 
	//declare variables
	private String breed; //breed of horse
	private int hands; //horses are measured in hands
	private Boolean isFoal; //age of horse baby (foal) versus adult = true/false
	
	//Horse constructor
	public Horse(String name, int age, int height,  String breed, int hands, Boolean isFoal) {
	    super(name, height, age); //inherit from Parent
	    this.breed = breed;
	    this.hands = hands;
	    this.isFoal = isFoal;
	   }//end construct
	   
	//get/set breed
	public String getBreed() {
	    return breed;
	    }
	
	public void setBreed(String breed) {
	    this.breed = breed;
	    }
	   
	//get/set hands
	public int getHands() {
	    return hands;
	   	}
	   
	public void setHands(int hands) {
	    this.hands = hands;
	    }
	   
	//get/set isFoal
	public Boolean getDesignation() {
	    return isFoal;
	    }
	
	public void setDesignation(Boolean isFoal) {
	    this.isFoal = isFoal;
	    }
	
	//override toString() method
	@Override
	public String toString() 
	   {
	       return "Horse \nName: " + name + " \nAge: " + age + " \nHeight: " + height + " \nBreed: " + breed + " \nHands: " + hands + " \nFoal? "+ isFoal +"\n";
	   }
}//end horse
