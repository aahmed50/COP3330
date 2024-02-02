/*
* Name:    Asma Ahmed 
* Date:    7/7/20
* Purpose: Demonstrate ability to use utilize inheritance and IS A and HAS A relationships
* Notes:   Windows Machine
*/

//bird class
public class Bird extends Animal{

	/*
	 * Bird is an Animal >> extend animal (child)
	 * Birds have wing spans
	 * Birds have a canFly which is true or false (some birds cannot fly) 
	 * */
	
	//variables
	private double wingSpan;
	private Boolean canFly;

	//bird construct
	Bird(double wingSpan, Boolean canFly, double weight, double height) {
	    
		//access superclass constructor
		super(weight, height);
	    
	    setWingSpan(wingSpan);
	    setCanFly(canFly);
	    } //close constructor
	   
	//get/set wing span
	public double getWingSpan() {
	    return wingSpan;
	    } //close getWingspan

	public void setWingSpan(double wingSpan) {
	    this.wingSpan = wingSpan;
	    } //close setWingspan

	//get/set flight
	public Boolean getCanFly() {
	    return canFly;
	    } //close getcanFly

	public void setCanFly(Boolean canFly) {
	    this.canFly = canFly;
	    } //close setCanFly

	//override toString() method
	@Override

	public String toString() {
	    return "Bird\nWing Span: "+getWingSpan()+"\nFly: "+getCanFly()+"\nHeight: "+getHeight()+"\nWeight: "+getWeight()+"\n";
	}//close toString  
}//close bird