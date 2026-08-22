import java.util.*;
public class Arrayrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=100;
		int arr[]= {1,2,3,4,5};
	int res=	rotatearray(arr,k);
		System.out.print(res);
	}

	private static int rotatearray(int[] arr, int k) {
		// TODO Auto-generated method stub
		int length=0,min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			int left=0,right=0;
			for(int j=i;j<arr.length;j++)
			{
				sum+=arr[j];
				if(sum>=k)
				{
					length=j-i+1;
					if(length<min)
						min=length;
				}
			}
		}
		
		if(min!=Integer.MAX_VALUE)
			return min;
		else
			return -1;
	}
}
