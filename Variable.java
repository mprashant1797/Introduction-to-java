package Homework;

public class Variable {
	int qq=12;
	
static int v=10;
public static void main(String...args) {

	Variable W1= new Variable(); W1.show(); 
	System.out.println(+W1.qq);	// for static calling
	}



void show() 
{
	int a=3;
			System.out.println(a);
			System.out.println(qq);	// for non static calling	
			System.out.println(v);
}
}
	