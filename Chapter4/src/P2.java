public class P2 {
	
	
	public void getNum(double input){
		//declare variables
		double output;
		//use conditional statement to display output
	if(input >= 86400){
		output = (((input / 60) / 60) / 24);
		System.out.println(input + " seconds is " + output + " days.");
	}else if(input >= 3600){
		output = (input / 60) / 60;
		System.out.println(input + " seconds is " + output + " hours.");
	}else if(input >= 60){
		output = input / 60;
		System.out.println(input + " seconds is " + output + " minutes.");
	}else{
		System.out.println("You have entered an invalid value :(");
	}

	}
	}
