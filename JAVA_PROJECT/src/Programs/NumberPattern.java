package Programs;

public class NumberPattern {
public static void main(String[] args) {
	int number=1;
	  for (int itemp = 1; itemp <5; itemp++) {
	      for (int jtemp = 1; jtemp <= itemp; jtemp++) {
	    	  System.out.print(number+" ");
	         number++;
	      }
	    System.out.println(" ");
	   }
}
}
