package org.fi.threads;

public class IncrementThread extends Thread {

	@Override
	public void run() {

		try {
			while (true) {
				System.out.println("Increment");
				Thread.sleep(25);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
