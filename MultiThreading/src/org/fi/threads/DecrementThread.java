package org.fi.threads;

public class DecrementThread implements Runnable {

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("Decrement");
				Thread.sleep(25);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
