package Q15;

import java.util.List;
import java.util.ArrayList;

interface CanSwim {}

class Amphibian implements CanSwim {}

class TadPole extends Amphibian {}

public class FindAllTadPole {
	public static void main(String[] args) {
		List<Tadpole> tadpoles = new ArrayList<>();

		// The for-each loop automatically casts each Tadpole object to an Amphibian
		//reference, which does not require an explicit cast because Tadpole is a subclass of
		//Amphibian . Chapter 5.
		for(Amphibian a: tadpoles) {
			// ___________ tadpole = amphibian;
			// CanSwim, Amphibian, Object;
			CanSwim tadpole = a;

		}
	}
}