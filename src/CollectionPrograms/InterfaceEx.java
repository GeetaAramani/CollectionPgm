package CollectionPrograms;
interface Polygon
{
	//void getArea(int length, int breadth);
	void area();
	default void display()
	{
		System.out.println("prinitng the sides");
	}
}
class Reactangle implements Polygon
{
	@Override
	public void area() {
		int length=4;
		int breadth=5;
		System.out.println("area:"+(length*breadth));
		
	}
	public void display()
	{
		System.out.println("I have 4 sides");
	}
	
}
class Square implements Polygon
{
	@Override
	public void area() {
		int length=4;
		//int length=5;
		System.out.println("area:"+(length*length));
		
	}
	
}
public class InterfaceEx {

	public static void main(String[] args) {
		Reactangle p=new Reactangle();
		p.area();
	p.display();
		

	}

}
