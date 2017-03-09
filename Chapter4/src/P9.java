
public class P9 {
	//private variables
	private double feet;
	
	//gtetters and setters
	public void setFeet(double feet){
		this.feet = feet;
	}
	
	public double getSpeedInAir(){
		return feet / 1100.0;
	}
	
	public double getSpeedInWater(){
		return feet / 4900.0;
	}
	
	public double getSpeedInSteel(){
		return feet / 16400.0;
	}
}
