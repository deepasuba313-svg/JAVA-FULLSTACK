import java.util.*;
import java.util.ArrayList;

public class Kelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int a = ip.nextInt();
		System.out.print("Enter the Kth value: ");
		int k = ip.nextInt();
		int arr[] = new int[a];
		Kelement obj = new Kelement();
		obj.readArray(arr, a);
		obj.largestelement(arr, a, k);
	}

	private void largestelement(int[] arr, int a, int k) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		int max = 0;
		for (int j = 0; j < k; j++) {
			max = list.get(0);
			for (int i = 0; i < list.size(); i++) {
				if (max < list.get(i)) {
					max = list.get(i);
				}
			}
			list.remove((Integer) max);

			list1.add(max);
		}

		System.out.println(list);
		System.out.println(list1.getLast());
	}

	private void readArray(int[] arr, int a) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		for (int i = 0; i < a; i++) {
			System.out.print("Enter the value of the array: " + (i + 1) + " : ");
			arr[i] = ip.nextInt();
		}
	}

}
