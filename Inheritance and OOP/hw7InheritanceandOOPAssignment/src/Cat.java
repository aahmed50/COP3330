/*
* Name:    Asma Ahmed 
* Date:    7/7/20
* Purpose: Demonstrate ability to use utilize inheritance and IS A and HAS A relationships
* Notes:   Windows Machine
*/

//cat class
public class Cat extends Animal{

	/*
	 * Cat is an Animal >> extend animal (child)
	 * Cats have Names
	 * Cats have 9 lives
	 */
	
	//variables
	private String name;
	private String lives;
	   
	//cat construct
	Cat(String name, String lives, double weight, double height) {

		//access superclass constructor
	    super(weight, height);
	    setName(name);
	    setLives(lives);
	    
	    }//close constructor

	//get/set name
	public String getName() {
	   return name;
	   }//close getName

	public void setName(String name) {
	    this.name = name;
	    }//close setName
	
	//get/set lives
	public String getLives() {
		   return lives;
		   }//close getLives

		public void setLives(String lives) {
		    this.lives = lives;
		    }//close setLives

	   //override toString() method
	   @Override

	   public String toString() {
	       return "Cat\nName: "+getName()+"\nLives: "+getLives()+"\nHeight: "+getHeight()+"\nWeight: "+ getWeight()+"\n";
	   }//close toString
	}//close cat