package org.in.search;

public class BinarySearchAlgorithm {

	private int binarySearch(int array[], int searchValue) {
		int start = 0;
		int end = array.length - 1;
		int middle = (start + end) / 2;
		while (array[middle] != searchValue && start <= end) {
			if (searchValue < array[middle]) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
			middle =(start+end)/2;
		}
		if (array[middle]==searchValue) {
			System.out.println("The element found at the position : "+middle);
			return middle;
		}
		else {
			System.out.println("the element not found");
			return -1;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 8, 9, 10 };
		BinarySearchAlgorithm objBinarySearchAlgorithm = new BinarySearchAlgorithm();
		objBinarySearchAlgorithm.binarySearch(arr, 9);

	}
}
