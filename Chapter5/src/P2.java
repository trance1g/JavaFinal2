
public class P2 {
	//private variables
	private double distance;
	private double speed;
	private double time;
	/**
	 * @return the time
	 */
	public double getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(double time) {
		this.time = time;
	}
	/**
	 * @return the distance
	 */
	public void getDistance() {
		
		
		// displaying output
		System.out.println("Hour \t\t Distance");
		System.out.println("-------------------------------");
		
		for(double number = 1; number <= time; number++){
			distance = speed * number;
			System.out.println(number + "\t\t" + distance + " miles");
		
		}
	}
	/**
	 * @param distance the distance to set
	 */
	public void setDistance(double distance) {
		this.distance = distance;
	}
	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	
	
}
