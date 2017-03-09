

public class P6 {
	//private variables
	private double weight;
	private double miles;
	private double cost;

	//getters and setters
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public void setMiles(double miles){
		this.miles = miles;
	}
	
	public double CalculateCharges(){
		//conditional statement for weight
		double rate;
		int temp;
		
		if(weight >= 10){
			rate = 4.8;
		}else if(weight >= 6){
			rate = 3.7;
		}else if(weight > 2){
			rate = 2.2;
		}else{
		 rate = 1.1;
		}
		//conditional statement for distance
		if(miles > 500){
			temp = (int)miles / 500;
			
			if(0 == (miles % 500)){
				cost = temp * rate;
			}else{
				cost = (temp + 1) * rate;
			}
		}else{
			cost = rate;
		}
		
		return cost;
		
	}
}
