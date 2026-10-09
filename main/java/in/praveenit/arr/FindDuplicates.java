package in.praveenit.arr;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(2, 3, 4, 5, 2, 3);
		Map<Integer, Long> collect = asList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect.entrySet().stream().filter(e -> e.getValue() > 1)
				.forEach(e -> System.out.println(e.getKey() ));
	}

}
