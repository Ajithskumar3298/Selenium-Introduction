package streamMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamPractise {

//	@Test
	public void regular() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Ajith");
		names.add("Abhijith");
		names.add("Hari");
		names.add("Ammu");
		names.add("Pooja");

		int count = 0;
		for (int i = 0; i < names.size(); i++) {

			String name = names.get(i);

			if (name.startsWith("A")) {

				count++;
			}

		}

		System.out.println(count);

	}

//	@Test
	public void streamFilter() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Ajith");
		names.add("Abhijith");
		names.add("Hari");
		names.add("Ammu");
		names.add("Pooja");

		long cont = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(cont);

		long d = Stream.of("Ajith", "Abhijith", "Hari", "Ammu", "Pooja").filter(s -> {
			s.startsWith("H");
			return true;

		}).count();
		System.out.println(d);

//		Print all the names which length is greater than 4 from the array list

		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));

	}

//	@Test
	public void streamMap() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Amal");
		names.add("Abhi");
		names.add("Harish");
		names.add("Gokul");
		names.add("Miya");

//		print string length >4 with UPPER CASE
		Stream.of("Ajith", "Abhijith", "Hari", "Amala", "Pooja").filter(s -> s.length() > 4).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

//		print string which ends with "a" in upper case
		Stream.of("Ajith", "Abhijith", "Hari", "Amala", "Pooja").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

//		print string which starts with "a" and in UPPER CASE then sorted

		List<String> names1 = Arrays.asList("Ajith", "Abhijith", "Hari", "Amala", "Pooja");
		names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		Stream<String> newstream = Stream.concat(names.stream(), names1.stream());
//		newstream.sorted().forEach(s->System.out.println(s));

		boolean flag = newstream.anyMatch(s -> s.equalsIgnoreCase("Hari"));
		Assert.assertTrue(flag);
		System.out.println(flag);

	}

	@Test
	public void streamcollect() {

		List<String> newlist = Stream.of("Ajith", "Abhijith", "Hari", "Amala", "Pooja").filter(s -> s.startsWith("A"))
				.map(s -> s.toUpperCase()).sorted().collect(Collectors.toList());

		System.out.println(newlist);
		System.out.println(newlist.get(2));

//		list of integer array to list in unique {1,2,4,4,7,9,5,6}
		List<Integer> values = Arrays.asList(1, 2, 4, 4, 7, 9, 5, 6);
		values.stream().distinct().sorted().forEach(s -> System.out.println(s));

		System.out.println("*******");
//		print the 3rd intex
		List<Integer> newvalues = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(newvalues.get(2));
	}
}
