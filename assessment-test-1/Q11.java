// Chapter 2.

public class Q11 {
	public static void main(String[] args) {
		int x = 5, j = 0;
		OUTER: for(int i = 0; i < 3;)
			INNER: do {
				i++; x++; // 1, 6; 2, 11; 3, 12
				if(x > 10) break INNER;

				x += 4; // 10
				j++; // 1
			}while(j <= 2);

			System.out.println(x);
	}
}