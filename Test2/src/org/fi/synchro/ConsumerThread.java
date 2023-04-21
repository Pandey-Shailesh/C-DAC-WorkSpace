package org.fi.synchro;

import java.util.ArrayList;

public class ConsumerThread extends Thread{
	Point point;
	ArrayList<Point> arrayList = new ArrayList<>();
	@Override
	public void run() {
		int iTemp =15;
			try {
				while(true) {
					synchronized(point)
					{
						if (iTemp<250) 
							arrayList.add(point);
						else if(iTemp>=15)
							arrayList.add(point);
						else
							arrayList.remove(point);
							
						}
						Thread.sleep(25);
					}
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
	}
}
