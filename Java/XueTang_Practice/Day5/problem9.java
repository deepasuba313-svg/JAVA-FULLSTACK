package Day5;
import java.util.Scanner;
public class problem9 {
public static void main(String args[])
{
	Scanner ip=new Scanner(System.in);
	System.out.print("Enter the number of elements: ");
	int a=ip.nextInt();
	int arr[]=new int[a];
	problem9 obj=new problem9();
	obj.readArray(arr, a);
	obj.countElements(arr,a);
}

private void countElements(int[] arr, int a) {
	// TODO Auto-generated method stub
	int pos=0,neg=0,zero=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>0)
			pos++;
		else if(arr[i]<0)
			neg++;
		else
			zero++;
	}
	System.out.println("Negative : "+neg);
	System.out.println("Positive : "+pos);
	System.out.println("Zero : "+zero);
	
}

private void readArray(int[] arr, int a) {
	// TODO Auto-generated method stub
	Scanner ip=new Scanner(System.in);
	for(int i=0;i<a;i++)
	{
		System.out.print("Enter the  elements: "+(i+1) +" : ");
		arr[i]=ip.nextInt();
	}
}
}

