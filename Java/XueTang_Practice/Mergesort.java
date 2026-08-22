/**
 * 
 */

/**
 * 
 */
import java.util.Arrays;
import java.util.Scanner;
public class Mergesort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
    	System.out.print("Enter the number of elements: ");
    	int a=ip.nextInt();
    	int nums1[]=new int[a];
    	int nums2[]=new int[a];
    	
    	 readArray(nums1, a);
         readArray1(nums2, a);
         mergearray(nums1,nums2);
	}

	private static void mergearray(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		int arr[]=new int[nums1.length+nums2.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < nums1.length && j < nums2.length) {
		    if (nums1[i] < nums2[j]) {
		        arr[k] = nums1[i];
		        i++;
		    } else {
		        arr[k] = nums2[j];
		        j++;
		    }
		    k++;
		}
		while (i < nums1.length) {
		    arr[k] = nums1[i];
		    i++;
		    k++;
		}

		while (j < nums2.length) {
		    arr[k] = nums2[j];
		    j++;
		    k++;
		}
		
			System.out.print(Arrays.toString(arr));
		
		
	}

	private static void readArray1(int[] nums2, int a) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter the values for Second Array: \n");
		for(int i=0;i<a;i++)
		{
			System.out.print("Enter the  elements "+(i+1) +" : ");
			nums2[i]=ip.nextInt();
		}
	}

	private static void readArray(int[] nums1, int a) {
		// TODO Auto-generated method stub
		System.out.print("Enter the values for First Array: \n");
		Scanner ip=new Scanner(System.in);
		for(int i=0;i<a;i++)
		{
			System.out.print("Enter the  elements "+(i+1) +" : ");
			nums1[i]=ip.nextInt();
		}
	}

}
