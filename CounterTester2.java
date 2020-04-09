package CS175L;

public class CounterTester2 {

	public static void main(String[] args) {
		Counter2 venue = new Counter2();
		int rValue=venue.getValue();

		venue.clickMany(10);
		
		venue.unclickMany(5);
		
		
		rValue=venue.getValue();
		System.out.println("Expeccted: 5");
		System.out.println("Actual: " + rValue);
		
		venue.reset();
		
		venue.clickMany(3);
		
		venue.unclickMany(4);
		
		
		rValue=venue.getValue();
		System.out.println("Expected: -1");
		System.out.println("Actual: " + rValue);
	
	}
	
	
	
	
	
	
	
	
	
}
