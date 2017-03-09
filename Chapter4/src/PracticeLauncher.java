import java.util.*;
import java.text.*;

public class PracticeLauncher {

	public static void main(String[] args) {


		//instantiating a Scanner, DecimalFormat, and 4 ATM objects
		Practice atm1 = new Practice();
		Practice atm2 = new Practice();
		Practice atm3 = new Practice();
		Practice atm4 = new Practice();
		DecimalFormat f = new DecimalFormat("#0.00");
		DecimalFormat f1 = new DecimalFormat("#0");

		// setting maximum and minimum variables
		double max = 500.00, numMax = 99999;
		double min = -500.00, numMin = 10000;
		
		for(int x = 0; x < 4; x++){
			double n = (Math.random() * (numMax - numMin)) + numMin;
			double b = (Math.random() * (max -min)) + min;
			
			switch(x){
				case 0:
					atm1 = new Practice(-500, f1.format(n));
					break;
				case 1:
					atm2 = new Practice(b, f1.format(n));
					break;
				case 2:
					atm3 = new Practice(b, f1.format(n));
					break;
				case 3:
					atm4 = new Practice(b, f1.format(n));
					break;
			}
		}
		
		System.out.println("**************");
		System.out.println("Transaction Number: " + atm1.getTransactionNumber());
		System.out.println("Account Balance: $" + f.format(atm1.getBalance()));
		System.out.println(atm1.getAccountAlert());
		System.out.println("***************");
		System.out.println("Transaction Number: " + atm2.getTransactionNumber());
		System.out.println("Account Balance: $" + f.format(atm2.getBalance()));
		System.out.println(atm2.getAccountAlert());
		System.out.println("****************");
		System.out.println("Transaction Number: " + atm3.getTransactionNumber());
		System.out.println("Account Balance: $" + f.format(atm3.getBalance()));
		System.out.println(atm3.getAccountAlert());
		System.out.println("*****************");
		System.out.println("Transaction Number: " + atm4.getTransactionNumber());
		System.out.println("Account Balance: $" + f.format(atm4.getBalance()));
		System.out.println(atm4.getAccountAlert());
	}

}
