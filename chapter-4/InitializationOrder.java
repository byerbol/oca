public class InitializationOrder {
	private String name = "Torchie";

	{ System.out.println(name); } // instance

	private static int COUNT = 0;

	static { System.out.println(COUNT); }

	{ COUNT++; System.out.println(COUNT); } // instance

	public InitializationOrder() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {

		System.out.println("read to construct");

		new InitializationOrder();
	}


	/*
		0
		read to construct
		Torchie
		1
		constructor
	*/	
}