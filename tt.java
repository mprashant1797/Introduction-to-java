package fgt;

public class tt {
public static void main(String...args) {
	float var1=23.45f;
	double var2=var1;  // automatic casting or wide casting (Upper casting)
	System.out.println(var1);
	System.out.println(var2);
	
	long var3=(long) var1; // Manual casting or narrow casting  (Lower casting)
	System.out.println(var3);
}
}
