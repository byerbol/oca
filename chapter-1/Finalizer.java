// public class Finalizer {
// 	protected void finalize(){
// 		System.out.println("Calling finalize");
// 	}
// 	public static void main(String[] args) {
// 		Finalizer f = new Finalizer();
// 	} 
// }

public class Finalizer {
	private static List objects = new ArrayList();
	protected void finalize() {

		// Remember, finalize() is only run when 
		// the object is eligible for garbage collection.
		objects.add(this); // Don't do this
	} 
}