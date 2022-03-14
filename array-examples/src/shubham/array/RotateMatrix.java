package shubham.array;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] mat = new int[3][3];
		mat[0][0] =  1;
		mat[0][1] =  2;
		mat[0][2] =  3;
		
		mat[1][0] =  4;
		mat[1][1] =  5;
		mat[1][2] =  6;
		
		mat[2][0] =  7;
		mat[2][1] =  8;
		mat[2][2] =  9;
		rotateMatrix(mat);
	}
	
	public static boolean rotateMatrix(int[][] matrix) {
		int[][] mat = new int[3][3];
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = matrix[0].length - 1; j >= 0; j--) {
				mat[i][matrix[0].length - 1 - j] = matrix[j][i];
			}
		}
		matrix = mat;		
		return true;
	}
}
