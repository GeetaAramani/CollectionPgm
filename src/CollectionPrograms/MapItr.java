package CollectionPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapItr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"amit");
		map.put(2, "manju");
		map.put(3, "shivu");
		
		for(Map.Entry<Integer, String> a:map.entrySet())
		{
			System.out.println(a.getKey()+":"+a.getValue());
		}
		Set e=map.entrySet();
		Iterator itr=e.iterator();
		while(itr.hasNext())
		{
			Map.Entry num=(Entry) itr.next();
			
			System.out.println(num.getKey()+":"+num.getValue());
		}
		map.remove(1);
		System.out.println(map);
		

	}

}
