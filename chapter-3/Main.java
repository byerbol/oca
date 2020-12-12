public class Main {
	public static void main(String[] args) {
		System.out.println(1 + 2 + "c"); // 3c

		// from left to right

		String s1 = "1";
		String s2 = s1.concat("2");
		// if I have to change it like it: 
		// s2 = s2.concat("3");
		// output will be like: 123; 
		s2.concat("3");
		System.out.println(s2); // 12

		String name = "Fluffy";
		String name = new String("Fluffy"); // already defined

		System.out.println(name);
	}
}