package lesson2;

/**
 * Rotates an array to the right or left by a given number of steps.
 * Created by Jonas Eiselt on 2018-09-27.
 */
public class CyclicRotation {

	public int[] rotate(int[] A, int K) {
		int size = A.length;
		if (size == 0)
			return A;
		
		int shifts = -(K%size); // handle left shifts
		int[] B = new int[size];

		if (shifts == 0)
			return A;
		else {
			for (int i = 0; i < size; i++) {
				B[i] = A[((size+shifts)+i)%size];
				System.out.print(B[i] + " ");    
			}
			System.out.println();
		}
		return B;
	}
}
