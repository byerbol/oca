public class Sample {

	private static final int L;

	static {
		L = 2;
	}

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

		// L = 2;
		System.out.println(L);
	}
}