package Looop;
import java.util.*;
public class Max {
	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		if(a==b&a==c&b==c) {
			System.out.println("All are Equal");
			
		}
		else if(a>=b&a>=c) {
			System.out.println("Max number : "+a);
		
		}
		else if (b>=a&b>=c) {
			System.out.println("Max number : "+b);
		}
		else {
			System.out.println("Max number : "+c);
		}
	}

}
