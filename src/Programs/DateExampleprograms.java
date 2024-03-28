package Programs;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
public class DateExampleprograms {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LocalDate date1=LocalDate.now();
		System.out.println(date1);
		System.out.println(date1.getDayOfMonth());
		System.out.println(date1.getDayOfYear());
		System.out.println(date1.getMonthValue());
		System.out.println(date1.plusYears(10));
		System.out.println(date1.getYear());
	}

}
