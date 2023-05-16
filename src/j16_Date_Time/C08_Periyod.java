package j16_Date_Time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Periyod {
    public static void main(String[] args) {
    //periyod:iki tarih arasında geçen tekrarlanan datayı tutar.
        LocalDate bugün=LocalDate.now();
        LocalDate abdiBey=LocalDate.of(1983,10,8);
        Period p1=Period.between(abdiBey,bugün);
        System.out.println("p1 = " + p1);//P39Y4M16D
        System.out.println("p1.toTotalMonths() = " + p1.toTotalMonths());//abdibeyin dünyaya geldiği andan itibaren geçen ay sayısı
        System.out.println("p1.getDays() = " + p1.getDays());
        System.out.println("p1.getYears() = " + p1.getYears());
        System.out.println("   **********   ");

        System.out.println("bugün = " + bugün);
        Period p2=Period.ofDays(9);//9 gun bir tekrarlayan period tanımlandı
        Period p3=Period.ofMonths(7);//bugunun 9 gun sonrası
        bugün.minus(p3);
        System.out.println("bugün = " + bugün);


       bugün=bugün.plus(p2);
        System.out.println("p2 = " + p2);
//task:2.01.2023 de başlayan kursun suresi 9 ay ol göre bu kursun bitiş tarihi nedi?
  LocalDate kursBasla=LocalDate.of(2023,1,2);
  Period kursSure = Period.ofMonths(9);
        System.out.println("kurs bitis : " + kursBasla.plus(kursSure).format(DateTimeFormatter.ISO_LOCAL_DATE));//kurs bitis : 2023-10-02
        // ISO -> International Organization for Standardization


    }
}
