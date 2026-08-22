import java.util.*;
public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the arraysize: ");
		int a=ip.nextInt();
		int arr[]=new int[a];
		Subarray obj=new Subarray();
		obj.readArray(arr,a);
		obj.IncreasingSubarray(arr,a);
	}

	private void IncreasingSubarray(int arr[], int a)
	{
	    int count = 1;
	    int max = 1;

	    for(int i = 1; i < a; i++)
	    {
	        if(arr[i] > arr[i - 1])
	        {
	            count++;
	        }
	        else
	        {
	            count = 1;
	        }

	        if(count > max)
	        {
	            max = count;
	        }
	    }

	    System.out.println(max);
	}

	private void readArray(int[] arr, int a) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		for(int i=0;i<a;i++)
		{
			System.out.print("Enter the element "+(i+1)+" :");
			arr[i]=ip.nextInt();
		}
	}

}
