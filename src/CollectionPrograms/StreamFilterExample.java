package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample {

	public static void main(String[] args) {
		List<Product> list=new ArrayList<>();
	
		
		List<Product> st=getProducts()
								.stream()
									.filter(n -> n.getPPrice()>2000)
										.collect(Collectors.toList());
		st.forEach(System.out::println);
		
	}
	//using java 8
	
	public static List<Product> getProducts()
	{
		List<Product> prod=new ArrayList<>();
		prod.add(new Product(1,"sinthol",4000));
		prod.add(new Product(2,"mysoresandal",6000));
		prod.add(new Product(3,"lux",2000));
		prod.add(new Product(4,"wheel",15000));
		return prod;
		
	}
}
class Product{
	private int pid;
	private String PName;
	private long PPrice;
	
	public Product(int pid, String pName, long pPrice) {
		super();
		this.pid = pid;
		PName = pName;
		PPrice = pPrice;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public long getPPrice() {
		return PPrice;
	}
	public void setPPrice(long pPrice) {
		PPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", PName=" + PName + ", PPrice=" + PPrice + "]";
	}
	
}