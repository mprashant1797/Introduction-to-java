package Homework;
// Advance type casting
public class P {
	public static void main(String...args)
 {
	 int wwq= 21;
	 String str=String.valueOf(wwq);  // When converting into String use String.valueof()
	 int q=Integer.parseInt(str);    // When converting out of String use _____.parse____(variable value)
	 float qwq = Float.parseFloat(str);
	 long aq= Long.parseLong(str);
	 short qqw=Short.parseShort(str);
	 double ff= Double.parseDouble(str);
	 byte yy= Byte.parseByte(str);
	 float xx= Float.valueOf(yy); // When converting
	 
	 
	 System.out.println("value of int wwq : "+wwq);
	 System.out.println("value of int q : "+q);
	 System.out.println("value of String str : "+str);
	 System.out.println("value of float qwq : "+qwq);
	 System.out.println("value of long aq : "+aq);
	 System.out.println("value of short qqw : "+qqw);
	 System.out.println("value of double ff : "+ff);
	 System.out.println("value of byte yy : "+yy);
	 System.out.println("value of float yy : "+xx);
 }
}
