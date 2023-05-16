package j30_Collections.C02_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {
//interview question : girilen String datanın karakterlerini alfabetik print ediniz-> TreeSet'e atanır ...
// hashSet ve treeSet tanımlayıp run surelerini karsılastırınız..
// Trick run suresi için System.currrentTimeMillis() meth. call ediniz...
        Long hsBasla= System.currentTimeMillis();
        HashSet<String>hs=new HashSet<>();
        hs.add("Celine");
        hs.add("Ahmet");
        hs.add("Harikayı");
        hs.add("Ismail");
        hs.add("Sumeyye");
        hs.add("Murat");
        hs.add("Haluk");
        Long hsBitir=System.currentTimeMillis();
        System.out.println("hashset run süresi: "+(hsBitir-hsBasla));
        System.out.println("****************************************************************");
        Long tsBasla=System.currentTimeMillis();
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Celine");
        ts.add("Ahmet");
        ts.add("Harikayı");
        ts.add("Ismail");
        ts.add("Sumeyye");
        ts.add("Murat");
        ts.add("Haluk");
        Long tsBitir=System.currentTimeMillis();
        System.out.println("treeset run süresi : "+(tsBitir-tsBasla));
//iyi bir javacan için gelişmiş Mac lazım...



    }
}
