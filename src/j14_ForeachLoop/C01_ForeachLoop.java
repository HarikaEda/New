package j14_ForeachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForeachLoop {
    public static void main(String[] args) {
/*
for-each loop for loop'un gelilmş halıdir.
1. clean code- yazım kolaylığı
2. code okuma kolaylıgı
3. hata yapma riskini azaltır.

 */
        List<Integer>sayilist=new ArrayList<>(List.of(16,21,33,54,15,45,58));
        System.out.println("    ****** task01 *****     ");
        //task01:list elemanlarını ayrı ayrı satırda print eden code create ediniz
        for (int i=0;i<sayilist.size();i++){
System.out.println(sayilist.get(i));
        }
        for (Integer w:sayilist
             ) {
            System.out.println("w = " + w);
        } System.out.println("   ***   Task02   ***   ");
// tasko02-> list tek elemanlarını ilk 3 eleman hariç print eden code create ediniz.
List<Integer>tekeleman=new ArrayList<>(List.of(16,21,33,54,15,45,58));
        for (Integer w: tekeleman.subList(3, tekeleman.size())) {
            if (w % 2 == 1) {
                System.out.print(w + " ");
            }
        }
        System.out.println("   ***   Task03   ***   ");
// task03-> list  elemanlarını 2 ve 5 index dahil  toplamını print eden code create ediniz.
        List<Integer>list1=new ArrayList<>(List.of(16,21,33,54,15,45,58));
        int toplam=0;
        for (Integer çekirdek:list1.subList(2,6)) {
            toplam+=çekirdek;
        }
        System.out.println("toplam = " + toplam);//147




        }

}
