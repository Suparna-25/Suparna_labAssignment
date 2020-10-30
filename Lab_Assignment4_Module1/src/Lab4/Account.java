/**
 * Desc: This class holds all operations related to a person's bank account
 * @ author-Suparna Arya
 */
package Lab4;
import java.util.*;
class Account {
	/* 
	 * all the accounts related data attributes are defined below
	 */
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
	/*
	 * This method describes deposit functionality of the account
	 * @param ammount is the balance need to be credited in the account.
	 */
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
	/*
	 * This method sets the account number
	 */
	void setAccNum(long accNum)
	{
		this.accNum=accNum;
	}
	/*
	 * This method sets the initial balance 
	 */
	void setBalance(double balance)
	{
	  if(balance>=500)
	{
		this.balance = balance;
	}
	}
	/*
	 * This method sets the account holder name
	 */
	void setAccHolder(Person accHolder)
	{
		this.accHolder = accHolder;
	}
	/*
	 * This method returns the account number
	 */
	long getAccNum()
	{
		return accNum;
	}
	/*
	 * This method returns the balance
	 */
	double getBalance()
	{
		return balance;
	}
	/*
	 * This method returns the account holder name
	 */
	Person getAccHolder()
	{
		return accHolder;
	}
	
}
