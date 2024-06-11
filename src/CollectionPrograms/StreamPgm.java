package CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(89);
		al.add(9);
		al.add(6);
		List<Integer> sort=al.stream().sorted().collect(Collectors.toList());
	
		System.out.println(al);
		System.out.println(sort);
		//------------------------------------------
		List<Integer> list=Arrays.asList(100,23,200,34,56,8,6,77);
		List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		//-----------------------------------------------------
		List<Integer> newList=Arrays.asList(13,2,3,5,10);
		
		//Stream<Integer> s=newList.stream().sorted();
		//s.forEach(n -> System.out.println(n));
		Stream<Integer> mappedData=newList.stream().filter(n->n%2!=0).sorted().map(n->n*2);
		mappedData.forEach(i->System.out.println(i));
		
		List<Integer> nums=Arrays.asList(1,1,1,2,3,4,5,6,5,4,7,5,6);
		//Map<Object, List<Integer>> groupList= nums.stream().collect(Collectors.groupingBy(n -> n));
		//List<Integer> l = nums.stream().distinct().collect(Collectors.toList());
		Integer n = nums.stream().max(Integer::compare).get();
		
		System.out.println(n);
		List<String> st=Arrays.asList("m","e","a","l","w");
		String maxString = st.stream().max(Comparator.comparing(String::valueOf)).get();
		System.out.println(maxString);
		
		

	}

}
