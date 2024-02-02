/*
* Name:    Asma Ahmed 
* Date:    7/7/20
* Purpose: Demonstrate ability to use utilize inheritance and IS A and HAS A relationships
* Notes:   Windows Machine
*/

//animal class (Parent Class)
public class Animal {
	/*
	 * Animals have a Weight.
	 * Animals have a Height.
	 */
	
	//declare variables
	private double weight;
	private double height;

	//animal construct
	Animal(double weight, double height) {
	    setWeight(weight);
	    setHeight(height);
	    }//close animal construct

  //get/set weight
	public double getWeight() {
	    return weight;
	    }//close getWeight 
	   
	public void setWeight(double weight) {
	    this.weight = weight;
	    }//close setWeight

	//get/set height
	public double getHeight() {
	       return height;
	       }//close getHeight

	   public void setHeight(double height) {
	       this.height = height;
	       }//close setHeight
}
