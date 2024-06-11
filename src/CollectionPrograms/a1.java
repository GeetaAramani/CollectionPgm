package CollectionPrograms;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class a1 {

	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<>();
		list.add(11);
		list.add(11);
		list.add(9);
		list.add(5);
		list.add(6);
		list.add(9);
		Set<Integer> s=new LinkedHashSet<>(list);
		List<Integer> l=new ArrayList<>(s);
		System.out.println(l);
		List<Integer> lstream = l.stream().distinct().collect(Collectors.toList());
		System.out.println(lstream);
		
		List<String> str=new ArrayList<>();
		str.add("guava");
		str.add("mango");
		str.add("apple");
		str.add("banana");
		
		str.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).forEach(n -> System.out.println(n));
		
		//reverse string using java8
		String word="hi geeta how are you";
		StringBuilder sb=new StringBuilder(word);
		System.out.println(sb.reverse().toString());
		
		//using java8
		String[] revstr=word.split(" ");
		List<String> result = Arrays.stream(revstr)
				.map((n) -> new StringBuilder(n).reverse().toString())
					.collect(Collectors.toList());
		System.out.println(result);
		
		//to retrive the last element of the string using java8
		List<String> lastEle=Arrays.asList("aa","bb","cc","dd");
		String res = lastEle.stream()
			   .skip(lastEle.size()-1)
			   .findFirst()
			   .get();
		System.out.println(res);
		
		//to pring even numbers using java8
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> evenNums = nums.stream().filter(n -> (n%2) == 0).collect(Collectors.toList());
		System.out.println(evenNums);
		
		//find the age of a person
		
		LocalDate birthDate = LocalDate.parse("1988-12-26");
		LocalDate currentdate=LocalDate.now();
		Period p = Period.between(birthDate, currentdate);
		System.out.println("My age is..........."+p.getYears());
		
		//find second largest number using java8 
		List<Integer> secondLarge = Arrays.asList(12,11,23,45,6,34,56);
		Integer secondlargestNumber = secondLarge.stream()
												 .sorted(Comparator.reverseOrder())
												 .skip(1)
												 .findFirst()
												 .get();
		System.out.println(secondlargestNumber);
		
		
		
		
		
		

	}

}
