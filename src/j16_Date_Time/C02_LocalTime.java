package j16_Date_Time;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        //local time: saat-dakika-saniye datalarını tutar
        LocalTime suAn=LocalTime.now();
        System.out.println("suAn = " + suAn);
        System.out.println("suAn.getHour() = " + suAn.getHour());
        System.out.println("suAn.getMinute() = " + suAn.getMinute());
        System.out.println("suAn.getNano() = " + suAn.getNano());
        System.out.println("suAn.getSecond() = " + suAn.getSecond());
        System.out.println("suAn.getNano() = " + suAn.getNano());
     ///tanımlanan bir time ın öncesi minus,sonrası plus()get
        LocalTime time1=LocalTime.of(17,23,53);
        System.out.println("time1 = " + time1);
LocalTime loopBası=LocalTime.now();
        System.out.println("loopBası.getNano() = " + loopBası.getNano());
        int sayi=0;
for (int i=0;i<1000;i++){
    sayi+=i;

}




LocalTime loopSonu=LocalTime.now();
        System.out.println("loopSonu.getNano() = " + loopSonu.getNano());
        System.out.println("loopSonu.getSecond() = " + loopSonu.getSecond());

    }
}
