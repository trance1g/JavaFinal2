import java.util.*;
import java.text.*;
public class P6Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate scanner and decimal format classes to format the output
		DecimalFormat d1 = new DecimalFormat("#,##0");
		Scanner keyboard = new Scanner(System.in);
		//instantiate new object class
		P6 obj1 = new P6();
		
		//local variables
		double start = 0;
		double increase = 0;
		double days = 0;
		double population = 0;
		
		//loop for populations starting size, must be greater than 0
		System.out.println("Enter the population's starting size: ");
		start = keyboard.nextDouble();
		while(start < 2){
			System.out.println("You have entered an invalid value, please try again");
			start = keyboard.nextDouble();
		}
		//loop for populations increase size, must be greater than 0
		System.out.println("Enter the average daily population increase as a percent: ");
		increase = keyboard.nextDouble();
		while(increase < 0){
			System.out.println("You have entered an negative value, please try again");
			increase = keyboard.nextDouble();
		}
		//loop for days of increase, must be greater than 0
		System.out.println("Enter the number of days they will increase: ");
		days = keyboard.nextDouble();
		while(days < 1){
			System.out.println("You must enter a number larger than 1, please try again.");
			days = keyboard.nextDouble();
		}
		
		//using the methods to input information
		obj1.setPopulation(start);
		obj1.setStart(start);
		obj1.setIncrease(increase);
		obj1.setDays(days);
		
		//loop to show whether it was the first day or days after, and displays output accordingly
		for(double number = 1; number <= days; number++){
			if(number == 1){
				System.out.println("The daily poplulation with all factors taken into consideration is: " + d1.format(obj1.calcFirst()));
			}else{
			System.out.println("The daily poplulation with all factors taken into consideration is: " + d1.format(obj1.calcPop()));
			}
		}
		
		
		

	}

}
