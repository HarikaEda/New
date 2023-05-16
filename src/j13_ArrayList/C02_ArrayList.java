package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {
//nCopies(int n, Obj)-> n elemanlı sabit obj'den oluşan list tanımlar
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        ArrayList<String> isimList = new ArrayList<>(List.of("Aydın", "Cihat", "Ismail", "Ceren", "Furkan", "Tugba"));//çuval

        ArrayList<String> yeniList = new ArrayList<>(Collections.nCopies(7,"javaTAR"));//-> 7 javaTAr elemanlı lst tanımlandı
        System.out.println("yeniList = " + yeniList);//
        System.out.println("ulkelist = " + ulkelist);
        ulkelist.addAll(isimList);
        System.out.println("ulkelist = " + ulkelist);
yeniList.addAll(3,ulkelist);
        System.out.println("yeniList = " + yeniList);
 //task:1 den 10 a kadar sayıları liste ekleyip print eden code create ediniz
    ArrayList<Integer>sayılar=new ArrayList<>();
    for (int i=0;i<10;i++){
        sayılar.add(i);
    }

        System.out.println("sayılar = " + sayılar);

    }
}
