import java.util.*;
public class P11Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		P11 num1 = new P11();
		
		System.out.println("Package A is $39.99/month with $0.45 being charged per minute after 450.");
		System.out.println("Package B is $59.99/month with $0.40 being charged per minute after 900.");
		System.out.println("Package C is $69.99/month with unlimited minutes provided.");

		System.out.println("Enter 1 for package A, 2 for package B, or 3 for package C.");
		num1.setPackage(keyboard.nextDouble());
		System.out.println("Then enter the number of minutes you would like to use per month: ");
		num1.setMinutes(keyboard.nextDouble());
		
		num1.CalculateMonthlyCharge();
		
		
		keyboard.close();
	}

}
