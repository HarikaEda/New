package j16_Date_Time;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {

//local date sadece gün ay yıl dataları tutar

        LocalDate bugün=LocalDate.now();
        System.out.println("bugün = " + bugün);
        System.out.println("bugün.getYear() = " + bugün.getYear());
        System.out.println("bugün.getMonth() = " + bugün.getMonth());
        System.out.println("bugün.getMonthValue() = " + bugün.getMonthValue());
        System.out.println("bugün.getDayOfMonth() = " + bugün.getDayOfMonth());
        System.out.println("bugün.getDayOfWeek() = " + bugün.getDayOfWeek());
        System.out.println("bugün.getDayOfYear() = " + bugün.getDayOfYear());
        System.out.println("bugün.getDayOfWeek() = " + bugün.getDayOfWeek());
       LocalDate date1=LocalDate.of(2016,3,23);
       LocalDate date2=LocalDate.of(2014, Month.MAY,19);
       //tanımlanan bir date in öncesi minus ve sonrası plus
        System.out.println("date1.plusDays(45) = " + date1.plusDays(45));
        System.out.println("date2.minusMonths(3) = " + date2.minusMonths(3));

    }
}
