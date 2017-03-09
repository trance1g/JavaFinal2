import java.text.*;
public class P4 {
	//private variables
private double days;
private double dollars;
//instantiate decimal format class to format the output
DecimalFormat f = new DecimalFormat("#0.00");
/**
 * @return the days
 */
public double getDays() {
	return days;
}
/**
 * @param days the days to set
 */
public void setDays(double days) {
	this.days = days;
}
/**
 * @return the dollars
 */
public double getDollars() {
	dollars = 0.01;
	
	//loop basically for each day you enter it will add double the amount of the day before
		if (days > 1) {
			for (double x = 1; x <= days; x++) {
				System.out.println("$" + f.format(dollars));
				dollars += dollars;
			}
		}else{
			System.out.println("Day 1: $" + f.format(dollars));
		}
	return dollars;
}
/**
 * @param dollars the dollars to set
 */
public void setDollars(double dollars) {
	this.dollars = dollars;
}
}
