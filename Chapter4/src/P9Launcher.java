import java.util.*;
import java.text.*;
public class P9Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate scanner and decimal format classes
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat();
		
		P9 speed = new P9();
		//local variables and get input
		String choice = "";
		int temp = 0;
		int num = 0;
		System.out.println("Enter a distance to be calculated.");
		speed.setFeet(keyboard.nextDouble());
		
		//conditional statement for the choice entered
		while(temp != 1){
			System.out.println("Please enter either 1 for air, water, or steel to dislay a speed of sound for that material.");
			num = keyboard.nextInt();
		if(num == 1){
			temp = 1;
			choice = f.format(speed.getSpeedInAir()) + " seconds in the air";
		}else if(num == 2){
			temp = 1;
			choice = f.format(speed.getSpeedInWater()) + " seconds in water";
		}else if(num == 3){
			temp = 1;
			choice = f.format(speed.getSpeedInSteel()) + " seconds in steel";
		}else{
			System.out.println("You didnt enter a valid entry. Please try again.");
			}
		}
		//display output
		System.out.println("It would take " + choice);
		
		//close keyboard scanner
		keyboard.close();

	}

}
