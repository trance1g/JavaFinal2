import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class P3Launcher {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// instantiate scanner and new object class
		Scanner keyboard = new Scanner(System.in);
		P3 num1 = new P3();
		// local variables for input
				int input = 0;
				boolean test = true;
				double distance;
				
				

				while(test){
				// give initial directions to user and get input
					System.out.println("Enter the speed you traveled at.");
					input = keyboard.nextInt();
					
					if(input >= 0){
						test = false;
						num1.setSpeed(input);
					}
					System.out.println("");
				}
				test = true;

				
				while(test){
					// give initial directions to user and get input
						System.out.println("Enter the time you traveled.");
						input = keyboard.nextInt();
						
						if(input >= 0){
							test = false;
							num1.setTime(input);
						}
						System.out.println("");
					}
					test = true;

				

		DecimalFormat n = new DecimalFormat("#0.0");
		PrintWriter p1 = new PrintWriter("output.txt");
		// displaying output
				p1.println("Hour \t\t Distance");
				p1.println("-------------------------------");
				for(double number = 1; number <= num1.getTime(); number++){
					distance = num1.getSpeed() * number;
					p1.println(number + " \t\t " + distance);
				
				}
		

		p1.close();
		

		keyboard.close();// close keyboard scanner
	}

}
