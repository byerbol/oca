public class Hamster {
	String color;
	int weight;
	public Hamster(int weight) {
		// first constructor
		// new Hamster(weight, "brown"); That's not what we want.
		this(weight, "brown");
		// this() has one special rule you need to know. If you choose to call it, the this() call
		// must be the fi rst noncommented statement in the constructor.

	}
	public Hamster(int weight, String color) {
		// second constructor
		this.weight = weight;
		this.color = color;
	}

	public static void main(String[] args) {
		Hamster h = new Hamster(44);

		System.out.println(h.weight);
	}
}