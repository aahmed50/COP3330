//inherits Person
//athlete has a team and position
abstract class Athlete extends Person {

	//variables 
	String team;
	String position;
	
	//constructor 
	Athlete(String name,int age,String team,String position){
		super(name, age); //inherits from Person
		this.team=team;
		this.position=position;
		}//close construct 
	
	//toString inherits from Person and adds to it 
	@Override
	public String toString(){
		return(super.toString()+"\nTeam: "+team+"\nPosition: "+position);
    }//close toString

	abstract void doThis();
	
	//get/set position
	public String getPosition() {
		return position;
		}//close getPosition
	
	public void setPosition(String position) {
		this.position = position;
		}//close setPosition
	
	//get/set team
	public String getTeam() {
		return team;
		}//close getTeam
	
	public void setTeam(String team) {
		this.team = team;
		}//close setTeam
}//close Athlete 