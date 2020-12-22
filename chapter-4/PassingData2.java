class PassingData2 {
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder();
		speak(name);
		System.out.println(name); // Webby
	}
	public static void speak(StringBuilder s) {
		s.append("Webby");
	}
}

/*
Pass-by-Value vs. Pass-by-Reference
Pass-by-value is used by many
languages, including Java. In this example, the swap method does not change the origi-
nal values. It only changes a and b within the method.
	public static void main(String[] args) {
		int original1 = 1;
		int original2 = 2;
		swap(original1, original2);
		System.out.println(original1); // 1
		System.out.println(original2); // 2
	}
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}


*/