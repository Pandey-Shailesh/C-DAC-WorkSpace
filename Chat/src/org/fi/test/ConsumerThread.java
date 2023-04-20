package org.fi.test;

import java.util.LinkedList;

public class ConsumerThread extends Thread{
	private LinkedList<Point> points;

    public ConsumerThread(LinkedList<Point> points) {
        this.points = points;
    }

    public void run() {
        while (true) {
            synchronized (points) {
                // If the size of the LinkedList is less than or equal to 0, wait until a point is added
                while (points.size() <= 0) {
                    try {
                        points.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                Point point = points.removeFirst();
                System.out.println("Point: (" + point.getXPoint() + ", " + point.getYPoint() + ")");
                points.notifyAll();
            }
        }
    }
}
