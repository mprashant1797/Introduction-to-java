package Homework2;
import java.util.*;
public class Next {
public static void main(String[] args) {
	int Rollno;
	float Marks;
	char Div;
	String Name;
	
	System.out.println("Enter following details :");
	Scanner s= new Scanner(System.in);
	
	System.out.println("Name : "); Name=s.nextLine();
	System.out.println("Roll no. : "); Rollno=s.nextInt();
	System.out.println("Marks : "); Marks=s.nextFloat();
	System.out.println("Div : "); Div=s.next().charAt(0);
	
	System.out.println("Name : "+Name);
	System.out.println("Roll no : "+Rollno);
	System.out.println("Marks : "+Marks);
	System.out.println("Div : "+Div);
}
}
