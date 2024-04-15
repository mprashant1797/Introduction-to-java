package fgt;

public class YY {

	static int a=10;
	void fun()
	{
		int b=10;
		System.out.println(a+" "+b);
		++a;
		++b;
	}
	public static void main(String...args)
{
		YY y1=new YY();
		y1.fun();
		y1.fun();
		
}
}
