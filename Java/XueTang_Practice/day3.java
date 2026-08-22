
public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=12231221;
		 int b=1;
		int count =0;
		//int reversed=0;
		while(number>0)
		{
			int digit=number%10;
			//reversed=reversed*10+digit;
			number=number/10;
			if(digit==b)
				count++;
		}
		System.out.println(count);
	}	

}
