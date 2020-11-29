public class Q4 {
	public static void main(String[] args) {
		boolean keepGoing = true;
		int count = 0;
		int x = 3;

		while(count++ < 3) {
			// count already incremented as 1 ;)
			// System.out.println(count);
			int y = (1 + 2 * count) % 3;
			switch (y) {
				default:
					// by def case 0 ?
					case 0: x -= 1; break;
					case 1: x += 5;
			}
		}
		// assigns new value of 4. that's crazy
		System.out.println(count);
		System.out.println(x);
	}
}