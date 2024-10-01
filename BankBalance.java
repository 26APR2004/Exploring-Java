package util;
import java.util.*;

class BankSystem
{
	private  double balance;
	
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public void deposit(double amount)
	{
		if(amount>0)
			balance+=amount;
		
	      System.out.println(balance);
	}
	

public void withdraw(double amount)
{
	if(amount>0 && amount<=balance)
		{balance-=amount;
	    System.out.println(balance);}
	else
		System.out.println("Invalid amount or Insufficient amount");
}}

public class BankBalance {
	public static void main(String...args)
	{
		BankSystem p1=new BankSystem();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount :");
		double amount=sc.nextDouble();
		p1.setBalance(2000.0);
		
		
	
		System.out.println("Enter the 1 for Deposit Money");
		System.out.println("Enter the 2 for Withdraw Money");
		int n=sc.nextInt();
		
		switch(n)
		{
		
		case 1:
			System.out.println("Current Balance after deposition:");
		    p1.deposit(amount);
			break;
		case 2:
			System.out.println("Current Balance after withdraw money:");
		    p1.withdraw(amount);
			break;
		
			
		}
		
		
	}

}
