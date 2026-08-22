
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=145,b=a;
		int result=0;
		while(a>0)
		{
			int digit=a%10;
			a=a/10;
			result = result + fact(digit);
		}
		if(result==b)
			System.out.println("True");
		else
			System.out.println("False");
	}

	private static int fact(int a) {
		// TODO Auto-generated method stub
		int result=0;
		if(a==0 || a==1)
			result =result+1;
		else
			result =  a * fact(a - 1);
		
		return result;
	}

}
