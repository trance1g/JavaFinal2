
public class P8TheGreatestAndTheLeast {

	private double greatestNum = -99; // greatest number
	private double leastNum = -99; // least number
	/**
	 * @return the greatestNum
	 */
	public double getGreatestNum() {
		return greatestNum;
	}

	/**
	 * @return the leastNum
	 */
	public double getLeastNum() {
		return leastNum;
	}

	public void CalculateValues(double value){
		
		if(greatestNum == -99){
			greatestNum = value;
		}else if(leastNum == -99){
			if(greatestNum > value){
				 leastNum = value;
			}else{
				leastNum = greatestNum;
				greatestNum = value;
			}
		}else{
			if(value > greatestNum){
				greatestNum = value;
			}else if(value < leastNum){
				leastNum = value;
			}
		}
	}
	
	
	
	
}
