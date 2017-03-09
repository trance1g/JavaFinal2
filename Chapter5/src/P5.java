import java.util.*;

public class P5 {
	//instantiate scanner class
	Scanner keyboard = new Scanner(System.in);
	//private variables
	private double rooms;
	private double floors;
	private double filled;
	private double percentage;
	/**
	 * @return the filled
	 */
	public double getFilled() {
		return filled;
	}
	/**
	 * @param filled the filled to set
	 */
	public void setFilled(double filled) {
		this.filled = filled;
	}


	/**
	 * @return the rooms
	 */
	public double getRooms() {
	return rooms;
	}
	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(double rooms) {
		this.rooms = rooms;
	}
	/**
	 * @return the floors
	 */
	public double getFloors() {
	
		return floors;
	}
	/**
	 * @param floors the floors to set
	 */
	public void setFloors(double floors) {
		this.floors = floors;
	}
	
	public double calcRate(){
		//math to be called to do calculations in the main method
		percentage = (filled / rooms) * 100;
		
		
		return percentage;
	}
	

}


