package Day5;
import java.util.ArrayList;
import java.util.Scanner;
public class problem8a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int a=ip.nextInt();
		int arr[]=new int[a];
		problem8a obj=new problem8a();
		obj.readArray(arr,a);
		int res=obj.Secondelement(arr,a);	
		System.out.println("Result :"+res);
	}

	private int Secondelement(int[] arr, int a) {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr[arr.length-2];
		
	}

	private void readArray(int[] arr, int a) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		Scanner ip=new Scanner(System.in);
		for(int i=0;i<a;i++)
		{
			System.out.print("Enter the elements "+(i+1)+" :");
			arr[i]=ip.nextInt();
			if(!list.contains(arr[i]))
				
				list.add(arr[i]);
		}		
		
	}

}
