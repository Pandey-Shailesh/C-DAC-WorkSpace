package org.fi.test;

public class Program {
public static void main(String[] args) {
	Account objAccount = new Account();
	objAccount.setAccountNo(1721);
	objAccount.setBalance(10000);
	
	
	IncrementThread deposite = new IncrementThread(objAccount);
	DecrementThread withdrawer = new DecrementThread(objAccount);
	
	
	Thread runner = new Thread(withdrawer);
	deposite.start();
	runner.start();
}
}
