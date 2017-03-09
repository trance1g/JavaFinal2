import java.text.*;

public class P11 {
	DecimalFormat f = new DecimalFormat("#0.00");
	
	private double minutes;
	private double pkgOption;
	private double monthlyCharge;
	private String p;
	
	
	

	public void setMinutes(double minutes){
		this.minutes = minutes;
	}
	
	public void setPackage(double pkgOption){
		this.pkgOption = pkgOption;
	}
	
	public void CalculateMonthlyCharge(){
		
		double temp, s1, s2;
		double saving1 = 0, saving2 = 0;
		
		if(pkgOption == 1){
			p = "A";
			monthlyCharge = 39.99;
			if(minutes > 450){
				temp = minutes - 450;
				monthlyCharge = monthlyCharge + (temp * 0.45);
				
				
				
			}
		}else if(pkgOption == 2){
			p = "B";
			monthlyCharge = 59.99;
			if(minutes > 900){
				temp = minutes - 900;
				monthlyCharge = monthlyCharge + (temp * 0.4);
		}else if(pkgOption == 3){
			p = "C";
			monthlyCharge = 69.99;
		}
			}
		
			System.out.println("You have selected package " + p + " and after using " + minutes + " minutes, the total cost for the month would be $" + f.format(monthlyCharge) + ".");	
		
	}
	
	public String getMonthlyCharge(){
		return f.format(monthlyCharge);
		
	}
}
