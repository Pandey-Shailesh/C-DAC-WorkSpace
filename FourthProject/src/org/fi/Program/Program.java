package org.fi.Program;

import org.fi.base.Base;
import org.fi.base.Derived;

public class Program {
public static void main(String[] args) {
	 Base objBase = new Base();
	  objBase.display();
	  
	  Derived objDerived = new Derived();
	  objDerived.show();
}
}
