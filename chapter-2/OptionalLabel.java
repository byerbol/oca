public class OptionalLabel {
	public static void main(String[] args) {

		// cool staff )
		OPTIONAL_IF: if(false) {
			System.out.println("OPTIONAL_IF");

			INNER_IF: if(true) {
				System.out.println("INNER_IF");
			}
		}SOME_OUTER_IF: else if(true) {
			System.out.println("SOME_OUTER_IF"); // compile error :=(
		}
	}
}