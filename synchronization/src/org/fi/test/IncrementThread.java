package org.fi.test;

public class IncrementThread extends Thread{

	Account account;
	public IncrementThread(Account account) {
		super();
		this.account=account;
	}
	@Override
	public void run() {
		try {
			while(true) {
				synchronized(account)
				{
					float balance =account.getBalance();
					balance=balance+10;
					account.setBalance(balance);
					System.out.println("Depositor Thread :"+account.getBalance());
					Thread.sleep(25);
				}
			}
		}catch(InterruptedException e) {
			System.out.println("hello");
		}
	}
	
	
}
