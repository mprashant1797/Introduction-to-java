package fgt;

public class g {
static int b=20; 
int c=11;
public static void main(String...args) {
	int a=10; 
	System.out.println("Local variable value : "+a);
	System.out.println("Static variable value : "+b);
	g a1 = new g();
	System.out.println("Instance variable value : "+a1.c);
}
}
