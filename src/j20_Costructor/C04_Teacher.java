package j20_Costructor;

public class C04_Teacher {//öğretmen üreten kalıphane
  //fields:
  String ad;
  String soyad;
  String branş;
  int tecrube;
  int ıd;
  double maaş;
  boolean emekli;

  public C04_Teacher() {

  }

  public C04_Teacher(String ad, String soyad, String branş, int tecrube, int ıd, double maaş, boolean emekli) {
/*
Constructor içerisinden yukarıda(class level) tanımlanan object değişkenlerine(instance variable) erişilmek istenirse this keyword kullanılır.
this keyword, o anda üzerinde işlem yapılan object'in referansını return eder ve böylece nesne değişkenlerine(instance variable) erişilir.
 Ancak nesne değişkenleri(instance variable) ile cons. parametre değişkenlerinin isimleri farklı olsaydı(soyad = Soyad) this keyword gerek kalmayacaktı.
  Bu kural sadece constructor için değil, bütün metotlar için geçerlidir.
 */

    this.ad = ad;
    this.soyad = soyad;
    this.branş = branş;
    this.tecrube = tecrube;
    this.ıd = ıd;
    this.maaş = maaş;
    this.emekli = emekli;
  }

  @Override
  public String toString() {
    return "C04_Teacher{" +
            "ad='" + ad + '\'' +
            ", soyad='" + soyad + '\'' +
            ", branş='" + branş + '\'' +
            ", tecrube=" + tecrube +
            ", ıd=" + ıd +
            ", maaş=" + maaş +
            ", emekli=" + emekli +
            '}';
  }

  public void derssaati(){
      System.out.println("haftalık 15 saat sonrası ekstraya girer");



  }






}
