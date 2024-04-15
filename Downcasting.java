package Homework;

public class Downcasting {
	public static void main(String...args) {
		double a= 3.14;
		float b = (float) a;
		System.out.println("double value of : "+a);
		System.out.println("float value of : "+b);
		
		double e= 55.14;
		long aa = (long) e;
		System.out.println("double value of : "+e);
		System.out.println("long value of : "+aa);
		
		double aq= 33.54;
		short bq = (short) aq;
		System.out.println("double value of : "+aq);
		System.out.println("short value of : "+bq);
		
		double sa= 13.11;
		int db = (int) sa;
		System.out.println("double value of : "+sa);
		System.out.println("int value of : "+db);
		
		double ra= 63.24;
		byte bf = (byte) ra;
		System.out.println("double value of : "+ra);
		System.out.println("byte value of : "+bf);
		
		double rx= 63.25;
		char char1 = (char)rx;
		System.out.println("double value of : "+ra);
		System.out.println("byte value of : "+bf);
		
	}

}
