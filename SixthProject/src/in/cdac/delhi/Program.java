package in.cdac.delhi;

public class Program {
public static void main(String[] args) {
	
	ParentClass objParent = new ParentClass();
	objParent.printParent();
	ChildClass objChild = new ChildClass();
	objChild.printChild();
	objChild.printParent();
}
}
