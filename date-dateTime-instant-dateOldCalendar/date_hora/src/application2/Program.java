package application2;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.parse("2022-07-20");
		LocalDateTime d2 = LocalDateTime.parse("2022-07-20T01:30:06");
		Instant d3 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_DATE_TIME;
		
		
		System.out.println("d1 = " + d1.format(fmt1));
		System.out.println("d1 = " + fmt1.format(d1));
		System.out.println("d1 = " + d1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d2 = " + d2.format(fmt1));
		System.out.println("d2 = " + d2.format(fmt2));

		System.out.println("d3 = " + fmt3.format(d3));
		
		System.out.println("d2 = " + d2.format(fmt5));
		System.out.println("d3 = " + fmt4.format(d3));

	}

}
