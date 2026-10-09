package in.praveenit.arr;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6 };
		Object[] array = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).map(Integer::intValue)
				.toArray();
		System.out.println(Arrays.toString(array));
	}

}
