public class Egg {

	public Egg() {
		number = 5;
	}

	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println(egg.number);
	}
	private int number = 3;
	
	{ number = 4; } 

// If you answered 5, you got it right. Fields and blocks are run fi rst in order, setting
// number to 3 and then 4. Then the constructor runs, setting number to 5.
}