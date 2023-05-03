package org.in.sort;

public class InsertionSortAlgorithm {
	public static void insertionSort(int arr[]) {

		for (int iTemp = 1; iTemp < arr.length; ++iTemp) {
			int index = arr[iTemp];
			int jTemp = iTemp - 1;

			while (jTemp >= 0 && arr[jTemp] > index) {
				arr[jTemp + 1] = arr[jTemp];
				jTemp = jTemp - 1;
			}
			arr[jTemp + 1] = index;
		}

	} // O(n^2)-->time complexity and space complexity is O(1)

	public static void printArray(int array[]) {
		for (int kTemp = 0; kTemp < array.length; kTemp++) {
			System.out.print(array[kTemp] + " ");
		}
	}

	public static void main(String[] args) {
		int marks[] = { 12, 14, 16, 25, 35, 38, 25 };

		insertionSort(marks);
		printArray(marks);
	}
}
