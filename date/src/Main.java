import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) throws ParseException {

			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
			
			System.out.println("--------- EXEMPLO COM SDF2 ------");
			Date x1 = new Date();
			System.out.println("x1: " + x1);
			System.out.println("x1: " + sdf2.format(x1));
			
			Date x2 = new Date(System.currentTimeMillis());
			System.out.println("x2: " + x2);
			System.out.println("x2: " + sdf2.format(x2));
			
			Date y1 = sdf1.parse("25/06/2018");
			Date y2 = sdf2.parse("25/06/2018 15:42:07");
			
			System.out.println("y1: " + y1);
			System.out.println("y1: " +sdf2.format(y1));
			System.out.println("y2: " +y2);
			System.out.println("y2: " +sdf2.format(y2));
			
			System.out.println("--------- EXEMPLO COM SDF3 ------");
			System.out.println("x1: " + sdf3.format(x1));
			System.out.println("x2: " + sdf3.format(x2));
			System.out.println("y1: " + sdf3.format(y1));
			System.out.println("y2: " + sdf3.format(y2));
	
			
	}
}