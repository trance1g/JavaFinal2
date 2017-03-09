import java.text.*;

public class Practice {
	
	DecimalFormat f = new DecimalFormat("#0");
	
	//declaring fields
	private double balance;
	private String transactionNumber, accountAlerts;
	
	public Practice(){
		
	}
	
	public Practice(double balance, String number){
		setBalance(balance);
		setTransactionNumber(number);
		setAccountAlerts("");
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	private void setTransactionNumber(String transactionNumber){
		this.transactionNumber = transactionNumber;
	}
	
	public void setAccountAlerts(String accountAlerts){
		this.accountAlerts = accountAlerts;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public String getTransactionNumber(){
		return transactionNumber;
	}
	
	public String getAccountAlert(){
		if(balance < 0){
			accountAlerts = "Alert! You have a negative balance!";
		}
		
		return accountAlerts;
	}
	
	
}