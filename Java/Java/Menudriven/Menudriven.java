import java.util.Scanner;
import java.util.*;
public class Menudriven 
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
		while(true)
		{
		System.out.println("Choose any one choice: ");
		System.out.println("\n1.Add Account\n2.Deposit\n3.withdraw\n4.Veiw Balance\n5.Exit");
		System.out.print("Enter you choice:");
		int ch=ip.nextInt();
		switch(ch)
		{
		case 1:
			{
				System.out.print("Enter you account number: ");
				bankaccount=ip.nextInt();
				System.out.println("Account created successfully!!!");
				break;
			}
		case 2:
			{
				System.out.print("Enter the Deposit amount:");
				deposit=ip.nextInt();
				if(deposit >0)
				{
					amount =amount+deposit;
					System.out.println("Deposited Amount: Rs. "+deposit);
				}
				else
					System.out.println("Invalid amount !!!");
				break;
			}
			
		case 3:
			{
				System.out.print("Please enter the withdraw amount:");
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
				break;
			}
			
		case 4:
			System.out.println("Your bank balance: "+amount);
			break;
		case 5:
			System.out.println("Exiting.....");
			System.exit(0);
		}
		
	}
	}
	else 
	{
		System.out.println("Thank you for using this system...");
	}
}
}

