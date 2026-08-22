import java.util.*;

public class level4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the size of the array(row): ");
		int a = ip.nextInt();
		System.out.print("Enter the size of the array(column): ");
		int b = ip.nextInt();
		int arr[][] = new int[a][b];
		System.out.println("Enter the value for A matrix:");
		for (int i = 0; i < a; i++) {

			for (int j = 0; j < b; j++) {
				System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "] : ");
				arr[i][j] = ip.nextInt();
			}
		}
		System.out.println("Enter the value for B matrix:");
		int arr1[][] = new int[a][b];
		for (int i = 0; i < a; i++) {

			for (int j = 0; j < b; j++) {
				System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "] : ");
				arr1[i][j] = ip.nextInt();
			}
		}

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		// Matrix multiplication
//		int arr2[][] = new int[a][b];
//		for (int i = 0; i < a; i++) {
//			for (int j = 0; j < b; j++) {
//				
//				 arr2[i][j] = 0;
//
//			        for(int k = 0; k < b; k++)
//			        {
//			           
//			        }
//			}
//		}

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
