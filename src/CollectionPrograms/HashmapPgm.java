package CollectionPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapPgm {

	public static void main(String[] args) {
		String str="HI aaru and dhruve how and and HI";
		String[] strarray=str.split(" ");
		HashMap<String,String> hashMap=new HashMap<String,String>();
		hashMap.put("geeta", "aa");
		hashMap.put("deepa", "bb");
		hashMap.put("aryan", "cc");
		hashMap.put("sneha", "dd");
		
		Set<String> s=hashMap.keySet();
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println("key:"+itr.next()+" value:"+hashMap.get(itr.hasNext()));
		}
		//looping map using entryset and foreach loop
		Set<Map.Entry<String, String>> es=hashMap.entrySet();
		for(Map.Entry  entry:es)
			
			System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
		
		//
		
		
		
		//sorting hashmap using treemap
		HashMap<Integer,String> hash=new HashMap<>();
		hash.put(89,"gg");
		hash.put(56,"dd");
		hash.put(34,"ss");
		Set hashentry=hash.entrySet();
		Iterator hashitr=hashentry.iterator();
		while(hashitr.hasNext())
		{
			Map.Entry hh=(Map.Entry)hashitr.next();
			System.out.println("keys:"+hh.getKey()+"values:"+hh.getValue());
		}
	}

}
