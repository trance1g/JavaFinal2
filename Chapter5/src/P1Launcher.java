import java.util.Scanner;

public class P1Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate scanner and new object class
		Scanner keyboard = new Scanner(System.in);
		
		//local variables for input
		int input = 0;
		int sum = 0;
		
		//give initial directions to user and get input
		System.out.println("Enter any number above 0, that is a whole value");
		input = keyboard.nextInt();
		keyboard.nextLine();
		
		//while loop for if the value is positive
		while(input < 1){
			System.out.println("Enter a positive value");
			input = keyboard.nextInt();
			keyboard.nextLine();
			
		}
		//for loop for adding the values together
		for(int number = 1; input >= number; number++){
			sum += number;
		}
		
		//displaying output
		System.out.println("The sum of all of the numbers below and including " + input + " is " + sum);
		
		keyboard.close();//close keyboard scanner

	}

}
