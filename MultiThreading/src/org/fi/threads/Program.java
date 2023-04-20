package org.fi.threads;

public class Program {

	public static void main(String[] args) throws Exception {
		
		
		IncrementThread incThread = new IncrementThread();
		incThread.start();
		DecrementThread target = new DecrementThread();
		
		Thread decThread = new Thread(target);
		decThread.start();
		
		Runnable thirdTarget = () ->{
			
										try {
											while (true) {
												System.out.println("Lambda thread");
												Thread.sleep(25);
											}
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
									
									};
		
		
		
		Thread thirdThread = new Thread(thirdTarget);
		thirdThread.start();
		
		
		
		while(true) {
			System.out.println("Main Function");
			Thread.sleep(25);
		}
		
	}
}
