import java.util.function.*;

/**
The only functional programming interface you need to memorize for the
exam is Predicate .
*/

public class Q17 {
	public static void main(String[] args) {
		System.out.println(test(i -> i == 5)); // true
		// System.out.println(test(i -> {i == 5;})); // not a statement
		// incorrect because a return statement must be used if braces are included around the body.
		System.out.println(test((i) -> i == 5)); // true
		System.out.println(test((i) -> {return i == 5;})); // true

		// System.out.println(test((int i) -> i == 5);
		System.out.println(test((int i) -> {return i == 5;}));
		// the type is Integer in the predicate and int in the lambda.
	}

	private static boolean test(Predicate<Integer> p) {
		return p.test(5);
	}
}