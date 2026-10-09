package in.praveenit.str;

import java.util.stream.Collectors;

public class NameinEachchar {
	public static void main(String[] args) {
		String s = "Praveen";
		String collect = s.chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining(","));

		System.out.println(collect);
	}

}
