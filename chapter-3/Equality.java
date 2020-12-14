public class Equality {
	public static void main(String[] args) {
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two); // false
		System.out.println(one == three); // true

		String x = "Hello World";
		String y = "Hello World";
		System.out.println(x == y);
		// true

		String z = " Hello World".trim();	
		System.out.println(x == z); // false

	// 		In this example, we don’t have two of the same String literal. Although x and z hap-
	// pen to evaluate to the same string, one is computed at runtime. Since it isn’t the same at
	// compile-time, a new String object is created.
	}
}