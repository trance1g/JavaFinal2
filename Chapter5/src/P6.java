
public class P6 {
	//private variables
	private double start;
	private double increase;
	private double days;
	private double population;
	/**
	 * @return the population
	 */
	public double getPopulation() {
		return population;
	}
	/**
	 * @param population the population to set
	 */
	public void setPopulation(double population) {
		this.population = population;
	}
	/**
	 * @return the start
	 */
	public double getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(double start) {
		this.start = start;
	}
	/**
	 * @return the increase
	 */
	public double getIncrease() {
		return increase;
	}
	/**
	 * @param increase the increase to set
	 */
	public void setIncrease(double increase) {
		this.increase = increase / 100;
	}
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
	
	public double calcFirst(){
		//math to be called to do calculations in the main method
		population = (start * increase) + start;
		
		return population;
	}
	
	public double calcPop(){
		//math to be called to do calculations in the main method
		population = (population * increase) + population;
		
		return population;
	}
	
}
