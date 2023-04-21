package org.fi.synchro;

public class ProducerThread extends Thread {
Point point;
final int AMPLITUDE =100;
int Ang;
int xpoint=0;
double yPiont;



@Override
public void run() {
	while (true) {
		try {
			yPiont =AMPLITUDE*(Math.sin(Ang*Math.PI)/180);
			xpoint=xpoint+2;
			point.setxPoint(xpoint);
			point.setyPoint(yPiont);
			Thread.sleep(25);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		}
	
}

}
