package shubham.array;

public class MaxProduct {

	public static void main(String[] args) {
		System.out.println(maxProduct(new int[] { 10, 20, 30, 40, 50, 60 }));
	}

	public static String maxProduct(int[] intArray) {
		int maxProd = 0;
		String result = "";

		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] * intArray[j] > maxProd) {
					maxProd = intArray[i] * intArray[j];
					result = "(" + intArray[i] + "," + intArray[j] + ")";
				}
			}
		}
		return result;
	}
}
