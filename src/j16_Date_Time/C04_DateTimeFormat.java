package j16_Date_Time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C04_DateTimeFormat {
    public static void main(String[] args) {

/*
		 format->
		 GUN
		 d : basta 0 varsa 0 yazmadan gun numarasi yazılır
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi yazar
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini

		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa 0 yazmadan ay numarasi yazılır
		 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi yazılır
		 MMM : Ay isminin ilk 3 harfi yazılır
		 MMMM : Ay isminin tamami yazılır

		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini yazılır

		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)	 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati yazar
		 hh :  12 saat dilimine gore 2 rakam olarak yazılır
		 h : 12 saat dilimine gore tek rakam olanlari tek olarak yazılır

		 m : minute tek rakamlari tek yazlır
		 mm: tek rakamlari 08 gibi yazılır

		 a yazarsak AM veya PM degerini yazar

		 */

        // herhangi bi ılke-sehir(local) tarih-zaman datasını tutar

       LocalDate usaDate=LocalDate.now(ZoneId.of("America/New_York"));//America/New_York  mevcut date ataması yapıldı
        LocalTime usaTime=LocalTime.now(ZoneId.of("America/New_York"));//America/New_York  mevcut time ataması yapıldı

        System.out.println("usaTime = " + usaTime);//usaTime = 01:07:34.024898
        System.out.println("usaDate = " + usaDate);//usaDate = 2023-02-25

       ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.of("America/New_York"));//America/New_York mevcut dateTime ataması yapıldı
        System.out.println("zdt1 = " + zdt1);//zdt1 = 2023-02-25T01:11:19.625901-05:00[America/New_York]
        //  ZonedDateTime zdt2=ZonedDateTime.now(ZoneId.of("America"));// RTE->ZoneRulesException firlatır
        // System.out.println("zdt2 = " + zdt2);
        ZonedDateTime zdt3=ZonedDateTime.now(ZoneId.of("Japan"));//
        System.out.println("zdt3 = " + zdt3);// ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.of("America/New_York"));
    }
}




















