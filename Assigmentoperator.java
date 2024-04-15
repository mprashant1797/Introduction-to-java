package Homework1;

public class Assigmentoperator {
public static void main(String[] args) {
	int a,b,c;
	a=100; b=400; c=a+b;
	// first way of addition
	//System.out.println("Addition : "+c);
	// Second way of addition
	//System.out.println("Addition : "+(a+=b));
	//System.out.println("Subtraction : "+(a-=b));
	//System.out.println("Multiplication : "+(a*=b));
	//System.out.println("Devision : "+(a/=b));
	//System.out.println("Modulus : "+(a%=b));
	
	System.out.println("Addition : "+(a+b));
	System.out.println("Subtraction : "+(a-b));
	System.out.println("Multiplication : "+(a*b));
	System.out.println("Devision : "+(a/b));
	System.out.println("Modulus : "+(a%b));
}
}
