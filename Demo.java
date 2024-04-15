package neww;
import java.util.*;

public class Demo {
public static void main(String[] args) {
	int a;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter any number : ");
	a=s.nextInt();
	if(a%2==0||a%5==0) {
		System.out.println("number is divisible by 2 or 5");
		
	}
	else {
		System.out.println("number not divisible by 2 or 5");
	}
}
}
