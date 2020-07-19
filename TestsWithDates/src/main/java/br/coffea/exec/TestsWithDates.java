package br.coffea.exec;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TestsWithDates {

	
	public static void main(String[] args) {
		
		LocalDate d2 = LocalDate.parse("1990-10-12");
		Period p = Period.between(d2, LocalDate.now());
		int years = p.getYears();
		int months = p.getMonths();
		int days = p.getDays();
		
		String dataNasc = "12/10/1990 08:30";
		LocalDateTime ld1 = LocalDateTime.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.printf("%s\n\n%30s\n%30s\n%30s\n%30s\n%30s\n%30s\n%30s\n\n%s\n",
						  "SISTEMA QUE REPRESENTA MEU TEMPO DE VIDA: ",
						  "Anos : " + ChronoUnit.YEARS.between(ld1, LocalDateTime.now()),
						  "Meses : " + ChronoUnit.MONTHS.between(ld1, LocalDateTime.now()),
						  "Semanas : "+ ChronoUnit.WEEKS.between(ld1, LocalDateTime.now()),
						  "Dias : " + ChronoUnit.DAYS.between(ld1, LocalDateTime.now()),
						  "Horas : " + ChronoUnit.HOURS.between(ld1, LocalDateTime.now()),
						  "Minutos : " + ChronoUnit.MINUTES.between(ld1, LocalDateTime.now()),
						  "Segundos : " + ChronoUnit.SECONDS.between(ld1, LocalDateTime.now()),
						  "Tempo total : " + years + " anos - " + months + " meses - " + days + " dias");
		
	}
}
