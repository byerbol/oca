class Varargs {
	public static void main(String[] args) {
		// It is a little different than an array, though.
		walk(1);
		walk(1,2);
		walk(1,2,3);
		walk(1, new int[]{4,5});

		walk1(1, 1, 2); // varargs parameter must be the last parameter
	}
	public static void walk(int start, int... nums) {
		System.out.println(nums.length);
	}

	public static void walk1(int start, int... a, int... b){
		System.out.println(a.length);
	}
}