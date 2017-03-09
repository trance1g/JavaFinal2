import java.text.DecimalFormat;
public class P5 {
	DecimalFormat f = new DecimalFormat();
	//getting calculation method
	public void getCheck(double numChecks, double balance){
		//conditional statements
		double fees;
		double fee1 = 0;
		if(balance < 400){
			 fee1 = 15;
		}
		//conditional statement for amounts
		if(numChecks >= 60){
			fees = (0.04 * numChecks);
			balance = balance - fees;
		 }else if(numChecks >= 40){
			 fees = (0.06 * numChecks);
			 balance = balance - fees;
		 }else if(numChecks >= 20){
			 fees = (0.08 * numChecks);
			 balance = balance - fees;
		 }else{
			 fees = (0.1 * numChecks);
			 balance = balance - fees;
		 }
		
		fees = fees + fee1 + 10;
		balance = balance - fees; 
		//display output
		System.out.println("The remaining balance for the month is $" + f.format(balance));
		System.out.println("After taking out " + f.format(fees) + " in fees.");
	}
}
