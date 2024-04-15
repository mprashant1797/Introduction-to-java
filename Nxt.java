package Looop;
import java.util.*;

public class Nxt {
public static void main(String[] args) {
	int Rollno;
	float marks;
	char div;
	String name;
	
	System.out.println("enter following deatils");
	Scanner s=new Scanner(System.in);
	
	name=s.next();
	Rollno=s.nextInt();
	marks=s.nextFloat();
	div=s.next().charAt(0);
	
	System.out.println("Name : "+name);
	System.out.println("Roll No :"+Rollno);
	System.out.println("Marks : "+marks);
	System.out.println(" Div : "+div);
}
}
