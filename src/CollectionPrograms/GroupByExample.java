package CollectionPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupByExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> st= new ArrayList<>();
		st.add(new Student(18,"M","Rohan"));
		st.add(new Student(21,"F","geeta"));
		st.add(new Student(3,"M","renold"));
		st.add(new Student(10,"M","sumant"));
		st.add(new Student(25,"F","deepa"));
		st.add(new Student(89,"M","manju"));
		
		
		//Map<Object, List<Student>> map = st.stream().collect(Collectors.groupingBy(n -> n.getGender(),Collectors.toList()));
		//sSystem.out.println(map);
		//Map<Object , List<Student>> mapByName =  st.stream().collect(Collectors.groupingBy( name -> name.getName(), Collectors.toList()));
		//System.out.println(mapByName);
		Map<String, Set<String>> data = st.stream()
										.collect(Collectors
										.groupingBy(Student::getGender,
										Collectors.mapping(Student::getName, 
										Collectors.toSet())));
		data.entrySet().forEach(d -> System.out.println(d.getKey()+d.getValue()));
		
		//print distinict male and female
		st.stream().map(Student::getGender).distinct().forEach(System.out::println);
		//count the number male and female
		Map<String,Long> count = st.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
		System.out.println(count);
		//get maximum id of the studet
		Optional<Student> maxId = st.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getId)));
		System.out.println(maxId);
		
		//get the maximum id of male and female
		Map<String,Student> highestid = st.stream().collect(Collectors.groupingBy(s->s.getGender()
				,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e->e.getId())), Optional::get)));
		
		highestid.forEach((k,v)->System.out.println("k:"+k+" v:"+v));
		
		//make all names to uppercase 
		List<String> uppercaseStudent = st.stream().map(s->s.getName().toUpperCase()).collect(Collectors.toList());
		List<String> upper=st.stream().
							filter(s->s.getName().toUpperCase().charAt(0)=='R')
							.map(name->name.getName().toUpperCase())
							.collect(Collectors.toList());
		Iterator itr=upper.iterator();
		while(itr.hasNext())
		{
			String u=(String) itr.next();
			System.out.print(u+" ");
		}
		

	}

}
class Student
{
	private int id;
	private String gender;
	private String name;
	

	public Student(int id, String gender, String name) {
		super();
		this.id = id;
		this.gender = gender;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", gender=" + gender + ", name=" + name + "]";
	}
	
}
