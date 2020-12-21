public class StaticInit2 {
	
	private static int one;
	private static final int two; 
	private static final int three = 3;
	private static final int four; // Line 17 declares a fi nal variable that never gets initialized.
// The compiler gives a compiler error because it knows that the static blocks are the only place
// the variable could possibly get initialized. Since the programmer forgot, this is clearly an error.

	static {
		one = 1;
		two = 2;
		three = 3; //. We are not allowed to assign it again, so line 21 doesn’t compile.
		two = 4; // second attempt. 
	}

	public static void main(String[] args) {
		
	}

// 	This means we can initialize it
// exactly once in a static block.
	// final variable 1-ak ret init jasai alamyz
}