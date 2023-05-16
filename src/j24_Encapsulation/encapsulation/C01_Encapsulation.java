package j24_Encapsulation.encapsulation;

public class C01_Encapsulation {
    /*
      1) Encapsulation kisaca "data hiding" demektir

      2) Basarili bir Encapsulation için :
         a)Nasil kullanilacagi ve hedefi net olmalidir.(Direksiyon gibi)
         b)Kodun karmasikligi kullanimin karmasikligina sebep olmamalidir.Yani cok
          karmasik kodlardan olusan bir yapi basit bir sekilde kullanilabilmelidir.
         c)Bir bolumun hata vermesi diger bolumlerin hatasına sebep olmamalidir.

      3) Encapsulation yapısı  tanımlanması için
         a)Access modifier'lari private tanımlanmalı
         b) istenilen field'lar için  getter ve setter methodlari ile "encapsulated" datalar okunmalı (getter) ve
          update edilebilmeli(setter)    .
          c) uygun constructor tanımlanmalı.
          d) toString() method tanımlanmalı


      4) Encapsulation'in faydalari
         a) Esneklik(Flexibility). Field'lar setter() methodunu ile istenildiği kadar update edilebilir
         b) Reusability-> Field'lar  getter ve setter method'lari bir kere tanımlanıp proje icindeki
           tum classlar'dan istenildiği kadar kullanabiliri.
         c) Istenilen field  okunabilir(getter() olustur), istenilen field okunamaz(getter() olusturma)
          hale getirebilir.
         d) Istenilen field degistirebilir (setter() olustur), Istenilen field degistirilemez
          (setter() olusturma) yapabilir.

          ahan da  TRICK : Tum variable'lar private ve sadece getter() method tanımlanan  class'da
           data'lar sadece okunabilir, degistirilemez. Bu tarz class'lara "immutable class" denir.

      5) Kullanicinin kullandigi sistem arkasindaki karmasik yapiyi kullaniciya gosterilmez.

    */

/*
Java'da POJO, "Plain Old Java Object" kısaltmasıyla bilinen, temel bir Java sınıfıdır.
Bu sınıflar, verileri ve onların işlemlerini tutmak için kullanılır ve genellikle bir
veritabanı veya bir dosya gibi dış kaynaklardan veri almak veya onlara veri yazmak için
kullanılır. POJO'lar, sadece getter ve setter metodları ile erişilen özelliklere sahip
basit bir veri nesnesi olabilirler. POJO'lar, genellikle diğer nesneler veya bileşenlerle
 işbirliği yapmak için kullanılırlar ve bu nedenle veri aktarım nesneleri (DTO) olarak da adlandırılabilirler.
 */



    public static void main(String[] args) {

C02_Encapsulation obj1=new C02_Encapsulation();
        obj1.name="Ali Osman";
        System.out.println("obj1 = " + obj1.mailVer());
        System.out.println("obj1.idVer() = " + obj1.idVer());
        obj1.soyad="başarılı";
        System.out.println("obj1 = " + obj1.getid());
        System.out.println("obj1 = " + obj1.getid());
        obj1.setid(9999);
    }
}
