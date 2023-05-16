package j12_Arrays.ArrayListTasks01;

import java.util.ArrayList;
import java.util.Scanner;

public class Task11_Prime_Numbers {
    public static void main(String[] args) {
 /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */
        ArrayList<Integer>primeNum=new ArrayList<>();
        for (int i=new Scanner(System.in).nextInt();i>1;i--){
            boolean flag=true;
            for (int j=0;j<i;j++){
                if (i%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag)primeNum.add(i);
        }
        System.out.println("primeNum = " + primeNum);


    }
}//bende exeption veriyor

