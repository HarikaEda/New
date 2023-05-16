package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
//Task=bir listte istenen sayının varlığı kontrol eden code create ediniz
        ArrayList<Integer> List = new ArrayList<>(Arrays.asList(1, 2, 46, 44, 27, 21, 79, 31, 20, 58, 38, 59, 33));
        Scanner input = new Scanner(System.in);
        System.out.println("Hangi sayının varlığını kontrol etmek istiyorsunuz");
        int sayi = input.nextInt();
        boolean varMı = false;
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i) == sayi) {
                varMı =true;
                System.out.println("olaaa aradığınız sayı mevcut");
                break;
            }
        }

        if (!varMı) {
            System.out.println("aradığınız sayı listte bulunmamaktadır :(");
        }


    }
}
