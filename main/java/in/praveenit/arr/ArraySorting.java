package in.praveenit.arr;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 3, 1, 0 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}

		System.out.println(Arrays.toString(arr));
	}

}
