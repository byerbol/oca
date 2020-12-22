class PassingData {
	public static void main(String[] args) {
		String name = "Webby";
		speak(name);
		System.out.println(name); // Webby
	}
	public static void speak(String name) {
		name = "Sparky";
	}
}