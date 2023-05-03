package org.in.search;

public class LinearSearchAlgorithm {

	private int leanerSearch(int array[], int searchValue) {
		for (int iTemp = 0; iTemp < array.length; iTemp++) {
			if (array[iTemp] == searchValue) {
				System.out.println("The vale is found at the index position : " + iTemp);
				return iTemp;
			}
		}
		System.out.println("the value not found");
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 8, 9, 2 };
		LinearSearchAlgorithm objLinearSearchAlgorithm = new LinearSearchAlgorithm();
		objLinearSearchAlgorithm.leanerSearch(arr, 8);

	}

}
