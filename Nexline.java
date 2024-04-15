package Looop;
import java.util.*;

public class Nexline {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter number :");
	float a=s.nextFloat();
	System.out.println("Output : "+a);
	System.out.println("Enter any name : ");
	s.nextLine();// it is compulsory to write this line
	String name=s.nextLine();
	System.out.println("Name : "+name);
}
}
