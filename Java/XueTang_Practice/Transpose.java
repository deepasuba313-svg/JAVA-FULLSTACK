import java.util.*;

public class Transpose {

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

		int arr1[][] = new int[a][b];
		int i = 0, j = 0;
//		int k = 0;
//		while (i < a - 1 && j < b - 1) {
//			for (i = 0; i < b; i++) {
//				for (j = 0; j < a; j++) {
//					if (i == k)
//						arr1[k][j] = arr[j][k];
//				}
//				k++;
//			}
//
//		}
		
	//	System.out.println("First Loop: ");

		for (i = 0; i < a; i++) {
			for (j = b - 1; j >= 0; j--) {
				arr1[i][j]=arr[i][j];
			}
		}
		int arr2[][] = new int[a][b];
		System.out.println("First loop:");
		for (i = a-1; i>=0; i--) {
			for (j = 0; j < b; j++) {
				arr2[a-1-i][j]=arr1[i][j];
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();

		}
//		System.out.println("Second loop:");
//		for (i = 0; i < a; i++) {
//		    for (j = 0; j < b; j++) {
//		        System.out.print(arr2[i][j] + " ");
//		    }
//		    System.out.println();
//		}
		System.out.println("Second loop:");
		for (i = 0; i < a; i++) {
			for (j = b - 1; j >= 0; j--) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();

		}
	}

}


//while(i<a-1 && j<b-1)
//{
//   for(i=0;i<b;i++)
//   {
//    for(j=0;j<a;j++)
//    {
//        if(i==k)
//            arr[k][i]=matrix[j][k];
//    }
//     k++;
//   }
//  
//}