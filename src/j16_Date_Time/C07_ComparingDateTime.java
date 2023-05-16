package j16_Date_Time;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {

        LocalDate bugün=LocalDate.now();
        LocalDate falanGun=bugün.plusDays(58);
        LocalDate feşmekanGun=bugün.minusDays(23);
        LocalDate ibrahim=LocalDate.of(1983,9,21);
        System.out.println("bugün = " + bugün);
        System.out.println("falanGun = " + falanGun);
        System.out.println("feşmekanGun = " + feşmekanGun);
        System.out.println("ibrahim = " + ibrahim);

        System.out.println("bugün.isAfter(ibrahim) = " + bugün.isAfter(ibrahim));
        System.out.println("ibrahim.isBefore(feşmekanGun) = " + ibrahim.isBefore(feşmekanGun));
        System.out.println("falanGun.isBefore(feşmekanGun) = " + falanGun.isBefore(feşmekanGun));
        System.out.println("bugün.isLeapYear() = " + bugün.isLeapYear());

        System.out.println("bugün.compareTo(ibrahim) = " + bugün.compareTo(ibrahim));
        System.out.println("bugün.compareTo(falanGun) = " + bugün.compareTo(falanGun));
        System.out.println("falanGun.compareTo(feşmekanGun) = " + falanGun.compareTo(feşmekanGun));
int gun=bugün.compareTo(ibrahim);
        System.out.println("gun = " + gun);

/*     ComperaTo komutu işlevi:
2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */


    }
}
