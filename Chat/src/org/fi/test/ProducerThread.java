package org.fi.test;

import java.util.LinkedList;

public class ProducerThread extends Thread{
	  private LinkedList<Point> points;
	    private final int AMPLITUDE = 100;
	    private final double PIE = 3.14;
	    private int ANG = 0;
	    private final int FREQUENCY = 2;

	    public ProducerThread(LinkedList<Point> points) {
	        this.points = points;
	    }

	    public void run() {
	        while (true) {
	            synchronized (points) {
	      // If the size of the LinkedList is more than 250, wait until the size is reduced to 15
	                while (points.size() > 250) {
	                    try {
	                        points.wait();
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }

	                double yPoint = (AMPLITUDE) * (Math.sin(ANG * PIE) / 180);
	                int xPoint = 0;
	                synchronized (points) {
	                    if (!points.isEmpty()) {
	                        xPoint = points.getLast().getXPoint() + (2 * FREQUENCY);
	                    }
	                    points.add(new Point(xPoint, yPoint));
	                    points.notifyAll();
	                }

	                ANG += 3;
	                if (ANG == 360) {
	                    ANG = 0;
	                }
	            }
	        }
	    }
}
