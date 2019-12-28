import javax.swing.JOptionPane; // import appropriate classes
import java.util.Scanner;
public class FinalGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in); // creates a Scanner object
		
		double current_grade; // variable stores the student's current grade
		double goal ; // variable stores the student's desired grade
		double f_exam; // variable stores the weight of the final exam
		double required; // variable store the required grade on the final exam to reach that desired grade
		
		int choice = 1;
		
		
		JOptionPane.showMessageDialog(null, "Welcome to Emmanuel's Final Grade Calculator !"); // welcome message
		
		do {
		System.out.print("Please enter your current grade (the percentage) : ");
		current_grade = console.nextDouble(); // takes the current grade as input
		
		System.out.print("Please enter your goal for this course (the percentage) : ");
		goal = console.nextDouble(); // takes the desired grade as input
		
		System.out.print("Your final exam is worth (the percentage) : ");
		f_exam = console.nextDouble(); // takes the weight of the final exam as input
		
		required = ((goal- current_grade *((100 - f_exam)/100))/f_exam)*100; // formula to get the required grade as a percentage
		double required_round = Math.round(required); // rounds the required grade
		
		System.out.println("Your current grade is: " + current_grade + " %"); // displays the user's current grade
		System.out.println("Your goal is : "+ goal + " %"); // displays the user's desired grade
		System.out.println("To achieve this goal you need to get " + required_round + " % on your final exam or on average in your remaining assignments"+ "\n"); // displays the required grade
		
		
		if(required < 50)
		{
			System.out.println("You just need " + required_round + " % , relax and have some fun !"); // message displayed if the required grade is lower than 50%
		}
		
		else if(required < 80 && required >= 50 )
		{
			System.out.println("You need " + required_round + " % , I am sure that you can do it !"); // message displayed if the required grade is above or equal to 50% and below 80%

		}
		
		else if(required >= 80 && required < 100 )
		{
			System.out.println("You need " + required + " % , it is a challenge, but don't give up. Good luck !");// message displayed if the required grade is above or equal to 80 % and below 100%
			

		}
		
		else
		{
			System.out.println("You  need " + required + " % , is it even reachable ?"); // message displayed if the required grade is above 100%, almost impossible to reach !!!

		}
	    
		System.out.println("So you want to continue ? If yes then enter 1 or any number, if no enter 0");
		
		choice = console.nextInt();
		
		}while(choice !=0);
		
		System.out.println("You have exited the grade calculator");
		JOptionPane.showMessageDialog(null, "Thank you for using Emmanuel's Final Grade Calculator !"); // welcome message

		
	console.close();
	}

}
