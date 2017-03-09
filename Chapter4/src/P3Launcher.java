import java.util.*;
public class P3Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		//declare variables
		double inputTest1;
		double inputTest2;
		double inputTest3;
		
		//show output
		System.out.println("Enter a test score 1: ");
		inputTest1 = keyboard.nextDouble();
		System.out.println("Enter a test score 2: ");
		inputTest2 = keyboard.nextDouble();
		System.out.println("Enter a test score 3: ");
		inputTest3 = keyboard.nextDouble();
		
		//instantiate object
		P3 num1 = new P3(inputTest1, inputTest2, inputTest3);
		num1.getScore(inputTest1);		
		
		
		
		
		
		keyboard.close();
	}

}
