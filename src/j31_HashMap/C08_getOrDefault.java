package j31_HashMap;

import java.util.HashMap;

public class C08_getOrDefault {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println("hm = " + hm);
        System.out.println("hm.getOrDefault(\"Ebay\",\"javAYDIN\") = " + hm.getOrDefault("Ebay", "javAYDIN"));
        System.out.println("hm.getOrDefault(\"olmayanKEY\",\"javASLAN\") = " + hm.getOrDefault("olmayanKEY", "javASLAN"));
        // olmayanKEY map'de olmadıgı için girilem dafultValue javASLAN return edildi
        System.out.println("hm.getOrDefault(\"Vatan\",\"111Euro\") = " + hm.getOrDefault("Vatan", "111Euro"));
        System.out.println("hm.getOrDefault(\"Apple\",\"javaSU\") = " + hm.getOrDefault("Apple", "javaSU"));
        System.out.println("hm  getOrDefault sonrası= " + hm);//ilk durum neyse son durum da aynı oldu


    }
}
