package shubham.array;

import java.util.Arrays;

public class AdjustArray {
	public static void main(String[] args) {

		int[] arrA = new int[] { 1, 3, 9, 11, 0, 0, 0 };
		int[] arrB = new int[] { 4, 8, 10 };

		int ptr = arrB.length - 1;
		int k = arrA.length - 1;
		int flag = 0;

		for (int i = arrA.length - 1; i >= 0; i--) {
			if (arrA[i] != 0) {
				if (ptr < 0)
					break;
				if (arrA[i] > arrB[ptr]) {
					arrA[k - flag - 1] = arrB[ptr];
					arrA[k - flag] = arrA[i];
					k--;
					ptr--;
					flag++;
				} else {
					arrA[k - flag - 1] = arrA[i];
					arrA[k - flag] = arrB[ptr];
					k--;
					ptr--;
					flag++;
				}
			}
		}
		System.out.println(Arrays.toString(arrA));
	}
}
