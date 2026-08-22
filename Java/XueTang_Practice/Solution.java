import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // write your code here
        // read data from console
        
        // output the answer to the console according to the
        // requirements of the question
        Scanner ip=new Scanner(System.in);
        int a=ip.nextInt();
        int arr[][]=new int[a][a];
        int k=1;
        for(int i=0;i<arr.length;i++)
        {
        	
            for(int j=0;j<arr[0].length;j++)
            {
            	arr[i][j]=k;
            	k++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }

            System.out.println();
        }
    }
}