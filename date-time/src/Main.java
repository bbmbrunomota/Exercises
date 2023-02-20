import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate d01 = LocalDate.now();
		System.out.println("d01 = " + d01);
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("d02 = " + d02);
		
		Instant d03 = Instant.now();
		System.out.println("d03 = " + d03);
		
		LocalDate d04 = LocalDate.parse("2023-02-20");
		System.out.println("d04 = " + d04);
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("d04 = " + fmt1.format(d04));
		
		LocalDateTime d05 = LocalDateTime.parse("2023-02-20T01:30:26");
		System.out.println("d05 = " + d05);
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));
		
		Instant d06 = Instant.parse("2023-02-20T01:30:26Z");
		System.out.println("d06 = " + d06);
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));
		
		Instant d07 = Instant.parse("2023-02-20T01:30:26-03:00");
		System.out.println("d07 = " + d07);
		
		LocalDate d08 = LocalDate.parse("20/02/2023", fmt1);
		System.out.println("d08 = " + d08);
		
		LocalDateTime d09 = LocalDateTime.parse("20/02/2023 01:30", fmt2);
		System.out.println("d09 = " + d09);
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		System.out.println("d10 = " + d10);
		
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		System.out.println("d11 = " + d11);
		
		
		
		
	}
}