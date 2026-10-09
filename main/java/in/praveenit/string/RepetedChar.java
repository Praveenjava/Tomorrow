package in.praveenit.string;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepetedChar {
	public static void main(String[] args) {
		String s = "Hi Hello";
		Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect.entrySet().stream().filter(e -> e.getValue() > 1)
				.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
	}

}
