import java.util.*;
import java.text.*;
public class P5Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate scanner object
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat();
		
		//instantiate object
		P5 num1 = new P5();
		
		//get input from user
		System.out.println("Please enter the number of checks you need, then hit enter.\nThen type in your account balance, then hit enter again.");
		
		//show output
		num1.getCheck(keyboard.nextDouble(), keyboard.nextDouble());
		
		

	}

}
