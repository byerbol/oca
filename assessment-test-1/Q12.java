public class Q12 {
	private String color;

	public Q12() {
		this("White");
	}

	public Q12(String color) {
		// However, the constructor assigns the method parameter to itself
		// value of null .
		color = color;
	}

	public static void main(String[] args) {
		Q12 q = new Q12();
		// this calls empty construtor;
		// non-arg constructor calse line 8's constructor
		System.out.println("Color: " + q.color);
	}
}