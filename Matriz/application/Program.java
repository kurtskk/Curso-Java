package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();
		int up = 0;
		int positionLine = 0;
		int positionColune = 0;
		int left = 0;
		int right = 0;
		int down = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				if (mat[i][j] == x) {
					positionLine = i;
					positionColune = j;

					System.out.println("Position " + positionLine + "," + positionColune + ":");
					if (j > 0) {
						left = mat[i][j - 1];
						System.out.println("Left: " + left);
					}
					if (i > 0) {
						up = mat[i - 1][j];
						System.out.println("Up: " + up);
					}
					if (j + 1 < mat[i].length) {
						right = mat[i][j + 1];
						System.out.println("Right: " + right);
					}
					if (i + 1 < mat.length) {
						down = mat[i + 1][j];
						System.out.println("Down: " + down);
					}
				}
			}
		}
	}
}
