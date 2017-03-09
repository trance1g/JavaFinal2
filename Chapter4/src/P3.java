
public class P3 {
	private double average;
	public P3(double test1, double test2, double test3){
		average = (test1 + test2 + test3) / 3;
	}
	public void getScore(double input1){
		
		//conditional statement for the score
		if(average >= 90){
			System.out.println("The average grade for the scores you entered is " + average + " which is an A");
		} else if(average > 80 && input1 < 90){
			System.out.println("The average grade for the scores you entered is " + average + " which is an B");
		} else if (average > 70 && input1 < 80){
			System.out.println("The average grade for the scores you entered is " + average + " which is an C");
		} else if(average > 60 && input1 < 70){
			System.out.println("The average grade for the scores you entered is " + average + " which is an D");
		} else{
			System.out.println("The average grade for the scores you entered is " + average + " which is an F");
		}
		
	}

}
