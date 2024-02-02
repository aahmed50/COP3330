/*
* Name:    Asma Ahmed 
* Date:    7/7/20
* Purpose: Demonstrate ability to use utilize inheritance and IS A and HAS A relationships
* Notes:   Windows Machine
*/

//dog class
public class Dog extends Animal{

	/*
	* Dog is an Animal >> extend animal (child)
	* Dogs have Names
	* Dogs have Breeds
	* Dogs have dates of births (DOB)
	*/
	
	//variables
	private String name;
	private String breed;
	private String dob;

	//dog construct
	Dog(String name, String breed, String dob, double weight, double height) {

		//access superclass constructor
	    super(weight, height);

	    setName(name);
	    setBreed(breed);
	    setDob(dob);
	    }//close constructor

	//get/set name
	public String getName() {
	    return name;
	    }

	public void setName(String name) {
	    this.name = name;
	    }

	//get/set breed
	public String getBreed() {
	    return breed;
	    }

	public void setBreed(String breed) {
	    this.breed = breed;
	    }

	//get/set DOB
	public String getDob() {
	    return dob;
	    }

	public void setDob(String dob) {
	    this.dob = dob;
	    }
	   
	//override toString() method
	@Override

	public String toString(){
	    return "Dog\nName: "+getName()+"\nBreed: "+getBreed()+"\nDOB: "+getDob()+"\nHeight: "+getHeight()+"\nWeight: "+getWeight()+"\n";
	    }//close toString	   
}//close dog