
public class SpeedConverter {
	
	/* The below method "toMilesPerHour" is used for the conversion of value
	 * 			from the kilometers/hour to the miles/hoour.
	 */

	public static long toMilesPerHour ( double KilometersPerHour ) {
		if ( KilometersPerHour < 0) {
			return -1;
		}
		
		/* Conversion of the value to milesperhour metric using the formula
		 * 		(miles/hr)*1.609 = km/hr
		 * 
		 * Math is the inbuilt library that is used for the caluclation of
		 * 		value and rounding of the values.
		 */
		
		long milesPerHour = Math.round(KilometersPerHour/1.609);
		return milesPerHour;
	}
	
	public static void printConversion ( double KilometersPerHour) {
		if ( KilometersPerHour < 0 ) {
			System.out.println("Invalid Value");
		} else {
			long MilesPerHour = toMilesPerHour(KilometersPerHour);
			System.out.println(KilometersPerHour + " km/h " + " conversion is " + MilesPerHour + " mi/h");
		}
	}
}
