package j24_Encapsulation.encapsulation;

public class Kişi {//pojo Class
   /* task
Kisi pojo class için fields-> ad, soyad, password(String), yas
tum field'ları kullanıcı görebilmeli ve password haric update edebilmeli
(password encapsulated update edilmemeli.)
yas variable negatif değer girmeye karsı encapsulated

runner class'da obj ile field ları print eden code create ediniz
 */
  //fields:
  String ad;
  String soyad;
  String pasword;
  int yas;
//constructor:
Kişi(String ad, String soyad, String pasword, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.pasword = pasword;
        this.yas =Math.abs(yas);//mutlak değer alınarak instance variable 'a atandı..
//setYas();

    }
//getter-setter:
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getPasword() {
        return pasword;

    }

    public int getYas() {
        return yas;
    }

    public void setYas() {
        this.yas =Math.abs(yas);//parametre olarak gelen yas mutlak değer içine alındı
    }
//to string
    @Override
    public String toString() {
        return "Kişi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", pasword='" + pasword + '\'' +
                ", yas=" + yas +
                '}';
    }
}
