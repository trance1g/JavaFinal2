
public class P7 {
	

	private double years;
	private double inches;
	private double totalInches;
	private double months = 12;
	private double average;
	
	
	/**
	 * @return the totalInches
	 */
	public double getTotalInches() {
		return totalInches;
	}
	/**
	 * @param totalInches the totalInches to set
	 */
	public void setTotalInches(double totalInches) {
		this.totalInches = totalInches;
	}
	/**
	 * @return the months
	 */
	public double getMonths() {
		return months;
	}
	/**
	 * @param months the months to set
	 */
	public void setMonths(double months) {
		this.months = months;
	}
	/**
	 * @return the average
	 */
	public double getAverage() {
		return average;
	}
	/**
	 * @param average the average to set
	 */
	public void setAverage(double average) {
		this.average = average;
	}

	/**
	 * @return the years
	 */
	public double getYears() {
		return years;
	}
	/**
	 * @param years the years to set
	 */
	public void setYears(double years) {
		this.years = years;
	}
	/**
	 * @return the inches
	 */
	public double getInches() {
		return inches;
	}
	/**
	 * @param inches the inches to set
	 */
	public void setInches(double inches) {
		this.inches = inches;
	}
	
	public double calcAvg(){
		average = totalInches / (years * months);
		
		return average;
	}
	
}
