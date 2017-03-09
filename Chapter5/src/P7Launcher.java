import java.util.*;
import java.text.*;
public class P7Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiates scanner and decimal format methods for output
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat();
		
		//instantiate new object
		P7 obj1 = new P7();
		
		//local variables for math
		double years = 0;
		double inches = 0;
		double totalInches = 0;
		double months = 12;
		double average = 0;
		
		//gets input to be used by the program for math, used for calculations
		System.out.println("How many years? ");
		years = keyboard.nextDouble();
		while(years < 1){
			System.out.println("You have entered an invalid value. Please try again.");
			years = keyboard.nextDouble();
		}
		
		//this is the loop that shows how many years were entered and will loop for each month for however many years are entered
		for(int number = 1; number <= years; number++){
			
			for(int number2 = 1; number2 <= months; number2++){
				System.out.println("How many inches of ranfall for year "+ number+", month " + number2);
				inches = keyboard.nextDouble();
				while(inches < 0){
					System.out.println("You have entered a negative value, please try again.");
					inches = keyboard.nextDouble();
				}
				totalInches += inches;
			}
		}
		obj1.setYears(years);
		obj1.setTotalInches(totalInches);
		
		//showing output to the user
		System.out.println("The average rainfall for the period was: " + obj1.calcAvg());
		
		

	}

}
