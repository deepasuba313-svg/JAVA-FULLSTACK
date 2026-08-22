import java.util.Scanner;
public class probelm8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		probelm8 obj=new probelm8();
		
		int arr[]= new int[a];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		int res=obj.readArray(arr);
		System.out.print(res);
		
	}

	private int readArray(int[] arr) {
		// TODO Auto-generated method stub
		int temp=0;
		int res=0;
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
			res=arr[arr.length-2];
		return res;
	}
}


