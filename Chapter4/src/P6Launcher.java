import java.util.*;
import java.text.*;
public class P6Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initializing scanner
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("#0.00");
		
		//instantiate object
		P6 total = new P6();
		
		//get input for the variables
		System.out.println("Enter the weight of the package you are sending: ");
		total.setWeight(keyboard.nextDouble());
		System.out.println("Enter the distance you are shipping the item: ");
		total.setMiles(keyboard.nextDouble());
		
		//display output
		System.out.println("The total cost of the shipment is $" + f.format(total.CalculateCharges()));
		
		keyboard.close();
	}

}
