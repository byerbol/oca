public class Q2 {
	public static void main(String[] args) {
		// String literals are used from the string pool.
		// This means that s1 and s2 refer to the same object and are equal.
		String s1 = "Java";
		String s2 = "Java";

		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");


		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString() == s1); // why false?
		// because toString() uses a method to compute the value and it is not from the string pool.
		

		// The final print statement again prints true
		// because equals() looks at the values of String objects. For more information, see
		// Chapter 3.
		System.out.println(sb1.toString().equals(s1));

		// my test
		System.out.println(s1.toString() == s2);
	}
}