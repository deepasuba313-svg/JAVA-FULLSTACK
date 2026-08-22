import java.util.Arrays;
import java.util.Scanner;
public class Pivot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
    	System.out.print("Enter the number of elements: ");
    	int a=ip.nextInt();
    	int arr[]=new int[a];
    	 readArray(arr, a);
    	 pivot(arr,a);
	}
	

	private static void pivot(int[] arr, int a) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			int left=0, right=0;
			for(int j=0;j<i;j++)
			{
				left += arr[j];
			}
			for(int j=i+1;j<arr.length;j++)
			{
				right+=arr[j];
			}		
			if(left== right)
				System.out.print(i);
			else
				System.out.print(-1);
		}
		
	}


	private static void readArray(int[] arr, int a) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		for(int i=0;i<a;i++)
		{
			System.out.print("Enter the  elements "+(i+1) +" : ");
			arr[i]=ip.nextInt();
		}
	// System.out.print(Arrays.toString(arr));
	}

}
