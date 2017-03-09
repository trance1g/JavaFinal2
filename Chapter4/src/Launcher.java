import java.util.*;
import java.text.*;
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat d1 = new DecimalFormat("#0.00");
		DecimalFormat d2 = new DecimalFormat("#0");
		
		Account num1 = new Account("Jack","Reacher","511 Somewhere Blvd","Someplace","Arkansas",23443,"541-985-6541", true, 2343.45,"checking");
		Account num2 = new Account("Lincoln","Rhyme","423 Falcon Ave","St. Louis","Missouri",63113,"314-256-5687", true, 7542.35, "savings");
		Account num3 = new Account("Robert","Langdon","512 Omen Lane","Symbolic","NY",77777,"524-653-1245", true, 23.14, "investment");
		Account num4 = new Account("Odd","Thomas","3312 Bodachs Street","Pico Mundo","CA",59254,"541-985-6541", true, -123.14, "standard");
			
	
		System.out.println("***** Customer Info *****");
		System.out.println(num1.getFirstName() + " " + num1.getLastName());
		System.out.println(num1.getStreetAddress());
		System.out.println(num1.getCity());
		System.out.println(num1.getState());
		System.out.println(num1.getZip());
		System.out.println(num1.getPhoneNumber());
		System.out.println("Preferred Customer: " + num1.isPreferredCustomer());
		System.out.println("Account Number: " + num1.getAccountNumber());
		System.out.println("Balance: $" + d1.format(num1.getBalance()));
		System.out.println("Account Type: " + num1.getAccountType());
		System.out.println("Notes: " + num1.getAccountNotes());
		
		
		System.out.println("");
		System.out.println("***** Customer Info *****");
		System.out.println(num2.getFirstName() + " " + num2.getLastName());
		System.out.println(num2.getStreetAddress());
		System.out.println(num2.getCity());
		System.out.println(num2.getState());
		System.out.println(num2.getZip());
		System.out.println(num2.getPhoneNumber());
		System.out.println("Preferred Customer: " + num2.isPreferredCustomer());
		System.out.println("Account Number: " + num2.getAccountNumber());
		System.out.println("Balance: $" + d1.format(num2.getBalance()));
		System.out.println("Account Type: " + num2.getAccountType());
		System.out.println("Notes: " + num2.getAccountNotes());
		
		
		System.out.println("");
		System.out.println("***** Customer Info *****");
		System.out.println(num3.getFirstName() + " " + num3.getLastName());
		System.out.println(num3.getStreetAddress());
		System.out.println(num3.getCity());
		System.out.println(num3.getState());
		System.out.println(num3.getZip());
		System.out.println(num3.getPhoneNumber());
		System.out.println("Preferred Customer: " + num3.isPreferredCustomer());
		System.out.println("Account Number: " + num3.getAccountNumber());
		System.out.println("Balance: $" + d1.format(num3.getBalance()));
		System.out.println("Account Type: " + num3.getAccountType());
		System.out.println("Notes: " + num3.getAccountNotes());
		
		
		System.out.println("");
		System.out.println("***** Customer Info *****");
		System.out.println(num4.getFirstName() + " " + num4.getLastName());
		System.out.println(num4.getStreetAddress());
		System.out.println(num4.getCity());
		System.out.println(num4.getState());
		System.out.println(num4.getZip());
		System.out.println(num4.getPhoneNumber());
		System.out.println("Preferred Customer: " + num4.isPreferredCustomer());
		System.out.println("Account Number: " + num4.getAccountNumber());
		System.out.println("Balance: $" + d1.format(num4.getBalance()));
		System.out.println("Account Type: " + num4.getAccountType());
		System.out.println("Notes: " + num4.getAccountNotes());
		

	}

}
