package j31_HashMap;

import java.util.HashMap;

public class C04_entrySet {
    public static void main(String[] args) {
    //map.entrySet(); girilen map'in key value
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm. Amazon  value : " + hm.get("Amazon"));//296 Euro
        System.out.println("hm. amazon  value : " + hm.get("amazon"));// null
        System.out.println("hm.get(33) = " + hm.get(33));// null

        System.out.println("hm.entrySet() = " + hm.entrySet());


    }
}
