public class Mouse {
	private int numTeeth;
	private int numWhiskers;
	private int weight;
	public Mouse(int weight) {
		this(weight, 16); // calls constructor with 2 parameters
	}
	public Mouse(int weight, int numTeeth) {
		this(weight, numTeeth, 6); // calls constructor with 3 parameters
	}
	public Mouse(int weight, int numTeeth, int numWhiskers) {
		this.weight = weight;
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
	}
	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}
	public static void main(String[] args) {
		Mouse mouse = new Mouse(15);
		mouse.print();
	}

	/*
		Overloaded constructors often call each other. One common technique is to have each
		constructor add one parameter until getting to the constructor that does all the work.
		This approach is called constructor chaining. In this example, all three constructors are
		chained.

	*/
}