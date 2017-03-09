public class P7 {
	//declare local variables
	private double calories;
	private double fatG;
	
	//setters
	public void setCal(double calories){
		this.calories = calories;
	}
	
	public void setFat(double fatG){
		this.fatG = fatG;
	}
	//conditional method
	public void CalculateFat(){
		double percentage;
		double calFat;
		
		calFat = fatG * 9;
		percentage = (calFat / calories) * 100;
		
		
		System.out.println("The percent of fat from calories is: " + percentage + "%");
		System.out.println("The calories that come from fat are: " + calFat);
			
		if(percentage < 30){
			System.out.println("This item is low in fat!");
		}else{
			System.out.println("");
		}
		
		
	}
	
}
