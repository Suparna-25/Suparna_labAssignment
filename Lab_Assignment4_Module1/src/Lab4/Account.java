package Lab4;
import java.util.*;
class Account {
	private long accNum;
	private double balance;
	private Person accHolder;

	public Account(long accNum, double balance, Person accHolder) {
		Random rand =new Random();
		this.accNum = accNum;
		if(balance>=500)
		{
			this.balance = balance;
		}
		this.accHolder =accHolder ;
		
	}
	void deposit(double amount)
	{
		balance+=amount;
	}
	void withdraw(double amount)
	{
		if(balance>=500)
		{
			balance-=amount;
		}
	
	}
	void setAccNum(long accNum)
	{
		this.accNum=accNum;
	}
	void setBalance(double balance)
	{
	  if(balance>=500)
	{
		this.balance = balance;
	}
	}
	void setAccHolder(Person accHolder)
	{
		this.accHolder = accHolder;
	}
	long getAccNum()
	{
		return accNum;
	}
	double getBalance()
	{
		return balance;
	}
	Person getAccHolder()
	{
		return accHolder;
	}
	
}
