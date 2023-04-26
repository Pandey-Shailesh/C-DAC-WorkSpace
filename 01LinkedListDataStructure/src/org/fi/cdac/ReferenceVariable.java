package org.fi.cdac;

class Demo {
	int x = 200;

	public int display() {
		System.out.println("value of x: " + x);
		return 0;
	}
}

public class ReferenceVariable {

	public static void main(String[] args) {
		Demo obj1 = new Demo();
		Demo obj2 = obj1;
		System.out.println(obj1.x);
		System.out.println(obj2.x);

	}

}
