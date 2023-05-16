package j31_HashMap;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {
     //map.putAll: girilen map istenen map'a eklenir.
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println("hm = " + hm);
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("javaCAN", "vedat");
        hm1.put("javaNAZ", "ceren");
        hm1.put("javaTAR", "sümeyye");
        hm1.put("javaNUR", "rukiye");
        hm1.put("javaSU", "haluk");
        HashMap<String, String> hm3 = hm1; //hm1 hm3'e atandı
        HashMap<String, String> hm4 = new HashMap<>(hm3); //hm3 hm4 için cons. parametresi yapıldı
        System.out.println("hm3 = " + hm3); //{javvaNUR=rukiyye, javaNAZ=ceren, javaTAR=sümeyye, javaCAN =vedat, javaSU=haluk}
        System.out.println("hm4 = " + hm4); //{javvaNUR=rukiyye, javaCAN =vedat, javaNAZ=ceren, javaSU=haluk, javaTAR=sümeyye}


    }
}
