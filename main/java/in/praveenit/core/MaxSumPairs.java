package in.praveenit.core;

public class MaxSumPairs {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 6, 8, 0 };

		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > max1) {
				max2 = max1;
				max1 = num;
			} else if (num > max2) {
				max2 = num;

			}

		}
		int maxsum = max1 + max2;
		System.out.println(maxsum);

		System.out.println("Pairs with maximum sum:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == maxsum) {
					System.out.println(arr[i] + " + " + arr[j] + " = " + maxsum);
				}
			}
		}
	}
}
