package org.in.cdac;

public class ProductOfArrayNumbers {
	public static int productOfArray(int[] arr, int n) {
	    if (n == 0) {
	        return 1;
	    }
	    return arr[n-1] * productOfArray(arr, n-1);
	}
public static void main(String[] args) {
	
	int[] arr = { 1, 2, 3, 4, 5 };
	System.out.println( "Product is "+productOfArray(arr, arr.length)); 
	
}
}
