public class Loops {
	public static void main(String[] args) {
		
		// int x = 0;

		// do{
		// 	x++;
		// }while(false);

		// System.out.println(x);

		// int x = 0;
		// // error: variable x is already defined in method main(String[])
		// for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
		// 	System.out.print(x + " ");
		// }

		// // 		This example also looks a lot like our second example, but like the third example will not
		// // compile, although this time for a different reason. The variables in the initialization block
		// // must all be of the same type. In the fi rst example, y and z were both long , so the code com-
		// // piled without issue, but in this example they have differing types, so the code will not compile.

		// for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) {
		// 	System.out.print(x + " ");
		// }

		// for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
		// 	System.out.print(y + " ");
		// }

		// System.out.print(x); // DOES NOT COMPILE
		// // The fi nal variation on the second example will not compile for a different reason than the
		// // previous examples. If you notice, x is defi ned in the initialization block of the loop, and
		// // then used after the loop terminates. Since x was only scoped for the loop, using it outside
		// // the loop will throw a compiler error.



		String[] names = new String[3];
		for(int name : names) { // DOES NOT COMPILE
			System.out.print(name + " ");
		}

		// This code will fail to compile because the left-hand side of the for-each statement does
		// not defi ne an instance of String . Notice that in this last example, the array is initial-
		// ized with three null pointer values. In and of itself, that will not cause the code to not
		// compile, as a corrected loop would just output null three times.

		String[] names = new String[3];
		for(String name : names) { // null null null
			System.out.print(name + " ");
		}

		java.util.List<String> names = new java.util.ArrayList<String>();
		names.add("Lisa");
		names.add("Kevin");
		names.add("Roger");
		for(int i=0; i<names.size(); i++) {
			String name = names.get(i);
			if(i>0) {
				System.out.print(", "); //, #{name}
			}
				System.out.print(name);
		}

		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		OUTER_LOOP: for(int[] mysimple: myComplexArray) {
			INNER_LOOP: for (int i = 0; i < mysimple.length; i++) {
				System.out.println(mysimple[i] + " ");
			}

			System.out.println();
		}
	}
}