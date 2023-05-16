package j07_StringManipulations;

public class C12_ValueOf_parse {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.


// task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..
/*String  bagis1="10000";
String bagis2="20316";
int yeniBagis=Integer.valueOf(bagis1);
        int yeniBagis2=Integer.valueOf(bagis2);

        System.out.println("bagis tolam:"+(yeniBagis+yeniBagis2));




        int tc=987654321;
String tcStr=String.valueOf(tc);//int tc degeri stringe atandı
        System.out.println("tcStr = " + tcStr);
        System.out.println("(tcStr+tc) = " + (tcStr + tc));
String iphone="$1500";
String ipad="$1200";

int iphonefyt=Integer.valueOf(iphone);
        System.out.println("iphonefyt = " + iphonefyt);//rte verdi cünkü $karakteri number değildir
        String newIphone = iphone.substring(1);
        String newPad = ipad.substring(1);

        int iphonePrice = Integer.valueOf(newIphone);
        System.out.println("iphonefyt = " + iphonefyt);
            // int iphoneFiyat = Integer.valueOf(iphone);//RTE $ number değil
            int iphoneFiyat= Integer.valueOf(iphone.substring(1)) ;
            int ipadFiyat= Integer.valueOf(ipad.substring(1)) ;
            System.out.println("toplam fiyat = " + (iphoneFiyat+ipadFiyat));//2700*/

        //Task:String strA="$13.99" String strB="$17.55"; parse metodunu kul strA+strB

        String strA="$13.99";// \\D ile replace yapabiliriz
        String strB="$17.55";
     double strA1=Double.parseDouble(strA.substring(1));
      double strB2=Double.parseDouble(strB.substring(1));
        System.out.println("strA1+strB2 = " + strA1 + strB2);
/* String strA="$13.99";
        String strB="$17.55";

        double stra= Double.parseDouble(strA.replaceAll("\\D",""));
        double strb= Double.parseDouble(strB.replaceAll("\\D",""));
        double straa= Double.parseDouble(strA.substring(1));
        double strbb= Double.parseDouble(strB.substring(1));

        System.out.println("toplam : "+(straa+strbb));//31.54
        System.out.println(" toplam : "+((stra+strb)/100));// 31.54
        System.out.println(" toplam : "+(strA+strB));// $13.99$17.55*/









    }
}
