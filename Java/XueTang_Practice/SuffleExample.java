import java.util.*;

public class SuffleExample {
	public static void main(String[] args) {
		// Create a list of numbers
		Scanner ip = new Scanner(System.in);
		System.out.print("Please enter the array size: ");
		int a = ip.nextInt();
		int arr[] = new int[a];
		readArray(arr, a);
		shuffle(arr, a);
	}

	private static void shuffle(int[] arr, int a) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1= new ArrayList<>();
		
		for(int i=0;i<a;i++)
		{
			int product=1;
			for(int j=0;j<a;j++)
			{
				if(j !=i)
					product*=arr[j];
			}
			list1.add(product);
		}
		 System.out.println(list1);
	}

	private static void readArray(int[] arr, int a) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		for (int i = 0; i < a; i++) {
			System.out.print("Please enter the array values " + (i + 1) + " : ");
			arr[i] = ip.nextInt();

		}
	}
}
