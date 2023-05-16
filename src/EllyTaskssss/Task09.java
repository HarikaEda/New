package EllyTaskssss;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {

/*
      Kullanicidan bir kelime girmesini isteyin.
      * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
      * kelimenin ortasindaki karakteri yazdirin.
      */



        Scanner input=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime= input.nextLine();

         char ortancaKrk = kelime.charAt((kelime.length() - 1) / 2);
          if (kelime.length() % 2 == 1 && kelime.length() >= 3) {
          System.out.println("ortancaKrk = " + ortancaKrk);
                } else
          System.out.println("tek sayida karakter iceren bir kelime giriniz..");


        }
}
