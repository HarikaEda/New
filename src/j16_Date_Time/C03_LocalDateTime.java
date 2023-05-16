package j16_Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
   //localdatetime->yıl ay gün,saat dakika saniye tutar
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("ldt = " + ldt);
        LocalDate d=LocalDate.of(21,45,12);
        LocalTime t=LocalTime.of(17,23,44);
        LocalDateTime ldt1=LocalDateTime.of(d,t);
        System.out.println("ldt1 = " + ldt1);
        System.out.println("ldt1.getHour() = " + ldt1.getHour());
        System.out.println("ldt1.getDayOfWeek() = " + ldt1.getDayOfWeek());
        System.out.println("ldt1.plusDays(15) = " + ldt1.plusDays(15));
        System.out.println("ldt1.minusDays(55) = " + ldt1.minusDays(55));

    }
}
