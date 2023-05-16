package TasksWhileloop;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {

        // task-> istenilen kadar tamsayının
        // toplamını print eden code create ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayı= input.nextInt();
        int toplam=0;
        while (sayı>=0){
            toplam+=sayı--;
        }
        System.out.println("toplam = " + toplam);




    }
}
