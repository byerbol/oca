public class Sample {

	public Sample() {
		System.out.println("2");
	}

	{System.out.println("1");}

	// statics first;
	static {
		System.out.println("xaxa");
	}

	public static void main(String[] args) {
		new Sample(); // construct: instance -> constructor
	}
}