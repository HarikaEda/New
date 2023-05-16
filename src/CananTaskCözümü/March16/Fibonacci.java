package CananTaskCözümü.March16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
      /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı= input.nextInt();
        List<Integer>fibonacci=new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);
        int i=2;
        int yenisayi=0;
        while (yenisayi<sayı){
            yenisayi=fibonacci.get(i-2)+ fibonacci.get(i - 1);
            fibonacci.add(yenisayi);
            i++;


        }

        System.out.println(fibonacci);


    }
}
