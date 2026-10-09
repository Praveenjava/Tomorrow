package in.praveenit.arr;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultifyInList {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(2, 3, 4, 5);
		Optional<Integer> reduce = asList.stream().reduce((a, b) -> a * b);
		if (reduce.isPresent()) {
			System.out.println(reduce.get());
		}
	}

}
