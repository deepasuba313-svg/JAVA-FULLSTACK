import java.util.*;
public class leetcode {

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

		//int arr1[][] = new int[a][b];
		int i = 0, j = 0,k=0;
		int arr1[][]=new int[a][b];
		
//		for ( j = b-1; j >= 0; j--)
//        {
//			for( i=a-1;i>=0;i--)	
//            {
//				System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
		for ( j = 0; j < b; j++)
        {
			
				for( i=a-1;i>=0;i--)
            {
				System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
		
//		 for (i = 0; i < a; i++)
//        {
//			 for ( j = b-1; j >= 0; j--)
//            {
//				System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
		
		
//		for( i=a-1;i>=0;i--)
//        {
//			for ( j = 0; j < b; j++)
//            {
//            	arr1[i][j]=arr[i][j];
//            }
//            System.out.println();
//        }
//        for (i = 0; i < a; i++) {
//			for ( j = 0; j < b; j++) {
//				System.out.print(arr1[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

}
