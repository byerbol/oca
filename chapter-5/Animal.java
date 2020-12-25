public class Animal {
	private int age;
	public Animal(int age) {
		super();
		this.age = age;
		}
	}
public class Zebra extends Animal {
	public Zebra(int age) {
		super(age);
	}

	public Zebra() {
		this(4);
	}
}

/*

	In the fi rst class, Animal , the fi rst statement of the constructor is a call to the parent
	constructor defi ned in java.lang.Object , which takes no arguments. In the second class,
	Zebra , the fi rst statement of the fi rst constructor is a call to Animal ’s constructor, which
	takes a single argument. The class Zebra also includes a second no-argument construc-
	tor that doesn’t call super() but instead calls the other constructor within the Zebra class
	using this(4) .

*/