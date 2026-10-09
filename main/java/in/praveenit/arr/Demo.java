package in.praveenit.arr;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Demo {

		public static void main(String[] args) {

			TreeSet ts = new TreeSet();

			ts.add("raja");
			ts.add("raja");
			ts.add("rani");
			ts.add("ashok");

			System.out.println(ts); // ashok, raja, rani

			Iterator iterator = ts.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}

