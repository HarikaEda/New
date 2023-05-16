package tasks;

import java.util.Scanner;

public class Task24 { static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
/*
       task-> girilen sayıya kadar olan Fİbonacci dizisi elemalarını print eden METHOD create ediniz.
       Fibonacci dizisi :1, 1, 2, 3, 5, 8, 13, 21, 34
*/


fibonacciDizimi();


    }

    private static void fibonacciDizimi() {
        System.out.println("bir sayı giriniz");
        int sayi= input.nextInt();

int s1=0;
int s2=1;
int s3=1;
for (int i = 0; i<=sayi; i++){
    s1=s2;
    s2=s3;
    s1=s2+s3;
    System.out.print(s1+" ");
}

}


}
