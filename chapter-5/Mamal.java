public class Mammal {
	public Mammal(int age) {
	}
}
public class Elephant extends Mammal { // DOES NOT COMPILE

}

/*
	In this example no constructor is defi ned within the Elephant class, so the compiler tries
	to insert a default no-argument constructor with a super() call, as it did in the Donkey
	example. The compiler stops, though, when it realizes there is no parent constructor that
	takes no arguments. In this example, we must explicitly defi ne at least one constructor, as
	in the following code:
*/



public class Mammal {
	public Mammal(int age) {
}
}
public class Elephant extends Mammal {
	public Elephant() { // DOES NOT COMPILE
	}
}

/*

	This code still doesn’t compile, though, because the compiler tries to insert the no-
	argument super() as the fi rst statement of the constructor in the Elephant class, and there
	is no such constructor in the parent class. We can fi x this, though, by adding a call to a par-
	ent constructor that takes a fi xed argument:

*/