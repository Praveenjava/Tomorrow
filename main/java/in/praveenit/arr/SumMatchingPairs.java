package in.praveenit.arr;

public class SumMatchingPairs {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7 };
		int sum = 9;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println(arr[i] +"+"+ arr[j] + "=" + sum);
				}
			}
		}
	}

}
