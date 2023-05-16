package Interviev_Code_Challenged.Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Q03D2 {
    public static void main(String[] args) {
 /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi= input.nextInt();
        int n1=0,n2=1,n3;
        System.out.println(n1+"\n "+n2);
for (int i=0;i<sayi;i++){
    n3=n1+n2;
    System.out.print(" "+n3);
    n1=n2;
    n2=n3;
}
        System.out.println();
    }
}
