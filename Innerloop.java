package neww;

public class Innerloop {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for (int j=1;j<=5;j++) {
			System.out.println(i+" "+j);
		}
	}
	int k,l;
outer:for(k=1;k<=5;k++) {
	inner:for(l=1;l<=5;l++) {
		System.out.println(k+" Hi "+l);
		if(k==3)
			break outer;
	}
	System.out.println("Coders!!!!");
}
}
}
