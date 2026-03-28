package lab06;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Matritsiin hemjigch");

			System.out.print("yildel oruul (+, -, *): ");
			String op = sc.next();

			System.out.print("1matritsiin mur: ");
			int r1 = sc.nextInt();
			System.out.print("1matritsiin bagana: ");
			int c1 = sc.nextInt();

			int[][] a = new int[r1][c1];
			System.out.println("1 matritsiin too oruul:");
			for (int i = 0; i < r1; i++) {
			    for (int j = 0; j < c1; j++) {
			        a[i][j] = sc.nextInt();
			    }
			}

			System.out.print("2-р mur: ");
			int r2 = sc.nextInt();
			System.out.print("2- bagana: ");
			int c2 = sc.nextInt();

			if ((op.equals("+") || op.equals("-")) && (r1 != r2 || c1 != c2)) {
			    System.out.println("aldaa: nemeh hasah vildel ijel baih ystoi!");
			    return;
			}
			if (op.equals("*") && c1 != r2) {
			    System.out.println("aldaa: vrjih bolomjgvi (c1 != r2)!");
			    return;
			}

			int[][] b = new int[r2][c2];
			System.out.println("2 too oruulnu:");
			for (int i = 0; i < r2; i++) {
			    for (int j = 0; j < c2; j++) {
			        b[i][j] = sc.nextInt();
			    }
			}

			
			if (op.equals("+")) {
			    int[][] res = new int[r1][c1];
			    for (int i = 0; i < r1; i++) {
			        for (int j = 0; j < c1; j++) {
			            res[i][j] = a[i][j] + b[i][j];
			        }
			    }
			    printMatrix(res);
			} 
			else if (op.equals("-")) {
			    int[][] res = new int[r1][c1];
			    for (int i = 0; i < r1; i++) {
			        for (int j = 0; j < c1; j++) {
			            res[i][j] = a[i][j] - b[i][j];
			        }
			    }
			    printMatrix(res);
			} 
			else if (op.equals("*")) {
			    int[][] res = new int[r1][c2];
			    for (int i = 0; i < r1; i++) {
			        for (int j = 0; j < c2; j++) {
			            for (int k = 0; k < c1; k++) {
			                res[i][j] += a[i][k] * b[k][j];
			            }
			        }
			    }
			    printMatrix(res);
			}
		}
    }

   
    public static void printMatrix(int[][] m) {
        System.out.println("\n Vr dvn:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t"); 
            }
            System.out.println();
        }
    }
}
