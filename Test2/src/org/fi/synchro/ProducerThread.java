package org.fi.synchro;

public class ProducerThread extends Thread {
final int AMPLITUDE =100;
int Ang;
int frequency;
double yPiont =AMPLITUDE*(Math.sin(Ang*Math.PI)/180);
int xpoint= 2*frequency;
}
