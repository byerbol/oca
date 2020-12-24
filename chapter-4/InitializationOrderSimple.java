public class InitializationOrderSimple {

	private String name = "Torchie";

	{ System.out.println(name); }

	private static int COUNT = 0;

	static { System.out.println(COUNT); }

	static { COUNT += 10; System.out.println(COUNT); }

	public InitializationOrderSimple() {

	System.out.println("constructor");

	} 
}
 public class CallInitializationOrderSimple {

	public static void main(String[] args) {
		InitializationOrderSimple init = new InitializationOrderSimple();
	} 
}

/*
	
	The output is:
	0
	10
	Torchie
	constructor
	

	Rule1: superclass.
	Rule2: static var dec & init.
	Rule3: instance var dec & init.
	Rule4: constructor.
*/