package shubham.array;

public class Unique {

	public static void main(String[] args) {
		System.out.println(isUnique(new int[] { 1, 2, 3, 4, 5, 6, 5 }));
	}

	public static boolean isUnique(int... intArray) {
		boolean unique = true;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] == intArray[j]) {
					unique = false;
					break;
				}
			}
		}
		return unique;
	}

}
