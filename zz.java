package fgt;

public class zz {
public static void main(String...args) {
	int a=2;
	// String str=a; It gives error
	String str=String.valueOf(a);
	System.out.println("Value of a : "+a);
	System.out.println("Value of str : "+str);
	System.out.println(a+a); // it stores int value
	System.out.println(str+str);  // it stores String value
	
	float f1=22.4f;
	String str1=String.valueOf(f1);
	System.out.println(f1+f1);
	System.out.println(str1+str1);
}
}
