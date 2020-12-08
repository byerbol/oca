public class Order {
	public static void main(String[] args) {
		
	}

	private int getSortOrder(String firstName, final String lastName) {
		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;

		switch(firstName) {
			case "Test":
				return 52;

			case middleName: // DOES NOT COMPILE. not final variable
				id = 5;
				break;

			case suffix: // The third case statement compiles without issue because suffix is a final constant variable.
				id = 0;
				break;

			case lastName: // DOES NOT COMPILE 
			//In the fourth case statement, despite lastName being final , it is not constant as it is
			//passed to the function; therefore, this line does not compile as well.
				id = 8;
				break;
			case 5: // DOES NOT COMPILE
				id = 7;
				break;
			case 'J': // DOES NOT COMPILE
				id = 10;
				break;
			case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
				id=15;
				break;

				/*
				Finally, the last three
				case statements don’t compile because none of them have a matching type of String ; the
				last one is an enum value.
				*/
		}
	}
}