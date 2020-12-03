public class Chick {
	private String name = "Fluffy";

	// this code prints out OMG. coding block
	{ System.out.println("setting field"); }

	public Chick() {
		name = "Tiny";
		System.out.println("setting constructor");
	}

	public static void main(String[] args) {
		Chick chick = new Chick();
		System.out.println(chick.name);
	}
}