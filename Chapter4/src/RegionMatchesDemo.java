public class RegionMatchesDemo {
    public static void main(String[] args) {
    	
    	String fooString1 = new String("foo");
    	String fooString2 = new String("foo");

    	// Evaluates to false
    	fooString1 = fooString2;

    	// Evaluates to true
    	fooString1.equals(fooString2);
    	
    }
    
}
    