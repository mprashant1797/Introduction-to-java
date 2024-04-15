package Looop;
import java.util.*;

public class command {
public static void main(String[] args) {
	int rno=Integer.parseInt(args[0]);
	String name=(args[1]);
	float marks=Float.parseFloat(args[2]);
	char grade=args[3].charAt(0);
	System.out.println("Student Roll no : "+rno+"\tName of student : "+name+"\tMarks : "+marks+"\tGrade : "+grade);
}
}
