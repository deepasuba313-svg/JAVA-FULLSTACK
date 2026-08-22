package Day27_07;

import java.util.*;
class Solution {
    public static void main(String args[])
    {
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
		 for(int i=0;i<nums1.length;i++)
	        {
	            arr[i]=nums1[i];
	        }
		 
	        for(int i=0;i<nums2.length;i++)
	        {
	             arr[i+nums1.length]=nums2[i];
	        }
	        Arrays.sort(arr);
	        for(int i=0;i<arr.length;i++)
	        {
	            System.out.print(arr[i]);
	        }
	        System.out.println(" ");
	         double mid = 0.0;
	         int len=0;
	         len=arr.length;
	         
	         if(len%2!=0)
	         {
	        	mid= arr[len/2] ;
	         }
	         else
	        	mid= (arr[(len/2)-1] + arr[len/2]) / 2.0;
	         
	         System.out.println(mid);
	}

	private static void readArray1(int[] nums2, int a) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		for(int i=0;i<a;i++)
		{
			System.out.print("Enter the  elements: "+(i+1) +" : ");
			nums2[i]=ip.nextInt();
		}
	}

	private static void readArray(int[] nums1, int a) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		for(int i=0;i<a;i++)
		{
			System.out.print("Enter the  elements: "+(i+1) +" : ");
			nums1[i]=ip.nextInt();
		}
	}
}