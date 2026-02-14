import java.util.Scanner;
public class Main 
{
public static void main(String args[])
{
	int bankaccount;
	int amount=0;
	int bankbalance;
	int deposit;
	int withdrawal;
	Scanner ip=new Scanner(System.in);
	System.out.println("-----Welcome to Bank Management System-----");
	System.out.println("Do you want to use our system?");
	System.out.println("If yes please type \"Y\" else type \"N\"");
	String choice=ip.next();
	if(choice.equalsIgnoreCase("Y"))
	{
		System.out.println("Please enter you account number:");
		bankaccount=ip.nextInt();
		System.out.println("Enter the Deposit amount:");
		deposit=ip.nextInt();
		if(deposit >0)
		{
			amount =amount+deposit;
			System.out.println("Deposited Amount: Rs. "+deposit);
		}
		else
			System.out.println("Invalid amount !!!");
		
		System.out.println("Please enter the withdraw amount:");
		withdrawal=ip.nextInt();
		if(withdrawal >0 && withdrawal<amount)
		{
			amount=amount-withdrawal;
			System.out.println("Balance Amount: Rs. "+amount);
		}
		else if(withdrawal==0)
		{
			System.out.println("Invalid withdrawal !!!");
		}
	}
	else
	{
		System.out.println("Thank you using our system !!!\n Exiting...");
	}
}
}

