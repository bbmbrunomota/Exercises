import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d1 = Date.from(Instant.parse("2023-02-20T15:42:07Z"));
		System.out.println(sdf.format(d1));
		
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(d1);
		cal1.add(Calendar.HOUR_OF_DAY, 4);
		d1 = cal1.getTime();
		
		System.out.println(sdf.format(d1));
	
		Date d2 = Date.from(Instant.parse("2023-02-20T15:42:07Z"));
		System.out.println(sdf.format(d2));
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		int minutes = cal2.get(Calendar.MINUTE);
		int daysMonth = cal2.get(Calendar.DAY_OF_MONTH);
		int daysWeek = cal2.get(Calendar.DAY_OF_WEEK);
		int daysYear = cal2.get(Calendar.DAY_OF_YEAR);
		int month = 1 + cal2.get(Calendar.MONTH);
		int year = cal2.get(Calendar.YEAR);
		
		System.out.println("Minutes: " + minutes);
		System.out.println("daysMonth: " + daysMonth);
		System.out.println("daysWeek: " + daysWeek);
		System.out.println("daysYear: " + daysYear);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
	}
}