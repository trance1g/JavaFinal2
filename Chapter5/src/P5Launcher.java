import java.util.*;
import java.text.*;
public class P5Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate scanner and decimal format classes for formatting
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat d1 = new DecimalFormat(" #,##0.00 '%'");
		//instantiate new object class
		P5 num1 = new P5();
		
		//local variables for math
		double rooms = 0;
		double floors = 0;
		double occupiedRooms = 0;
		double totalOccupied = 0;
		double totalRooms = 0;
		double totalVacant = 0;
		
		
		//get input from user
		System.out.println("How many floors does the hotel have?");
		floors = keyboard.nextDouble();
		
		
		//loop for entering the number of floors and rooms. Then it loops for how many rooms are vacant and filled for each floor
		for(int number = 1; number <= floors; number++){
			System.out.println("How many rooms are on floor " + number + ": ");
			rooms = keyboard.nextDouble();
			keyboard.nextLine();
			while(rooms < 10){
				System.out.println("You have entered an invalid number. Please try again.");
				rooms = keyboard.nextDouble();
			}
			
			System.out.println("How many rooms on floor " + number + " are filled?");
			occupiedRooms = keyboard.nextDouble();
			while(occupiedRooms < 0 || occupiedRooms > rooms){
				System.out.println("You have entered an invalid value. Please try again.");
				occupiedRooms = keyboard.nextDouble();
			}
			
			//setting the occupied, total, and vacant rooms to add together each time it loops
			totalOccupied += occupiedRooms;
			totalRooms += rooms;
			totalVacant = totalRooms - totalOccupied;
			
			}
		
		//show output formatted by decimal format
		num1.setRooms(totalRooms);
		num1.setFilled(totalOccupied);
		System.out.println("There are " + floors + " floors in the hotel.");
		System.out.println("With a total of " + totalRooms + " rooms.");
		System.out.println("Of which, " + totalOccupied + " are occupied.");
		System.out.println("Which leaves " + totalVacant + " vacant rooms in the hotel.");
		System.out.println("The occupancy rate is: " + d1.format(num1.calcRate()));
		
	}

}
