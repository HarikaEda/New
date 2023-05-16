package j30_Collections.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task->
Node değerleri "Murat","javaCAN","javaTAR","Abdi bey" olan bir linkedList create ediniz.
Girilen bir String değeri linkedListte varlığını kontrol edip varsa slilp "Agam eleman halledildi"
yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi

 */
        Scanner input=new Scanner(System.in);
        System.out.println("String giriniz");
        String str=input.nextLine();

        LinkedList<String>list=new LinkedList<String>(Arrays.asList("Murat","javaCAN","javaTAR","Abdi bey"));
        if(list.remove(str)){
            System.out.println("Agam eleman halledildi");
        }
else System.out.println("Agam aradığınız kişiye ulaşılamadı");

        System.out.println(list);
    }


}
