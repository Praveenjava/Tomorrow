package in.praveenit.arr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumNumberList {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(2,3,4,5);
		Integer collect = asList.stream().collect(Collectors.reducing(0,Integer::sum));
		System.out.println(collect);
		
	}

}
