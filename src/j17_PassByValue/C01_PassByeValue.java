package j17_PassByValue;

public class C01_PassByeValue {
    public static void main(String[] args) {
/*
Java Pass By Value bir programlama dilidir.
Bir  primitive  variable  argument olarak bir methoda call edildiğinde variable
değil bir copy clone (vesikalık) (pointer)değeri gönderilir.

 */
// task -> verilen fiyat için %24 artırılmış fiyatı print eden method  create ediniz.
double fiyat=100;
        System.out.println("fiyat = " + fiyat);
fiyatArtır(fiyat);
        System.out.println("fiyat = " + fiyat);



    }//main sonu

    private static void fiyatArtır(double yfiyat) {
        yfiyat*=1.24;
        System.out.println("yfiyat = " + yfiyat);
    }
}//class sonu
