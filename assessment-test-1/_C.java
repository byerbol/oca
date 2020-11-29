public class _C {
	// because identifiers may begin with a letter, underscore, or dollar sign.
	// instance variable
	private static int $;
	public static void main(String[] main) {
		String a_b;
		System.out.print($);

    	// local variables require assignment before referencing them.
		System.out.print(a_b);

		/**
			
			_C.java:6: error: variable a_b might not have been initialized
			System.out.print(a_b);

			is valid class name: _C?
			is valid for data type's name as sign like: "$"?
			For more information, see Chapter 1.

		*/
	}
}