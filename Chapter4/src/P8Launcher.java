import java.util.*;

public class P8Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate scanner object and 3 new objects
		Scanner keyboard = new Scanner(System.in);
		
		P8 runner1 = new P8();
		P8 runner2 = new P8();
		P8 runner3 = new P8();
		
		//get input for program
		System.out.println("Enter your name: ");
		runner1.setName(keyboard.nextLine());
		System.out.println("Enter the time, in minutes, that it took to run the race.");
		runner1.setTime(keyboard.nextDouble());
		keyboard.nextLine();
		System.out.println("Enter your name: ");
		runner2.setName(keyboard.nextLine());
		System.out.println("Enter the time, in minutes, that it took to run the race.");
		runner2.setTime(keyboard.nextDouble());
		keyboard.nextLine();
		System.out.println("Enter your name: ");
		runner3.setName(keyboard.nextLine());
		System.out.println("Enter the time, in minutes, that it took to run the race.");
		runner3.setTime(keyboard.nextDouble());
		 //conditional statements for the positions of the runners
		if(runner1.getMinutes() < runner2.getMinutes()){
			if(runner1.getMinutes() < runner3.getMinutes()){
				if(runner2.getMinutes() < runner3.getMinutes()){
					System.out.println("First place: " + runner1.getName() + " with a time of " + runner1.getMinutes() + " minutes. \nSecond place was " + runner2.getName() + " with a time of " + runner2.getMinutes() + " minutes. \nAnd is last place, " + runner3.getName() + " with a time of" + runner3.getMinutes() + "  minutes.");
				}else{
					System.out.println("First place: " + runner1.getName() + " with a time of " + runner1.getMinutes() + " minutes. \nSecond place was " + runner3.getName() + " with a time of " + runner3.getMinutes() + " minutes. \nAnd is last place, " + runner2.getName() + " with a time of" + runner2.getMinutes() + "  minutes.");
				}
			}else {
				System.out.println("First place: " + runner3.getName() + " with a time of " + runner3.getMinutes() + " minutes. \nSecond place was " + runner1.getName() + " with a time of " + runner1.getMinutes() + " minutes. \nAnd is last place, " + runner2.getName() + " with a time of" + runner2.getMinutes() + "  minutes.");			}
		}else{
			if(runner2.getMinutes() < runner3.getMinutes()){
				if(runner3.getMinutes() < runner1.getMinutes()){
				System.out.println("First place: " + runner2.getName() + " with a time of " + runner2.getMinutes() + " minutes. \nSecond place was " + runner3.getName() + " with a time of " + runner3.getMinutes() + " minutes. \nAnd is last place, " + runner1.getName() + " with a time of" + runner1.getMinutes() + "  minutes.");
			}else{
				System.out.println("First place: " + runner1.getName() + " with a time of " + runner2.getMinutes() + " minutes. \nSecond place was " + runner1.getName() + " with a time of " + runner1.getMinutes() + " minutes. \nAnd is last place, " + runner3.getName() + " with a time of" + runner3.getMinutes() + "  minutes.");
			}
			}
			else{
				System.out.println("First place: " + runner3.getName() + " with a time of " + runner3.getMinutes() + " minutes. \nSecond place was " + runner2.getName() + " with a time of " + runner2.getMinutes() + " minutes. \nAnd is last place, " + runner1.getName() + " with a time of" + runner1.getMinutes() + "  minutes.");
			}
		}
	}}

	

	
