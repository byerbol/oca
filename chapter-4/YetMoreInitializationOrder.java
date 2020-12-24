/*
	
	2 4 5 6 8
	2 4 6 8 5	 

*/

public class YetMoreInitializationOrder {
	static { add(2); }

	static void add(int num) { System.out.print(num + " "); }

	YetMoreInitializationOrder() { add(5); }

	static { add(4); }

	{ add(6); }

	static { 
		// This means we can go on to rule 3 to look at
		// the instance variables and instance initializers.
		new YetMoreInitializationOrder();

	 }

	{ add(8); }

	public static void main(String[] args) { } 
}