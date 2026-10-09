package in.praveenit.str;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Identifiedachar {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Banana", "Manngo", "Dog");
		List<String> collect = asList.stream().filter(e -> e.toLowerCase().contains("a")).collect(Collectors.toList());
		System.out.println(collect);

	}

}
