public class Q13 {
	public static void main(String[] args) {
		int luck = 10;

		if((luck > 10 ? luck++: --luck) < 10) {
			System.out.print("Beer");
		}if(luck < 10) System.out.print("Shark");
	}
}