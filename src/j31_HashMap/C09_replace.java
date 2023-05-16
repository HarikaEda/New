package j31_HashMap;

import java.util.HashMap;

public class C09_replace {
    public static void main(String[] args) {
        //map.replace();-> girilen  value değeri ilgili Key'de update edilip oldValue(update öncesi eski value) return edilir.
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println("hm replace öncesi = " + hm);
        System.out.println("hm.replace(\"Amazon\", \"99Euro\") = " + hm.replace("Amazon", "99Euro"));//değiştirdiğimiz value neyse onu getiriyor
        //sen bunu değiştirdin diye eski value return eder
        System.out.println("hm replace sonrası = " + hm);
        System.out.println("hm.replace(\"olmayanKEY\",\"javaNUR\") = " + hm.replace("olmayanKEY", "javaNUR"));// null
        // map'de olmayan Key için null return eder..



    }
}
