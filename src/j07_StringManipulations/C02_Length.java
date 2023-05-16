package j07_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {
/*lenght()metodu girilen stringiin uzunluğunu:içinde bulunan karakter sayısını return eder
butun karakterleri("" arasındaki herşey karakterdir)uzunluk
 */
        String str="madem geldin dünyaya otur çalış Javaya'ya";
        System.out.println(str.length());//parantez içi boş kullanılır.
     int karakterSayisi=str.length();
        System.out.println("karakterSayisi = " + karakterSayisi);
    String str1=" ";
        System.out.println("str1 = " + str1.length());//1 karakter var
String str2="";
        System.out.println("str2 = " + str2.length());//0
        System.out.println("str1.concat(str3)");
        String str3=null;//cte:compile time eror(derlemek)mi verir yoksa rte:run time eror() mu?
        //cte:altı kırmızı çizgi olan dataları tanımlayamadığı için olan hata...
        System.out.println("str3 = " + str3.length());//code break oldu
        //rte:run timem exeption(yazdırmaz)
        /*Trik:null atanan Stringler herhangi bir metod coll etmaz.
        null case sensitive Null NULL != null ->sadece hiçliği gösteren bir pointer
        (işaretçiği)null:bir değer değildir hiçliği gösteren pointer dır.
         */
       /* String srt1;
        System.out.println(str3.concat(srt1));
        String name = new String();//declare edilmiş fakat atanmamış string variabledir
        name.concat(str1);//cte veriri(initialize edilmemiş)String metod calışmaz yani atanmamış
        System.out.println("code cıncık");*/
        System.out.println("agam code cincik dewamkee");//nulun oldugu satır kaldıgı müddetçe altına yazılan code lar çalışmaz...


    }
}
