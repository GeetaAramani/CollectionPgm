package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<UserDto> userDto = new ArrayList<>();
		
		List<User> user=new ArrayList<>();
		user.add(new User(1,"geeta","g@gmail.com"));
		user.add(new User(2,"deepa","d@gmail.com"));
		user.add(new User(3,"puttu","p@gmail.com"));
		
	
		
		List<UserDto> userDto = user.stream().map((User u) -> new UserDto(u.getName(),u.getEmail())).collect(Collectors.toList());
		userDto.forEach(System.out::println);

	}

}
class UserDto{
	private String name;
	private String email;
	
	public UserDto(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + "]";
	}
	
	
}

class User{
	private int id;
	private String name;
	private String email;
	
	public User(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
