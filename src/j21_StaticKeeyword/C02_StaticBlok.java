package j21_StaticKeeyword;

public class C02_StaticBlok {
  static  String isim="Harika Eda";
  static {
      System.out.println("1. static bloc run edildi.");
      System.out.println("1. static bloc update öncesi isim = " + isim);
      isim="Selin Hanım";
      System.out.println("1. static bloc update sonrası isim = " + isim);
  }


    public static void main(String[] args) {
/*
       1.static block yapıları static variable'rı değer ataması update için kullanılır
       2.static block Class oluşturulduğunda butun method'lardan(main method dahil) önce çalışır
       3.birden fazla static block varsa yukarıdan aşagiya sıralama ile çalışır.
       4.static bloklar sadece 1 kere en basta calisir static olmayan bloklar her obje olusturulurken yeniden calisir
        */
        System.out.println("main method başladı");
        isim="mustafa";
        System.out.println("isim = " + isim);
        System.out.println("main method bitti");

    }static {
        System.out.println("2.static bloc run edildi.");
        System.out.println("2. bloc up date öncesi isim = " + isim);
        isim="Haluk Hoca";
        System.out.println("2. bloc up date sonrası isim = " + isim);



    }






}
