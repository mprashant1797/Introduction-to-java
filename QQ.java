package fgt;

public class QQ {
		public static void main(String...args)
{
			int a,b;
			a=2;
			b=3;
			int c= (a++)+(++a)+(b++)+(++b)+(a--)-(--b)+(b--);
			System.out.println("Output : "+c);
}
			
}
