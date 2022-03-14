package shubham.array;

/** Check whether the given array is a permutation of another array */
public class Permutation {

	public static void main(String[] args) {
		System.out.println(permutation(new int[] {1, 2, 3, 4, 5}, new int[] {5, 1, 2, 3, 4}));
	}

	public static boolean permutation(int[] array1, int[] array2) {
		if (array1.length != array2.length)
			return false;
		else {
			for (int i = 0; i < array1.length; i++) {
				boolean isPresent = false;
				for (int j = 0; j < array1.length; j++) {
					if (array1[i] == array2[j]) {
						isPresent = true;
						break;
					}
				}
				if (isPresent == false) {
					return false;
				} else
					continue;
			}
			return true;
		}
	}
}
