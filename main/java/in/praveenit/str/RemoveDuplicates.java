package in.praveenit.str;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s = "praveen";
		List<String> collect = s.chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(LinkedHashSet::new))
				.stream().map(String::valueOf).collect(Collectors.toList());
		System.out.println(collect);
	}

}
