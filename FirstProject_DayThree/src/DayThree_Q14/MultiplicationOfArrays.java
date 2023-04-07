package DayThree_Q14;
import java.util.Arrays;

import gettingInputs.ConsoleInput;

public class MultiplicationOfArrays {

	public static void main(String[] args) {

		System.out.println("Enter the Size of array ");
		int n = ConsoleInput.getInteger();
		int arr1[] = new int[n];
		for (int itemp=0; itemp<n; itemp++) {
			System.out.println("Enter an "+(itemp+1)+" integer of First Array");
			arr1[itemp] = ConsoleInput.getInteger();
		}
		
		int arr2[] = new int[n];
		for (int jtemp=0; jtemp<n; jtemp++) {
			System.out.println("Enter an "+(jtemp+1)+" integer of Second Array");
			arr2[jtemp] = ConsoleInput.getInteger();
		}
		int result[] = new int[n];
		
		for (int ktemp =0; ktemp < arr2.length; ktemp++) {
			result[ktemp] = arr1[ktemp]*arr2[ktemp];
		}
		System.out.println("Array1 :"+ Arrays.toString(arr1));
		System.out.println("Array2 :"+ Arrays.toString(arr2));
		System.out.println("Result :"+ Arrays.toString(result));
	}
}
