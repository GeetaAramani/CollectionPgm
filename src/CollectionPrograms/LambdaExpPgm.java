package CollectionPrograms;

public class LambdaExpPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addition a=new addnum();
		//System.out.println(a.add(10, 20));
		
		addition sum=(a,b) -> (a+b);
		
		int c=sum.add(10, 20);
		System.out.println(c);
		
		

	}

}
interface addition
{
	int add(int a,int b);
}
/*class addnum implements addition
{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}
	
}*/

