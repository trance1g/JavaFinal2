
public class P9PayrollReport {
	
	//declaring fields
	private int employeeID; //holds employee id
	private double grossPay; // holds gross pay
	private double stateTax; // holds state tax
	private double federalTax; // holds federal tax
	private double withholdings; /// holds withholdings
	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}
	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	/**
	 * @return the grossPay
	 */
	public double getGrossPay() {
		return grossPay;
	}
	/**
	 * @param grossPay the grossPay to set
	 */
	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}
	/**
	 * @return the sateTax
	 */
	public double getStateTax() {
		return stateTax;
	}
	/**
	 * @param sateTax the sateTax to set
	 */
	public void setStateTax(double stateTax) {
		this.stateTax = stateTax;
	}
	/**
	 * @return the federalTax
	 */
	public double getFederalTax() {
		return federalTax;
	}
	/**
	 * @param federalTax the federalTax to set
	 */
	public void setFederalTax(double federalTax) {
		this.federalTax = federalTax;
	}
	/**
	 * @return the withholdings
	 */
	public double getWithholdings() {
		return withholdings;
	}
	/**
	 * @param withholdings the withholdings to set
	 */
	public void setWithholdings(double withholdings) {
		this.withholdings = withholdings;
	}
		
	// this method is used for validation
	//because the total sum of state tax, federal tax, and FICA withholdings
	//cannot be greater than the employee's gross pay
	public boolean ValidateTaxes(){ 
		boolean value = false;
		double tempTax;
		
		tempTax = stateTax + federalTax + withholdings;
		
		if(grossPay > tempTax){
			value = true;
		}
		
		return value;
	}
	
	public double NetPay(){ // this method is used to calculate the net pay for the employee
		double netPay = grossPay - stateTax - federalTax - withholdings;
		
		return netPay; //returns netPay
	}

}
