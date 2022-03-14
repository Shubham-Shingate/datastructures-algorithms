package shubham.array;

/**
 * Find a given number in an array and return the index where its found
 */
public class FindNumber {

	public static void main(String[] args) {

		int resultIndex = searchInArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 8);
		System.out.println(resultIndex);
	}

	public static int searchInArray(int[] intArray, int valueToSearch) {
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == valueToSearch)
				return i;
		}
		return -1;
	}
}
