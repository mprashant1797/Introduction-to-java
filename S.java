
package basic;
import java.text.SimpleDateFormat;
import java.util.Date;

public class S 
{
	public static void main(String[] args) {
		System.out.println("current Date:  "+new Date());
		SimpleDateFormat sdf=new
				SimpleDateFormat("dd/MM/YYYY");
				System.out.format("Date:  "+sdf.format(new Date()));

								

	}
}