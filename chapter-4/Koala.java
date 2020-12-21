public class Koala{
	public static int count = 1;
	public static void main(String[] args) {
		// Koala k = new Koala();
		// System.out.println(k.count);
		// k = null;
		// System.out.println(k.count);

// 		Believe it or not, this code outputs 0 twice. Line 6 sees that k is a Koala and count is a
// static variable, so it reads that static variable. Line 8 does the same thing. Java doesn’t care
// that k happens to be null . Since we are looking for a static, it doesn’t matter.

		Koala.count = 4;
		Koala koala1 = new Koala();
		Koala koala2 = new Koala();
		koala1.count = 6;
		koala2.count = 5;
		System.out.println(Koala.count);
		// Hopefully, you answered 5. There is only one count variable since it is static. It is set to
		// 4, then 6, and finally winds up as 5. All the Koala variables are just distractions.
	}
}