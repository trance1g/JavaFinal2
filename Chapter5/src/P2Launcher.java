import java.util.*;
public class P2Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instantiate scanner and new object class
		Scanner keyboard = new Scanner(System.in);
		P2 num1 = new P2();

		// local variables for input
		int input = 0;
		boolean test = true;
		
		

		while(test){
		// give initial directions to user and get input
			System.out.println("Enter the speed you traveled at.");
			input = keyboard.nextInt();
			
			if(input >= 0){
				test = false;
				num1.setSpeed(input);
			}
			System.out.println("");
		}
		test = true;

		
		while(test){
			// give initial directions to user and get input
				System.out.println("Enter the time you traveled.");
				input = keyboard.nextInt();
				
				if(input >= 0){
					test = false;
					num1.setTime(input);
				}
				System.out.println("");
			}
			test = true;

		

	num1.getDistance();
		

		keyboard.close();// close keyboard scanner
	}

}
