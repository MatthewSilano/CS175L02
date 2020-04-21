package CS175L;

public class RoachSimulation {

	public static void main(String[] args) {
		
		RoachPopulation bugs = new RoachPopulation();
		
		int numroaches = bugs.getroaches();
		
		bugs.setroaches(10);
		numroaches = bugs.getroaches();
		System.out.println("The Initial Roach population is " + numroaches);
		
		bugs.breed();
		numroaches = bugs.getroaches();
		System.out.println("The Roach population after cycle 1 breeding is " + numroaches);
		
		bugs.spray(50);
		numroaches = bugs.getroaches();
		System.out.println("The Roach population after cycle 1 50% spraying is " + numroaches);
		
		
		bugs.breed();
		numroaches = bugs.getroaches();
		System.out.println("The Roach population after cycle 2 breeding is " + numroaches);
		
		bugs.spray(60);
		numroaches = bugs.getroaches();
		System.out.println("The Roach population after cycle 2 60% spraying is " + numroaches);
		
		
		bugs.breed();
		numroaches = bugs.getroaches();
		System.out.println("The Roach population after cycle 3 breeding is " + numroaches);
		
		bugs.spray(70);
		numroaches = bugs.getroaches();
		System.out.println("The Roach population after cycle 3 70% spraying is " + numroaches);
		
		
		bugs.breed();
		numroaches = bugs.getroaches();
		System.out.println("The Roach population after cycle 4 breeding is " + numroaches);
		
		bugs.spray(80);
		numroaches = bugs.getroaches();
		System.out.println("The Roach population after cycle 4 80 is " + numroaches);
		
		
		System.out.println();
		

	}

}
