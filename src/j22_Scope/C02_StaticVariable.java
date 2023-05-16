package j22_Scope;

import j21_StaticKeeyword.C02_StaticBlok;

public class C02_StaticVariable {//class level
 /*  instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
        ogrenci notlari veya ogretmen branslari gibi
        bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate alınır

       Static variabler ise class variable olarak tanimlanir
       ve değeri tum class uyeleri icin sabittir. Okul ismi, okul mudurunun adi gibi
       eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali*/
static  String firma="Clarusway";
static  int firmaId;//initial edilmemiş static variable
static boolean firmaIt;//initial edilmiş static variable

    public static void main(String[] args) {//main level
        System.out.println("firmaIt = " + firmaIt);
        firmaIt=true;//static variable doğrudan call edilip value atandı->best practice
        C02_StaticVariable.firmaId=2021;//class name ile static var. cal edildi value atandı
        staticMethos();//static meth.static bloca dogrudan call edildi->galaksiler arası seyahat
       // non_staticMethod();static olmayan static olan bloca doğrudan call edilemez



    }//main sonu

    public static void staticMethos(){
        firmaId=2023;//initial edilmiş static variable static bloca call edildi
        System.out.println("firmaId = " + firmaId);


    }
    public  void non_staticMethod(){
        firma="offera en kısa yol";//initial edilmemmiş non_static bloca call edildis
        System.out.println("firma = " + firma);

    }
}//class sonu
