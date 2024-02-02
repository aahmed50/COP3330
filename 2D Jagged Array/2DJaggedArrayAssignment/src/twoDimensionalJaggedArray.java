/*
* Name:    Asma Ahmed 
* Date:    6/25/20
* Purpose: Design a menu system, 1D array, 2D array, and jagged array
* Notes:   Windows Machine
* 		   Function = Method
* 		   Assume that the row index represents one individual student
* 		   Assume that the column index represents each exam score
*/

import java.util.Scanner; //take input
import java.text.DecimalFormat; //format decimals


public class twoDimensionalJaggedArray {

	private static int students[][] = new int[25][]; //create jagged array
	private static DecimalFormat df = new DecimalFormat("0.00"); //Format to decimal place for clarity
	
	public static void main(String[] args) {
		//declare main menu variables
		int option;
		int examCap=0;//cap
		int index=0;//set index to 0
		Scanner inputNum=new Scanner(System.in);//take input
		
		do //do while loop
		{
			//print menu
			System.out.println("[Select Option]");
			System.out.println("1: Input Grades");
			System.out.println("2: Display Average Grade by Student");
			System.out.println("3: Display Average Grade by Exam");
			System.out.println("4: Display Current Class Average for all Exams");
			System.out.println("5: EXIT"); //quit menu
			
			//set option to user input
			option=inputNum.nextInt();
			
			//menu switch case
			switch (option) {
			
			//OPTION 1: take input
			case 1: 
			{
				//ask user for number of exams
				System.out.println("Enter number of exams taken:");
				int examNum=inputNum.nextInt();//take input
				students[index]=new int[examNum];//create index
				
				//ask user for exam scores per number of exams
				System.out.println("Enter exam scores:");
				if(examCap<examNum)
					examCap=examNum;
				
				for(int a=0; a<examNum; a++)
				{
					students[index][a]=inputNum.nextInt();
				}//close for
				index++;
				break;
			}//end choice 1

			//OPTION 2: calculate average to display by student
			case 2:
			{
				//calculate average by student 
				System.out.println("[Exam Average by Student]");
				System.out.println("Student Id\tAverage Score");
				for(int a=0; a<index; a++)
				{
					System.out.printf("   "+(a+1)+"\t\t   "); //spacing for formatting
					int sum=0;
					//calculate sum
					for(int b=0; b<students[a].length; b++)
					{
						sum=sum+students[a][b];
					}//close for
					
					double avg=sum/students[a].length;//calculate average from array
										
					System.out.printf(df.format(avg));
					System.out.println();
				}//close for
				break;
			}//end choice 2
			
			//OPTION 3: calculate average to display by exam
			case 3:
			{
				//calculate average by exam number
				System.out.println("[Exam Average by Exam Number]");
				System.out.println("Exam Number\tAverage Score");
				for(int a=0; a<examCap; a++)
				{
					int sum=0,total=0;
					for(int b=0; b<index; b++)
					{
						if(students[b].length>=a+1)
						{
							total++;
							sum=sum+students[b][a];
						}//close if
					}//close for
					
					double avg=sum/total; //calculate average
					System.out.printf("   "+(a+1)+"\t\t   ");
					System.out.printf(df.format(avg));
					System.out.println();
				}//close for
				break;
			}//end choice 3
			
			//OPTION 4: total average across all exams
			case 4:
			{
				System.out.println("[Class Average]");
				int sumAll=0;
				for(int a=0; a<index; a++)
				{
					int sum=0;
					for(int b=0; b<students[a].length; b++)
					{
						sum=sum+students[a][b];
					}
					double avg=sum/students[a].length;
					sumAll+=avg;
				}//close for
				
				double avgTotal=sumAll/index;
				System.out.println("The Current Class Average for all Exams is "+df.format(avgTotal));
				System.out.println();
			}//end choice 4
			
			case 5:
			{
				break;
	    	}//end case 5
			
		}//close switch
		}while(option!=5); //end do
		//close user input
		inputNum.close();
	}//end main
}//end class