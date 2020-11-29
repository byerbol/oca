interface HasTail { int getTailLength(); }
abstract class Puma implements HasTail {
	// is assumed to be public , since it is part of an interface.
	// invalid override, as protected is a more restrictive access modifier than public
	protected int getTailLength() { return 4; }
}
public class Cougar extends Puma {
	public static void main(String[] args) {
		//is incorrect, since Puma is marked abstract and cannot be instantiated.
		Puma puma = new Puma();
		System.out.println(puma.getTailLength());
	}
	public int getTailLength(int length) {
		return 2;
	}
}

// Chapter 5.