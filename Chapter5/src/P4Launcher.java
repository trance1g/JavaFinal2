import java.util.*;
import java.text.*;
public class P4Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate scanner class to get input
		Scanner keyboard = new Scanner(System.in);
		//instantiate new object class
		P4 p4 = new P4();
		
		//get input
		System.out.println("Enter the number of days: ");
		p4.setDays(keyboard.nextDouble());
		
		//calling the getDollars method to do the math and show output
		p4.getDollars();
		
		//close keyboard scanner
		keyboard.close();

	}

}
