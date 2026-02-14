import java.util.*;
class base
{
	private int bankaccount;
	private int amount=0;
	private int deposit;
	private int withdrawal;
	public void bankacc(int newacc)
	{
		this.bankaccount=newacc;
		System.out.println("Account created successfully!!!");
	}
	
	public void amtdep(int amt)
	{
		this.deposit=amt;
		if(deposit >0)
		{
			amount =amount+deposit;
			System.out.println("Deposited Amount: Rs. "+deposit);
		}
		else
			System.out.println("Invalid amount !!!");
	}
	public void withdraw(int amtwtd)
	{
		this.withdrawal=amtwtd;
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
	
	public void viewbalance()
	{
		System.out.println("Your bank balance: "+amount);
	}
	
	public void exit()
	{
		System.out.println("Exiting.....");
	}
	
	
	
}
public class Oopconcept 
{
public static void main(String args[])
{
	int bankaccount;
	int deposit;
	int withdrawal;
	Scanner ip=new Scanner(System.in);
	System.out.println("-----Welcome to Bank Management System-----");
	System.out.println("Do you want to use our system?");
	System.out.println("If yes please type \"Y\" else type \"N\"");
	String choice=ip.next();
	base depamt=new base();
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
				depamt.bankacc(bankaccount);
				break;
			}
			
		case 2:
		{
			System.out.print("Enter the Deposit amount:");
			deposit=ip.nextInt();
			depamt.amtdep(deposit);
			break;
		}
		
		case 3:
		{
			System.out.print("Please enter the withdraw amount:");
			withdrawal=ip.nextInt();	
			depamt.withdraw(withdrawal);
			break;
		}
		
		case 4:
		{
			depamt.viewbalance();
			break;
		}
		case 5:
			depamt.exit();
			System.exit(0);
		}
		}
	}
	ip.close();
}
}
