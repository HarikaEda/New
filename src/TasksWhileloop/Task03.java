package TasksWhileloop;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
 //girilen tam sayı için çarpım tablosu print eden code create ediniz
 //input=8-> output:8x1=8,8x2=16  ..8x10=80gibi


Scanner input=new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayi=input.nextInt();
        int i=1;
        while (i<=10){
            System.out.println(sayi+"*"+i+"="+(sayi*i));
            i++;






    }}}

