public class Order {

	String value = "t";

	{ value += "a"; }
	{ value += "c"; }

	public Order() {
		value += "b";
	}

	public Order(String s) {
		value += s;
	}

	public static void main(String[] args) {
		Order order = new Order("f"); // This sets value to tacf .
		// I thought: tacfb
		// but result is: tacb
		order = new Order(); // creates another Order and initializes value to tacb . 
		System.out.println(order.value); // When value is printed, it is the instance variable in the object last created
	}
}