public class Bird {
	public final boolean hasFeathers() {
		return true;
	}
}
public class Penguin extends Bird {
	public final boolean hasFeathers() { // DOES NOT COMPILE
		return false;
	}
}

/*

	In this example, the method hasFeathers() is marked as final in the parent class Bird ,
	so the child class Penguin cannot override the parent method, resulting in a compiler error.
	Note that whether or not the child method used the final keyword is irrelevant—the code
	will not compile either way.

*/