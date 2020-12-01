import java.time.*;
import java.util.*;

public class Q18 {
	public static void main(String[] args) {

		// these two are correct!
		System.out.println(LocalDate.of(2015, Month.APRIL, 1));
		System.out.println(LocalDate.of(2015, 4, 1));
		System.out.println(LocalDate.of(2015, Calendar.APRIL, 1)); // indexing from 0 ?

		/**
			B, D. The new date APIs added in Java 8 use static methods rather than a constructor
			to create a new date, making options E and F incorrect. The months are indexed start-
			ing with 1 in these APIs, making options A and C incorrect. Option A uses the old
			Calendar constants which are indexed from 0. Therefore, options B and D are correct.
			For more information, see Chapter 3.
		*/

	}
}