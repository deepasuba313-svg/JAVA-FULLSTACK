import java.util.Scanner;
public class arrinc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Please enter the array size: ");
		int a=ip.nextInt();
		int arr[]=new int[a];
		arrinc obj=new arrinc();
		obj.readArray(arr,a);
		int res=obj.isIncreasing(arr,a);
		if(res==1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private int isIncreasing(int[] arr, int a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a;i++) 
		{
			for(int j=1;j<i;j++)
			{
				if(arr[i] < arr[j])
					return -1;
			}
		}
		return 1;
	}

	private void readArray(int[] arr, int a) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		for(int i=0;i<a;i++)
		{
			System.out.print("Please enter the array values " + (i+1) +" : ");
			arr[i]=ip.nextInt();
		}
	}

}
