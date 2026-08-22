import java.util.*;
public class missingnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int a = ip.nextInt();
		int arr[] = new int[a];
		readArray(arr,a);
		missingNum(arr,a);
	}

	private static void missingNum(int[] arr, int a) {
		// TODO Auto-generated method stub
		int total=a*(a+1)/2;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(total-sum);
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
