package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashSetItr {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("aaa");
		hs.add("bbb");
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//another way
		
		for(String h:hs)
			System.out.println(h);
		//iteratig hashmapp
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("aa","aaa");
		hm.put("bb","bbb");
		for(Map.Entry<String, String> m:hm.entrySet())
		{
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
		//sorting hashmap using treemap
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(21,"bb");
		h.put(19,"gg");
		h.put(23,"jj"); 
		
		for(Map.Entry<Integer,String> hh:h.entrySet())
		{
			System.out.println(hh.getKey()+":"+hh.getValue());
		}
		System.out.println(".........................");
		Map<Integer,String> tree=new TreeMap<Integer,String>(h);
		for(Map.Entry<Integer,String> hh:h.entrySet())
		{
			System.out.println(hh.getKey()+":"+hh.getValue());
		}
		//sorting arraylist in descending order
		List<Integer> arrayL=new ArrayList<Integer>();
		arrayL.add(1);
		arrayL.add(10);
		arrayL.add(8);
		
		arrayL.add(2, 67);
		for(Integer aa:arrayL)
		{
			System.out.println(aa);
		}
		arrayL.remove(0);
		Collections.sort(arrayL,Collections.reverseOrder());
		System.out.println(arrayL);
		
		//converting hashset to array
		String[] str=new String[hs.size()];
		hs.toArray(str);
		
		for(String s:str)
		{
			System.out.println(s);
		}
	}
}
