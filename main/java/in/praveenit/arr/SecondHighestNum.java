package in.praveenit.arr;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNum {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 3, 4, 5, 2, 6, 7 };
		Integer sec = Arrays.stream(arr).boxed().sorted().skip(3).findFirst().orElse(null);
		System.out.println(sec);
	}

}
