package CS175L;

public class CounterTester {

	public static void main(String[] args) {
		Counter venue = new Counter();
		int rValue=venue.getValue();

		venue.click();
		venue.click();
		venue.click();
		venue.click();
		venue.click();
		venue.click();
		venue.click();
		venue.click();
		venue.click();
		venue.click();
		
		venue.unclick();
		venue.unclick();
		venue.unclick();
		venue.unclick();
		venue.unclick();
		
		rValue=venue.getValue();
		System.out.println("Expeccted: 5");
		System.out.println("Actual: " + rValue);
		
		venue.reset();
		
		venue.click();
		venue.click();
		venue.click();
		
		venue.unclick();
		venue.unclick();
		venue.unclick();
		venue.unclick();
		
		
		
		rValue=venue.getValue();
		System.out.println("Expected: -1");
		System.out.println("Actual: " + rValue);
	
	}
	
	
	
	
	
	
	
	
	
}
