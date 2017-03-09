import java.util.Scanner;

public class P8TheGreatestAndTheLeastLauncher {

	public static void main(String[] args) {
		
		///instantiating a scanner and a TheGreatestAndTheLeast object
		Scanner k = new Scanner(System.in);
		P8TheGreatestAndTheLeast number = new P8TheGreatestAndTheLeast();
		
		String input; // used to gather input from the user
		boolean valid = false; // used for validation

		
		//loop for validating for monthly rainfall
		do{
				System.out.println("Enter the numbers, then press -99 to see which of the numbers you entered is greastest and the least.");
				input = k.nextLine(); //gather number of years from the user
				
				try {  //tests input to see if it is a positive integer
					int value = Integer.parseInt(input);  
					
					if(value != -99){
						number.CalculateValues(value);
					}else{
						valid = true; // makes validation true
					}
					
				} catch (NumberFormatException e) {  
					System.out.println("Invalid entry. Please, try again."); //displays error if input it's an integer value
				}
			
		}while(valid == false);
		valid = false; //resets validation

		System.out.println("The greatest number you have entered is " + number.getGreatestNum());
		System.out.println("The lowest number you have entered is " + number.getLeastNum());
		
		k.close();
	}

}
