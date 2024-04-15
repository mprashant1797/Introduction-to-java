package Looop;
import java.io.*;

public class Buffered {
public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter Deatiles : ");
	int rno=Integer.parseInt(br.readLine());
	String name=br.readLine();
	float marks=Float.parseFloat(br.readLine());
	char grade=(char)br.read();
	System.out.println(" Roll no : "+rno+"\nName : "+name+"\nMarks : "+marks);
	System.out.println(" Roll no : "+rno+"\tName : "+name+"\tMarks : "+marks+"Grade : "+grade);
}
}
