package org.fi;

public class File1 {
//static int var=10;
//private void get() {
//	int value=10;
//}
//private void get(int x) {}
public static void main(String[] args) {
	
	int [] arra= {1,2,3,5,6,7,8,9,10};
	int totalSumOfTenNumbers=55;
	int sum=0;
	for (int iTemp = 0; iTemp < arra.length; iTemp++) {
		sum=sum+arra[iTemp];
	}
	
	int findValue = totalSumOfTenNumbers-sum;
	System.out.println(findValue);
	
}
}
//class missingNumber {
//	
//    public static int findMissingNo(int[] arr) {
//    	int n = arr.length + 1;
//    	int totalSum = (n * (n + 1))/2;
//    	
//    	int actualSum = 0;
//    	for(int count : arr) {
//    		actualSum += count;
//    	}
//    	return totalSum - actualSum;
//    }
//}
//
//class Main {
//
//	public static void main(String[] args) {
//		
//		int[] ar = {1,2,3,5,6,7,8,9,10}; // 4 is missing 
//		
//		System.out.println(missingNumber.findMissingNo(ar));
//		
//		}
//	}