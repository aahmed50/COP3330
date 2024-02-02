/*
* Name:    Asma Ahmed 
* Date:    7/26/20
* Purpose: Demonstrate the ability to apply polymorphism in a Java program.
* Notes:   Windows Machine	   
*/

//main method
public class Main {
	public static void main (String[] args) {
		
		Baseball hank = new Baseball("Hank",22,"Knights","pitcher", "right handed");
        Football terry = new Football("Terry",25,"Knights","quarterback", "offense");
        Hockey mario = new Hockey("Mario",23,"Knights","goalie","Brand 1");
        Golfer paula = new Golfer("Paula",34,"Knights","0","AbolishGolf");
        Soccer danilo = new Soccer("Danilo",33,"Knights","idk soccer positions","midFielder");
        
        Baseball barry = new Baseball("Barry",32,"Gators","second base","left handed");
        Football peyton = new Football("Peyton ",23,"Gators","quarterback", "defense");
        Hockey wayne = new Hockey("Wayne",44,"Gators","offence","Brand 2");
        Golfer phil = new Golfer("Phil",66,"Gators","2","WeHaveProgressedBeyondtheNeed4Golf");
        Soccer carlos = new Soccer("Carlos",22,"Gators","yeah","goalKeeper");
        
        //Call each sport's doThis method (one at a time) passing each player.
        //Call the toString methods for each player object.
        hank.doThis(); //baseball
        System.out.println(hank);
        
    	terry.doThis(); //football
        System.out.println(terry);
        
    	mario.doThis(); //hockey
        System.out.println(mario);
        
    	paula.doThis(); //golf
        System.out.println(paula);
        
    	danilo.doThis(); //soccer
        System.out.println(danilo);
        
    	barry.doThis(); //baseball
        System.out.println(barry);
        
    	peyton.doThis(); //football
        System.out.println(peyton);
        
    	wayne.doThis(); //hockey
        System.out.println(wayne);
        
    	phil.doThis(); //golf
        System.out.println(phil);
        
    	carlos.doThis(); //soccer
        System.out.println(carlos);
	}//close void main
}//close main class
