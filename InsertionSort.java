package com.sorting.algorithm;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 12, 29, 27, 4, 8, 11, 32, 1 };
		insertionSortAlgorithm(arr);
		for (int value : arr) {
			System.out.print(value + " ");
		}
	}

	private static void insertionSortAlgorithm(int arr[]) {
		int temp, j;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
	}
}
