package in.praveenit.str;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstLetter {
	public static void main(String[] args) {
		List<String> citynames = Arrays.asList("Mumbai", "Hyderabad", "Kerala", "Kochi", "Banglore");
		Map<Character, List<String>> collect = citynames.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
		System.out.println(collect);
	}

}
