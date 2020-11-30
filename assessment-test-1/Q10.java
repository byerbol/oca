import java.util.*;
public class Q10 {

	public Q10(String n) {
		name = n;
	}

	public static void main(String[] args) {
		Q10 one = new Q10("g1");
		Q10 two = new Q10("g2");

		one = two;
		two = null;
		one = null;
	}

	private String name;
	// Although it is traditional to declare instance variables early in the class, you don’t
    // have to.

	// C, D, F.
}