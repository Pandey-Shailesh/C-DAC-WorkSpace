package org.fi.test;

import java.util.LinkedList;

public class Program {
	    public static void main(String[] args) {
	        LinkedList<Point> points = new LinkedList<>();
	        ProducerThread producerThread = new ProducerThread(points);
	        ConsumerThread consumerThread = new ConsumerThread(points);

	        producerThread.start();
	        consumerThread.start();
	    }
	}

	
	
	
	
	
	
	
	
	
	
	

