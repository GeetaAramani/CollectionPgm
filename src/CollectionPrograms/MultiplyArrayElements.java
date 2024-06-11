package CollectionPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MultiplyArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] i= {1,2,3,4,5};
		String str="mm bb bb mm aa bb ";
		String[] s=str.trim().split(" ");
		List<String> strList=Arrays.asList(s);
		
		Optional<Integer> result = Arrays.stream(i).reduce((a,b)->a*b);
		
		if(result.isPresent())
		{
			System.out.println("result is:"+result);
		}
		else
		{
			System.out.println("empty array list");
		}
		
		//count the duplicates using map
		Map<String ,Integer> map=new HashMap<>();
		for(String ss:s)
		{
			if(map.containsKey(ss))
				map.put(ss,map.get(ss)+1 );
			else
				map.put(ss, 1);
		}
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			
			System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
		}
		//using java 8
		System.out.println("using java 8 finding duplicates");
		Map<String, Long> countMap = strList.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
		countMap.forEach((k,v) -> System.out.println("key:"+k+" value:"+v));

	}

}
