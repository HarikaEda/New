package TaskssLoops;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden  create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
       Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str = input.nextLine();
        String cıktı="";//işleme etki etmeyecek boş kutu tanumlandı
        for (int i=0;i<=str.length()-1;i++){
            if (!cıktı.contains(str.substring(i,i+1))){//kutuda olmayan eleman kutuya eklendi
                cıktı+=str.substring(i,i+1);}//kutuda olmayan eleman kutuya eklendi

        }
        System.out.println("cıktı="+cıktı);
/*Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str = input.nextLine();//"aabbcccccddddaaa"
        String cıktı = "";//işleme etki etmeyecek boş kutu tanımlandı

        for (int i = 0; i <= str.length() - 1; i++) {

            if (!cıktı.contains(str.substring(i, i + 1))) {//strden ardışık parça cıktıda yoksa şartı

                //cıktı += str.substring(i, i + 1);//kutudan olmayan eleman kutuya eklendi
                cıktı += str.charAt(i);//kutudan olmayan eleman kutuya eklendi
            }
        }

        System.out.println("cıktı = " + cıktı);
    }*/






    }
}
