
public class P10 {
	//private variables
	private double temperature;

	
	public void getTemperature(double temp){
		this.temperature = temp;
		String text = "";
		//conditional statement for which option was entered
		if(isEthylFreezing()){
			text = text + " at this temperature Ethyl would be freezing.";
		}
		
		if(isOxygenFreezing()){
			text = text + " at this temperature Oxygen would be freezing.";

		}

		if(isWaterFreezing()){
			text = text + " at this temperature Water would be freezing.";

		}
		
		if(isEthylBoiling()){
			text = text + " at this temperature Ethyl would be boiling.";

		}
		
		if(isOxygenBoiling()){
			text = text + " at this temperature Oxygen would be boiling.";

		}

		if(isWaterBoiling()){
			text = text + " at this temperature Water would be boiling.";

		}
		
		System.out.println("The temperature you entered is " + temperature + ". " + text);
			
		
		
	}
	
	public boolean isEthylFreezing(){
		boolean e = true;
		if(temperature <= -173){
			e = true;
		}else{
			e = false;
		}
		
		return e;
	}
	
	public boolean isEthylBoiling(){
		boolean e = true;
		if(temperature >= 172){
			e = true;
		}else{
			e = false;
		}
		
		return e;
	}
	
	public boolean isOxygenFreezing(){
		boolean o = true;
		if(temperature <= -362){
			o = true;
		}else{
			o = false;
		}
		
		return o;
	}
	
	public boolean isOxygenBoiling(){
		boolean o = true;
		if(temperature >= -306){
			o = true;
		}else{
			o = false;
		}
		
		return o;
	}
	
	public boolean isWaterFreezing(){
		boolean w = true;
		if(temperature <= 32){
			w = true;
		}else{
			w = false;
		}
		
		return w;
	}
	
	public boolean isWaterBoiling(){
		boolean w = true;
		if(temperature >= 212){
			w = true;
		}else{
			w = false;
		}
		
		return w;
	}
}
