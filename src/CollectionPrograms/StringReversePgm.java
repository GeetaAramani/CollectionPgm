package CollectionPrograms;

public class StringReversePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="geeta";
		System.out.println(reverse(str));

	}
	public static String reverse(String in)
	{
		if(in==null)
			throw new IllegalArgumentException("null is not allowed");
		StringBuilder sb=new StringBuilder();
		char[] ch=in.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			sb.append(ch[i]);
		}
		return sb.toString();
		
	}

}
