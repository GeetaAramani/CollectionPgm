package CollectionPrograms;

public class PrimeNumberPgm {

	public static void main(String[] args) {
		System.out.println(isPrime(11));
		
		shape rect=()->{
			System.out.println("i am reactange");
		};
		//rect.draw();
		print(rect);

	}
	public static void print(shape s)
	{
		s.draw();
	}
	public static boolean isPrime(int in)
	{
		if(in==0 || in==1)
		return false;
		
		if(in==2)
			return true;
		for(int i=2;i<in/2;i++)
		{
			if(in%2==0)
				return false;
		}
		return true;
	}

}
interface shape
{
	public void draw();
	
}
