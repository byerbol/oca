public class StaticInit{
	private static final int NUM_SECONDS_PER_HOUR;

	static {
		int numSecondsPerMinute = 60;
		int numMinutesPerHour = 60;
		NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
	}
	// There is something interesting about this example
	public static void main(String[] args) {
		System.out.println(NUM_SECONDS_PER_HOUR);
	}
}