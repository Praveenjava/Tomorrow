package in.praveenit.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdheighestName {
	public static void main(String[] args) {
		List<String> nam =Arrays.asList("Praveen","Varun","Viya","viha");
		nam.stream().collect(Collectors.toMap(String::length))
	}

}
