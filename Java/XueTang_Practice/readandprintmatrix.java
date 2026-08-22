import java.util.*;

public class readandprintmatrix {
	public static void main(String args[]) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the size of the array(row): ");
		int a = ip.nextInt();
		System.out.print("Enter the size of the array(column): ");
		int b = ip.nextInt();
		int arr[][] = new int[a][b];
		for (int i = 0; i < a; i++) {

			for (int j = 0; j < b; j++) {
				System.out.print("Enter the matrix element " + (i + 1) + " : ");
				arr[i][j] = ip.nextInt();
			}
		}
		
		for (int i = 0; i < a; i++) {

		    for (int j = 0; j < b - 1; j++) {

		        for (int k = j + 1; k < b; k++) {

		            if (arr[i][j] > arr[i][k]) {
		                int temp = arr[i][j];
		                arr[i][j] = arr[i][k];
		                arr[i][k] = temp;
		            }
		        }
		    }
		}

		for (int i = 0; i < a; i++) {
		    for (int j = 0; j < b; j++) {
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}
