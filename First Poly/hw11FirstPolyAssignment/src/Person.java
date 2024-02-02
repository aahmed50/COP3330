//parent class Person
//person has a name and age
abstract class Person {

	//list variables 
	String name;
	int age;

	//person constructor
	Person(String name,int age){
		this.name=name;
		this.age=age;
		}//close construct
	
	//output
	public String toString(){
		return("Name: "+name+"\nAge: "+age);
    }//close toString
}//close person
