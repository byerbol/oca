public class Camel {
	protected String getNumberOfHumps() {
		return "Undefined";
	}
}
public class BactrianCamel extends Camel {
	private int getNumberOfHumps() { // DOES NOT COMPILE
		return 2;
	}
}

/*

	In this example, the method in the child class doesn’t compile for two reasons. First, it
	violates the second rule of overriding methods: the child method must be at least as acces-
	sible as the parent. In the example, the parent method uses the protected modifi er, but the
	child method uses the private modifi er, making it less accessible in the child method than
	in the parent method. It also violates the fourth rule of overriding methods: the return
	type of the parent method and child method must be covariant. In this example, the
	return type of the parent method is String , whereas the return type of the child method
	is int , neither of which is covariant with each other.

*/