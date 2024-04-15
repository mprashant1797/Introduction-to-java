package Homework1;
import java.util.*;
public class Input {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		
		if(num>0) {
			System.out.println("Number is positive");
		}
		else if(num<0){
			System.out.println("Number is negitive");
		}
		else {
			System.out.println("Number is Zero");
			
		}
	}
}
