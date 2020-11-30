package Q8;

public class Deer{
	
	public Deer() { System.out.print("Deer"); }

	public Deer(int age) {System.out.print("DeerAge");}

	// hidden method since it is declared private in the parent class.
	// that's why not overriden
	private boolean hasHorns() {return false;}

	public static void main(String[] args) {
		Deer deer = new Reindeer(5);
		System.out.println("," + deer.hasHorns());

		// DeerReindeer,false
	}
}

class Reindeer extends Deer {

	// Since there is no explicit call to the parent constructor, the default no-argument super()
    // is inserted as the first line of the constructor.


	// if so Q8/Deer.java:24: error: invalid method declaration; return type required

	// why parents no arg constructor is called instead of this one ?
	public Reindeer() { System.out.print("no args Reindeer"); }

	public Reindeer(int age) { System.out.print("Reindeer"); }
	public boolean hasHorns() { return true; }

}