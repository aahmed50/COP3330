/*
* Name:    Asma Ahmed 
* Date:    7/7/20
* Purpose: Demonstrate ability to use utilize inheritance and IS A and HAS A relationships
* Notes:   Windows Machine
*/

public class TestFile {
	public static void main(String[] args) {
		
		//call dog/cat/bird classes
		Dog d= new Dog("Rose", "Golden Retriever", "11/23/2004", 84.5, 38.5);
		Cat c=new Cat("Meme", "9", 4.0, 10.9);
		Bird b= new Bird(1.3, true, 4.15, 31);

		// String() Method to print
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
			 
	}//close main method
}//close public class
