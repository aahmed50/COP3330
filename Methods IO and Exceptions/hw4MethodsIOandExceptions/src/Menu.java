/*
* Name:    Asma Ahmed 
* Date:    6/17/20
* Purpose: Menu driven program that:
* 		   1. reads user's name and display it back 20x
* 		   2. reads user's age and display it doubled + state if teenager or not based on input
* 		   3. read a single integer from 3 & 50 & create a triangle + display on screen and text file
* Notes:   Text file named triangle.txt 
* 		   End do with while
* 		   Windows Machine
*/

//scanner class to take input from user to be used in the program
import java.util.Scanner;
import java.io.*;

public class Menu {

	//triangle function
	 private static void printTriangle(int size) throws FileNotFoundException {
	       char ch='*';
	       File triangle = new File("triangle.txt");
	       PrintWriter notes = new PrintWriter(triangle);
	       for (int a = 0; a < 2 * size - 1; a++) {
	           if (a % 2 == 0) {
	               for (int b = 0; b < (2 * size - 1) - a; b++) {
	                   System.out.print(" ");
	                   notes.print(" ");
	               }

	               for (int c = 0; c <= a; c++) {
	                   System.out.print(ch+" ");
	                   notes.print(ch+" ");
	               }
	               System.out.println();
	               notes.println();
	           }
	       }
	      notes.close();
	   }//close triangle
	 
   public static void main(String[] args) throws FileNotFoundException {
       
	   //user input
       Scanner inputNum = new Scanner(System.in);
      
       
       int option;
       do
       {
    	   //prompt user
    	   System.out.println("|MENU|");
    	   System.out.println("1: Print Name 20x");
    	   System.out.println("2: Your age Doubled");
    	   System.out.println("3: Are you a teenager?");
    	   System.out.println("4: Make a Triangle");
    	   System.out.println("5: EXIT");
    	   System.out.print("Select an Option:");
       
    	   option = inputNum.nextInt();
    	   inputNum.nextLine();
       
    	   switch (option) {
      
    	   //print name 20x (1)
    	   case 1: {
   	   
    		   System.out.print("Enter your name:");
    		   String name=inputNum.nextLine();
          
    		   //loop until repeated 20 times
    		   for(int i=1;i<=20;i++)
    		   {
    			   System.out.println(name);
    		   }
    		   break;
    	   }
      	
    	   //double age (2)
    	   case 2: {
    		   int age;
    		   System.out.print("Enter age:");
    		   age=inputNum.nextInt();
    		   System.out.println("Your age:"+age);
    		   System.out.println("Your age doubled:"+(2*age));
    		   
    		   break;
    	   }

       
    	   //determine if teenager (3)
    	   case 3: {
    		   int age;
    		   System.out.print("Enter age :");
    		   age=inputNum.nextInt();
          
    		   if(age>=13 && age<=19) //within parameters = teenager
    		   {
    			   System.out.println("You are "+age+" years old. Therefore, you are a Teenager");
    		   }
    		   else //outside parameters = not teenager
    		   {
    			   System.out.println("You are "+age+" years old. Therefore, you are not a Teenager");
    		   }
        	  break;
    	   }

    	   //triangle (4)
    	   case 4: {
    		   int rows; //rows as the value of the user's input
    		   do
    		   {
    			   System.out.print("Enter a number between 3 and 50:");
    			   rows=inputNum.nextInt();
           
    			   if(rows<3 || rows>50)
    			   {
    				   System.out.println("ERROR: Number must be be between 3 and 50");
         	 }
    		   }while(rows<3 || rows>50);
    		   printTriangle(rows);
    		   break;
    	   }
       
    	   //exit
    	   case 5:{
    		   break;
    	   }
    	   default: {
    		   System.out.println("** Invalid Choice **");
    		   break;
    	   }

    	   }  //close switch
       }while(option!=5);//close do. Do while input is not 5
       //close user inputs
       inputNum.close();
   }//close main
}//close menu