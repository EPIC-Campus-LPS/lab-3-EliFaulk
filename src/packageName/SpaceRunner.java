package packageName;

public class SpaceRunner {
	public static void main(String[] args) {
        Planet earth = new Planet("Earth", 150); // 150 million km
        Planet mars = new Planet("Mars", 228);
        
        System.out.println("Travel time to Earth at 50,000 km/h: " + 
            SpaceTools.travelTime(earth, 50_000) + " hours");
            
        System.out.println("The closest planet is: " + 
            SpaceTools.compareDistance(earth, mars));
            
        System.out.println("The abbreviation for Mars is: " + 
            SpaceTools.abbreviation(Planet p));
            
        System.out.println("Earth orbit time (default speed): " +
            SpaceTools.orbitTime(earth) + " hours");
            
        System.out.println("Mars orbit time at 80,000 km/h: " +
            SpaceTools.orbitTime(mars, 80_000) + " hours");
    }

}
