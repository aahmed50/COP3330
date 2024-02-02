//sports inherit from Athlete, which inherits from Person
//all sport type objects have a method named doThis();

//BASEBALL CLASS
class Baseball extends Athlete{

	//variables
	private String battingPosition;
	
	//constructor 
	Baseball(String name, int age,String team, String position, String battingPosition){
		super(name,age,team,position); //inherits athlete, person 
		
		//determine batting position
		//Baseball players either bat left handed, right handed or both.
		this.battingPosition=battingPosition;
		}//close constructor
	
	//display batting position 
	public String toString(){
          return(super.toString()+"\nBatting Position: "+battingPosition + "\n");
          }//end toString
	
	//doThis() function 
	@Override
	void doThis() {
	System.out.println("I hit something.");
	}//close doThis
}//close Baseball 

//FOOTBALL CLASS
class Football extends Athlete{
	
	//variables 
	private String specialty;
	
	//constructor 
	Football(String name,int age,String team,String position, String specialty){
		super(name,age,team,position); //inherits from athlete, person
		
		//determine specialty
		// A football player's specialty is either Offense, Defense, or Special Teams
		this.specialty=specialty;
		}//close constructor 
	
	//display specialty
	public String toString(){
          return(super.toString()+"\nSpeciality: "+specialty + "\n");
          }//end toString
	
	//doThis() function 
	@Override
	void doThis() {
	System.out.println("I tackle something.");
	}//close doThis
}//close Football

//HOCKEY CLASS
class Hockey extends Athlete{
	
	//variables 
	private String stickBrand;
	
	//constructor 
	Hockey(String name,int age,String team,String position,String stickBrand){
		super(name,age,team,position); //inherits athlete, person 
		this.stickBrand=stickBrand;
		}// close constructor

	//display brand
	public String toString(){ 
		return(super.toString()+"\nStick Brand: "+stickBrand + "\n");
		}//close toString

	//doThis() function 
	@Override
	void doThis() {
		System.out.println("I sit in a penalty box.");
	}//close doThis
}//close hockey

//GOLFER CLASS
class Golfer extends Athlete{
	
	//variables
	private String mainSponsor;
	
	//constructor 
	Golfer(String name,int age,String team,String position,String mainSponsor){
		super(name,age,team,position); //inherits athlete, person 
		this.mainSponsor=mainSponsor;
		}//close construct 
	
	//display sponsor
	public String toString(){
		return(super.toString()+"\nMain Sponsor: "+mainSponsor + "\n");
		}//close toString
	
	//doThis() function 
	@Override
	void doThis() {
		System.out.println("I putt it in the hole.");
	}//close doThis
}//close golf

//SOCCER CLASS
class Soccer extends Athlete{

	//variables
    private String fieldPosition ;

    //constructor
    public Soccer(String name, int age, String team, String position, String fieldPosition){

          super(name,age,team,position); //inherits athlete, person
          //  A soccer player has these possible positions - goalKeeper, defender, midFielder, or forward
          this.fieldPosition = fieldPosition;
          }//close constructor 

    //display field position 
    public String toString(){
    	return(super.toString()+"\nField position: "+fieldPosition + "\n");
    	}//close toString
    
	//doThis() function 
    @Override
    public void doThis() {
          System.out.println("I kick the ball.");
    }//close doThis
}//close soccer
