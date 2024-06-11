package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SteamListSorting {

	public static void main(String[] args) {
	
		List<Employee> employee=new ArrayList<Employee>();
		employee.add(new Employee("geeta",34,10000));
		employee.add(new Employee("deepa",32,5000));
		employee.add(new Employee("shweta",27,6000));
		employee.add(new Employee("nita",26,4000));
		employee.add(new Employee("ammu",16,3000));
		employee.add(new Employee("sumant",22,12000));
		
		List<Employee> e = employee.stream()
								   .sorted((n1,n2) -> (int)(n1.getSalary()-n2.getSalary()))
								   .collect(Collectors.toList());
		//e.forEach(System.out::println);
		List<Employee> e1=employee.stream()
									.sorted(Comparator.comparingLong(Employee::getSalary).reversed())
										.collect(Collectors.toList());
		
		List<Employee> empage=employee.stream().sorted((a1,a2) -> (a1.getAge()-a2.getAge())).collect(Collectors.toList());
		
		
		empage.forEach(System.out::println);
		
		
	}

}
