import java.util.*;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter the array Size: ");
		int a=ip.nextInt();
		int arr[]=new int[a];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the element at the index "+(i+1)+" : " );
			arr[i]=ip.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			System.out.print(sum+" ");
		}
	}

}
