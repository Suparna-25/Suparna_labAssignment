/**
 * Desc: This class holds all the  transaction details
 * @ author-Suparna Arya
 */
package Lab4;

import java.util.Random;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		/* 
		 * This Random class provides rand() method that generates auto generated account
		 *  number
		 */
		long accNum=rand.nextLong();
		long acNum=rand.nextLong();
		
		Person p1=new Person("Kathy",25);
		Account ac=new Account(accNum,3000,p1);
		System.out.println("Kathy's initial account balance is "+ac.getBalance());
		Person p2=new Person("Smith",30);
		Account acc=new Account(acNum,2000,p2);
		System.out.println("Smith's initial account balance is "+acc.getBalance());
		acc.deposit(2000);
		System.out.println("Smith's updated account balance is "+acc.getBalance());
		ac.withdraw(2000);
		System.out.println("Kathy's updated account balance is "+ac.getBalance());
	}

}
