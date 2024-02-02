/*
* Name:    Asma Ahmed 
* Date:    7/8/20
* Purpose: Demonstrate ability to use utilize inheritance and IS A and HAS A relationships
* Notes:   Windows Machine
*/

//If you choose Animal, you will create a subclass of Animal called Horse.
//Animal has a name, age, and height
//Horse is an Animal and has a name, age, height, breed, hands, and isFoal

//test class Farmer
public class Farmer {

	 //main method
	 public static void main(String[] args) {

	//ANIMALS
         Animal a1 = new Animal("Kim Namjoon", 26, 181);
         Animal a2 = new Animal("Kim Seokjin", 28, 179);
         Animal a3 = new Animal("Min Yoongi", 27, 173);
         
 		 // String() Method to print
         System.out.println(a1);
         System.out.println(a2);
         System.out.println(a3);
         
    //HORSES
         Horse h1 = new Horse("Jung Hoseok", 26, 177, "Arabian", 4, false);
         Horse h2 = new Horse("Park Jimin", 25, 172, "Akhal-Teke", 5, false);
         Horse h3 = new Horse("Kim Taehyung", 25, 179, "Cob", 6, true);
         Horse h4 = new Horse("Jeon Jungkook", 23, 178, "Appaloosa", 7, true);
        
 		 // String() Method to print
         System.out.println(h1);
         System.out.println(h2);
         System.out.println(h3);
         System.out.println(h4);

	 }//close main method
}//close Farmer
