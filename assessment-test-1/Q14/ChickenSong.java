package Q14;

class Chicken {

}

interface HenHouse { public java.util.List<Chicken> getChickens(); }

public class ChickenSong {
	public static void main(String[] args) {
		HenHouse house = 
		Chicken chicken = house.getChickens().get(0);
		// a) If house .getChickens() returns an array of one element, the code will output Cluck once
		// b) If house.getChickens() returns an array of multiple elements, the code will output 
		//Cluck once for each element in the array

		// c) Alternatively, if house.getChickens() returns an array of zero elements, then the code will
		// throw an IndexOutOfBoundsException on the call to house.getChickens().get(0) ;
		for (int i = 0; i < house.getChickens().size();
			chicken = house.getChickens().get(i++) ) {
			System.out.println("Cluck");
		}
	}
}