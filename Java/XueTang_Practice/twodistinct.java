import java.util.*;
public class twodistinct {

	private static Object max;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int a = ip.nextInt();
		int arr[] = new int[a];
		readArray(arr,a);
		subarray(arr,a);
	}

	private static void subarray(int[] arr, int a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
		    int first = arr[i];
		    int second = Integer.MIN_VALUE;
		    int count = 0;

		    for (int j = i; j < arr.length; j++) {

		        if (arr[j] == first) {
		            count++;
		        }
		        else if (second == Integer.MIN_VALUE || arr[j] == second) {
		            second = arr[j];
		            count++;
		        }
		        else {
		            break;
		        }
		    }

		   int max = Math.max(max, count);
		}
	}

	private static void readArray(int[] arr, int a) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		for(int i=0;i<a;i++)
		{
			System.out.print("Enter the value of the array: " + (i + 1) + " : ");
			arr[i] = ip.nextInt();
		}
	}
}
