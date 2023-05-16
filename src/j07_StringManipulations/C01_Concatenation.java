package j07_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {


/*Concat()->metodu içinde parametre aldığı String variable ı çalıştığı string sonuna ekler(birleştirir)
Trik:java '+' işleminde en az bir String ifade varsa aritmetik toplama değil birleştirme yapılır. */
        String qa="eda" ;
        String lead="harika";
        System.out.println(qa.concat(lead));//qa String sonuna lead string birleştirildi->edaharika
        System.out.println(qa);//çıktısı->eda oldu,çünkü atama yapılmadı
      /*Trik:String metodları variableı kalıcı değişritmez geçici değişiklik yapar.
  kalıcı değişiklik için atama yapmak gerekir.burada edaharika yazdı.*/
        qa=qa.concat(lead);
        System.out.println("qa = " + qa);
       qa=lead.concat(qa);
      System.out.println("qa = " + qa);
      lead.concat(qa);
        System.out.println("lead = " + lead);

        System.out.println(qa.concat("true"));//harikaedaharikatrue
        System.out.println(lead.concat(true + "$"));//harikatrue$
        System.out.println(lead.concat(53 + "çay"));//harika53çay
        System.out.println(lead.concat(53 + ""));//harika53
/*Trick***concat metodu parametre olarak string harici data aldığında tüm dataları Stringe çevirip concat eder
String mürekkep gibi bulunduğu ortamda diğer tüm dataları etkiler.yukarıda int bir ifadeyle concan ettik string oldu,
boolean bir ifadeyle concat ettik yine string oldu.
 */    int yas=48;//yas. yazdıgımda metod gelmez cünkü string değil.
        //"selam". desem hemen bi dünya metod gelir,çünkü string metodları stringde çalışır.














    }
}
