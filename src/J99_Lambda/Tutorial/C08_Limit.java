package J99_Lambda.Tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C08_Limit {
    public static void main(String[] args) {

        List<String> yemahhh = new ArrayList<String>(Arrays.asList("küşleme", "soğanlı","trileçe", "bicibici", "büryan", "melemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));

        System.out.println("\n   task01   ");
task01(yemahhh);


        // Task01-> list elemanlarının karakter sayısı en buyuk olanı print code create ediniz...


    }//main sonu
    public static void task01(List<String> yemahhh) {
        yemahhh.stream().sorted(Comparator.comparing(String::length).reversed()).limit(1)
                .forEach(System.out::println);
/*
limit(a)->return type bir stream old için yani yeni bir eleman akışı old için birden çok eleman return edebilir...
foreach ile yazdırmazsak ref değeri verir...
 */
/*
limit(a)-> return typ bir Stream oldg için yani yeni bir elelman akışı oldg için birden çok elelman return edebilir.
dolayısıyla limit() meth çıktısı doğrudan sout parametre olamaz(print edilemez) .
limit() meth cıktısı array veya List gibi bir collectiona atanmalı.
 */
        System.out.println("   *** version02 ***   ");
        Object[] yemahhArr=  yemahhh
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())//9,8,7,6....
                .limit(1).toArray();
        System.out.println(Arrays.toString(yemahhArr));//[bicibici]

        System.out.println("   *** version03 ***   ");
        System.out.println(yemahhh
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())//9,8,7,6....
                .findFirst());//ıkşdaki ilk elemanı verir.

        System.out.println("   *** version04 ***   ");
        yemahhh
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())//9,8,7,6....
                .limit(1).forEach(System.out::println);//ıkşdaki ilk elemanı verir.
    }

}






