package org.in.sort;

public class BubbleSortAlgorithm {
	public static void bubbleSort(int array[]) {
		int length = array.length;
		for (int iTemp = 0; iTemp < length - 1; iTemp++) {
			for (int jTemp = 0; jTemp < length - iTemp - 1; jTemp++) {
				if (array[jTemp] > array[jTemp + 1]) {
					int temp = array[jTemp];
					array[jTemp] = array[jTemp + 1];
					array[jTemp + 1] = temp;
					jTemp++;
				}
			}
		} // O(n^2)-->time complexity and space complexity is O(1)
	}

	public static void printArray(int array[]) {
		for (int kTemp = 0; kTemp < array.length; kTemp++) {
			System.out.print(array[kTemp] + " ");
		}
	}

	public static void main(String[] args) {
		int marks[] = { 12, 14, 16, 25, 35, 38, 25 };

		bubbleSort(marks);
		printArray(marks);
	}
	}

