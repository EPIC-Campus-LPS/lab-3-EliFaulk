package packageName;

public class SpaceTools {
	public static double travelTime(Planet p, double speed) {
		double distance = p.getDistanceFromSun();
		speed /= 1_000_000.0;
		double travelTime = (double)(distance / speed);
		return travelTime;
	}
	
	public static String compareDistance(Planet a, Planet b) {
		double aDistance = a.getDistanceFromSun();
		double bDistance = b.getDistanceFromSun();
		double diff = aDistance - bDistance;
		if (diff < 0) {
			return a.getName();
		} else {
			return b.getName();
		}
	}
	
	public static String abbreviation(Planet p) {
		String name = p.getName();
		String abbreviation = name.substring(0,3).toUpperCase();
		return abbreviation; 
	}
	
	public static double orbitTime(Planet p) {
		double orbit = 2 * Math.PI * p.getDistanceFromSun();
		double speed = 100_000.0 / 1_000_000.0;
		double orbitTime = (double) (orbit/speed);
		return orbitTime;
	}
	
	public static double orbitTime(Planet p, double speed) {
		double orbit = 2 * Math.PI * p.getDistanceFromSun();
		speed = speed / 1_000_000.0;
		double orbitTime = (double) (orbit/speed);
		return orbitTime;
	}
}
