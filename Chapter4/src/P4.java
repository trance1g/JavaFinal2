
public class P4 {

	
	public void getDiscount(double input){
		//local variables
		double discount;
		double total;
		
		//conditional statement for the purchase quantity
		if(input >= 10 && input <= 19){
			discount = (99 * input) * 0.2;
			total = (99 * input) - discount;
			System.out.println("The total cost of the purchase is $" + total);
		}else if(input >= 20 && input <= 49){
			discount = (99 * input) * 0.3;
			total = (99 * input) - discount;
			System.out.println("The total cost of the purchase is $" + total);
		}else if(input >= 50 && input <= 99){
			discount = (99 * input) * 0.5;
			total = (99 * input) - discount;
			System.out.println("The total cost of the purchase is $" + total);
		} else if(input >= 100){
			discount = (99 * input) * 0.6;
			total = (99 * input) - discount;
			System.out.println("The total cost of the purchase is $" + total);
		}
	}
}
