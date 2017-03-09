import java.util.*;
import java.text.*;
public class P7Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate scanner decimalformat and new objects
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat();
		P7 input = new P7();
		//get input
		System.out.println("Enter an amount of calories for the food: ");
		input.setCal(keyboard.nextDouble());
		System.out.println("Enter the grams of fat for the food: ");
		input.setFat(keyboard.nextDouble());
		
		//run calculation method which displays output
		input.CalculateFat();
		
		

	}

}
