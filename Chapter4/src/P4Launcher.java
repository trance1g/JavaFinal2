import java.util.*;

public class P4Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize scanner
		Scanner keyboard = new Scanner(System.in);
		
		//instantiate object
		P4 num1 = new P4();
		
		//display the output
		System.out.println("How many packages would you like to buy? ");
		num1.getDiscount(keyboard.nextDouble());
	}

}
