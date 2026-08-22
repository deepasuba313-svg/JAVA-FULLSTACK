import java.util.Scanner;
import java.util.*;
public class counteven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int a=ip.nextInt();
		int arr[]=new int[a];
		counteven obj=new counteven();
		obj.readArray(arr,a);
		float avg=obj.findarray(arr,a);
		System.out.println("The average of the entered numbers are : ");
		System.out.println(avg);
		obj.counteven(arr,a,avg);
		
	}

	

	private int counteven(int[] arr, int a, float avg) {
		// TODO Auto-generated method stub
		List<Integer> list=new  ArrayList<>();
		List<Integer> list1=new  ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] %2 ==0)
				list.add(arr[i]);
			else 
				continue;
				
		}
		System.out.println("The even numbers which are greater than the average of the entered numbers are : ");
		for (int i=0;i<list.size();i++) {
            if(list.get(i)>avg)
            {
            	System.out.print(list.get(i)+ " " );
            }
        }
		return 0;
	}



	private float findarray(int[] arr, int a) {
		// TODO Auto-generated method stub
		float sum=0;
		for(int i=0;i<arr.length;i++)
		{
			 sum=sum+arr[i];
		}
		float avg=sum/arr.length;

		return avg;
	}



	private void readArray(int[] arr, int a) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		for(int i=0;i<a;i++)
		{
			System.out.print("Enter the array element: " +(i+1) + " :");
			arr[i]=ip.nextInt();
		}
	}

	

}
