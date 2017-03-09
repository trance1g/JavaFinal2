import java.util.*;
public class P10Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instaqntiate scanner class and instanitate new object
		Scanner keyboard = new Scanner(System.in);
		P10 num1 = new P10();
		//get input
		System.out.println("Please enter a temperature: ");
		//displays option based on input
		num1.getTemperature(keyboard.nextDouble());
		
		keyboard.close();
		
		
		
	}

}
