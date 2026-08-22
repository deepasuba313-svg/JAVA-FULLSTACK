
public class FindingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 18;
		int a1[] = new int[10];
		int b1[] = new int[10];
		int count = 0;
		int res=0;

			for (int j = 1; j < a1.length; j++) {
				a1[j] = j * a;
			}


		
			for (int j = 1; j < b1.length; j++) {
				b1[j] = j * b;
			}

		for (int i = 1; i < a1.length; i++) {
			for (int j = 1; j < b1.length; j++) {
				if (a1[i] == b1[j])
				{ 
					count++;
					if(count ==1)
					{							
						res = a1[i];
						break;
					}
					
				}
			}
			  if (count == 1)
			        break;   

		}
		
		
				System.out.println(res);	
				
		
		}
}
