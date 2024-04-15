package neww;

public class Enhancedloop {
public static void main(String[] args) {
	int a[]= {11,22,33,44,55,66,77,88,99};
	System.out.println("Print data using for loop : ");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	System.out.println("Print using enhanced for loop : ");
	
	for(int n:a) {
		System.out.println(n);
	}
}
}
