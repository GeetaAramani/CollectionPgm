package CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		Integer[] num= {11,22,33,44,55};
		//convertin array to arraylist using aslist method of array
		 List<Integer> al=new ArrayList<>(Arrays.asList(num));
		 for(Integer n:al)
		 {
			 System.out.println(n);
		 }
		 System.out.println("using collection method");
		//convertin array to arraylist using collection addall method
		 List<Integer> number=new ArrayList<>();
		 Collections.addAll(number, num);
		 for(Integer nn:number)
		 {
			 System.out.println(nn);
		 }
		 
		 Iterator itr=al.iterator();
		 while(itr.hasNext())
		 {
			 int m=(int) itr.next();
			 if(m<40)
				 itr.remove();
			 
		 }
		 System.out.println(al);
		}
	}


