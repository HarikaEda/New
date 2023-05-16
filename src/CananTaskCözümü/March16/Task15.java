package CananTaskCözümü.March16;

import java.util.ArrayList;
import java.util.List;

public class Task15 {
    public static void main(String[] args) {

    /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */
        List<Integer>asalSayılar=new ArrayList<>();
        for (int sayi=2;sayi<100;sayi++){
            boolean asalMı=true;
            for (int j=2;j<sayi;j++){
                if (sayi%j==0){
                    asalMı=false;
                }
            }
           if (asalMı)asalSayılar.add(sayi);

        }
        System.out.println("asalSayılar = " + asalSayılar);




    }
}
