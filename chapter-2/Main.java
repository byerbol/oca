public class Main {
	public static void main(String[] args) {
		int dayOfWeek = 6;

		// what if it was 6??
		// default runs only when theres no matching cases
		switch(dayOfWeek) {
			case 0:
				System.out.println("Sunday");
			default:
				System.out.println("Weekday");
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Some other");
				break;
		}

		// output
		// weekday
		// saturday why ???

		/*

			This code looks a lot like the previous example except two of the break statements have
			been removed and the order has been changed. This means that for the given value of day-
			OfWeek , 5 , the code will jump to the default block and then execute all of the proceeding
			case statements in order until it fi nds a break statement or fi nishes the structure:
			Weekday
			Saturday



			Even though the default block was before the case block, only the case block was exe-
			cuted. If you recall the defi nition of the default block, it is only branched to if there is no
			matching case value for the switch statement, regardless of its position within the switch
			statement.



			Finally, if the value of dayOfWeek was 0 , all three statements would be output:
			Sunday
			Weekday
			Saturday
			Notice that in this last example, the default is executed since there was no break state-
			ment at the end of the preceding case block. While the code will not branch to the default
			statement if there is a matching case value within the switch statement, it will execute the
			default statement if it encounters it after a case statement for which there is no terminat-
			ing break statement.

		*/



	}
}