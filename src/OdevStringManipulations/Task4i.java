package OdevStringManipulations;

import java.util.Scanner;

public class Task4i {
    public static void main(String[] args) {
  /*
         Task->
         Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= Java
         name2= haluk
         Print ==> Jahalukva
       */
        Scanner input=new Scanner(System.in);
        System.out.println("1. kelimeyi giriniz");
        String kelime1= input.next();
        System.out.println("2. kelimeyi giriniz");
        String kelime2= input.next();
        if (kelime1.length()%2==0){
            System.out.println(kelime1.substring(0,kelime1.length()/2)+kelime2+kelime1.substring(kelime1.length()/2));}else
            System.out.println("kelime 2,kelime 1'in içine yazılamaz");







    }
}
