package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{

 	private String name;
	private int age;
	private long salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Employee(String name, int age, long salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		if(age==emp.getAge())
			return 0;
		else if(age>emp.getAge())
			return 1;
		else
			return -1;
		
	}
	
	public static void Main(String args[])
	{
		Employee e1=new Employee("geeta",34,200000);
		Employee e2=new Employee("deepa",32,150000);
		Employee e3=new Employee("suma",45,350000);
		
		ArrayList<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Collections.sort(list);
		
	}
	
	

}
