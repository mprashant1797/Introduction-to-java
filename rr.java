


package fgt;

public class rr {
	public static void main(String...args) {
		String str= "2";
		// int num=str; it gives error
		int num= Integer.parseInt(str);
		System.out.println(num+num);

		String str1="4";
		int num1=Integer.parseInt(str1);
		System.out.println(num1+num1);
		System.out.println(num1+num1+num1);
		System.out.println("Num "+(num1+num1));
	}
}
