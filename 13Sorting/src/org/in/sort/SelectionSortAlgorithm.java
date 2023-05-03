package org.in.sort;

public class SelectionSortAlgorithm {
	public static void selectionSort(int arr[]) {
		for (int iTemp = 0; iTemp < arr.length - 1; iTemp++) {
			int index = iTemp;
			for (int jTemp = iTemp + 1; jTemp < arr.length; jTemp++) {
				if (arr[jTemp] < arr[index]) {
					index = jTemp;
				}
			}
			int min = arr[index];
			arr[index] = arr[iTemp];
			arr[iTemp] = min;
		} // O(n^2)-->time complexity and space complexity is O(1)
	}

	public static void printArray(int array[]) {
		for (int kTemp = 0; kTemp < array.length; kTemp++) {
			System.out.print(array[kTemp] + " ");
		}
	}

	public static void main(String[] args) {
		int marks[] = { 12, 14, 16, 25, 35, 38, 25 };

		selectionSort(marks);
		printArray(marks);
	}
}
