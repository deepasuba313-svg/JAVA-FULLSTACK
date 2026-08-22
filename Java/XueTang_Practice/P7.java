import java.util.Scanner;
import java.lang.Math.*;
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int isprime=0;
		int result =0;
		P7 obj=new P7();
		 result=obj.SumOfDigit(a);
		 isprime=obj.IsPrime(result);
		if(isprime==1) 
		 	System.out.println("output "+result);
		else 
			
			System.out.println("Is not a prime");
			 		
		}
		



	private int IsPrime(int result) {
		// TODO Auto-generated method stub
		boolean flag=true;
		if(result <=1)
			return -1;
		for(int i=2;i<=Math.sqrt(result);i++)
		{
			if(result%i==0) {
				flag=false;
				break;
			}
		}
		if(flag)
			return 1;
		else
			return -1;
	}



	private int SumOfDigit(int a) {
		// TODO Auto-generated method stub
		int sum=0,sum1=0;	
		while(a>0)
		{
			int digit=a%10;
			sum=sum+digit;
			a=a/10;
		}
		
		while(sum>0)
		{
			int digit=sum%10;
			sum1=sum1+digit;
			sum=sum/10;
		}
		return sum1;	
	
	}

}
