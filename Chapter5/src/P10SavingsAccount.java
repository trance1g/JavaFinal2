
public class P10SavingsAccount {

	//declaring fields
	private double balance; //holds the user's balance
	private double annualInterestRate; //holds the user's annual interest rate
	private int months; //number of months since the account was created
	private double withdrawals = 0; //used to add up all withdrawals
	private double deposits = 0; // used to add up all deposits 
	
	
	/**
	 * @return the withdrawals
	 */
	public double getWithdrawals() {
		return withdrawals;
	}

	/**
	 * @return the deposits
	 */
	public double getDeposits() {
		return deposits;
	}

	/**
	 * @return the months
	 */
	public int getMonths() {
		return months;
	}

	/**
	 * @param months the months to set
	 */
	public void setMonths(int months) {
		this.months = months;
	}

	/**
	 * @return the annualInterestRate
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * @param annualInterestRate the annualInterestRate to set
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double Withdrawal(double withdrawal){
		this.withdrawals = this.withdrawals + withdrawals;
		balance = balance - withdrawal;
		
		return balance;
	}
	
	public double Deposit(double deposit){
		this.deposits = this.deposits + deposit;
		balance = balance + deposit;
		
		return balance;
	}
	
	public double MonthlyInterestRate(){
		balance = balance + ((annualInterestRate / 12) * balance);		
		
		return balance;
	}
	
	
}
