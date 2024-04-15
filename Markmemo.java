package Homework1;
import java.util.*;
public class Markmemo {
public static void main(String[] args) {
	 Scanner s= new Scanner(System.in);
	 System.out.println("Enter marks of 5 Subjects");
	 int Marathi,English,Math,Histroy,Science;
	 
	 System.out.print("Marathi = ");Marathi=s.nextInt();
	 System.out.print("English = ");English=s.nextInt();
	 System.out.print("Math = ");Math=s.nextInt();
	 System.out.print("Histroy = ");Histroy=s.nextInt();
	 System.out.print("Science = ");Science=s.nextInt();
	  
	 int Total=Marathi+English+Math+Histroy+Science;
	double  Percentage = (Total/5);
	System.out.println("Total marks="+Total);
	System.out.println("Percentage="+Percentage +("%"));
	
	if(Marathi<35 || English<35 || Math<35 || Histroy<35 || Science<35) {
		System.out.println("You are Failed");
	}
	
	else if(Percentage>=75) {
		System.out.println("You got Distinction");
	}
	else if(Percentage>=65) {
		System.out.println("You got First Class");
	}
	else if(Percentage>=55) {
		System.out.println("You got Second Class");
	}
	else if (Percentage>=35) {
		System.out.println("You got Third Class");
	}
	else {
		System.out.println("You are Failed");
	}
}
}
