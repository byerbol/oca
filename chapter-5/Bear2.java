public class Bear2 {
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
}
	public class Panda extends Bear {
		public void sneeze() { // DOES NOT COMPILE
			System.out.println("Panda bear sneezes quietly");
		}
		public static void hibernate() { // DOES NOT COMPILE
			System.out.println("Panda bear is going to sleep");
		}
}

/*

	In this example, sneeze() is marked as static in the parent class but not in the child
	class. The compiler detects that you’re trying to override a method that should be hidden
	and generates a compiler error. In the second method, hibernate() is an instance mem-
	ber in the parent class but a static method in the child class. In this scenario, the compiler
	thinks that you’re trying to hide a method that should be overridden and also generates a
	compiler error.

*/