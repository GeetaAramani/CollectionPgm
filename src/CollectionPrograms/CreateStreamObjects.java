package CollectionPrograms;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> st=Stream.of("aa","bb","cc","dd","ee");
		st.forEach(System.out::println);
		
		//create stream from collection
		Collection<String> c=Arrays.asList("geeta","amit","manju","deepa");
		Stream<String> stCollection=c.stream();
		stCollection.forEach(System.out::println);
		
		//create stream using arrays
		String[] a= {"bgm","dav","usa","europe"};
		Stream<String> stArray=Arrays.stream(a);
		stArray.forEach(System.out::print);
		
		Stream<String> stream=Stream.of("ga","da","pa","ma");
		stream.forEach(System.out::println);
		
		Collection<String> co=Arrays.asList("mom","dad","bro","sis");
		Stream<String> coSt=co.stream();
		coSt.forEach(System.out::println);
		
		List<String> list=Arrays.asList("ammu","summu","deepu","puttu");
		Stream<String> listSt=list.stream();
		listSt.forEach(System.out::println);
		
		String[] stArrays= {"10","3","4","5"};
		Stream<String> arrSt=Arrays.stream(stArrays);
		arrSt.forEach(System.out::println);
		

	}

}
