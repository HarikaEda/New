package EllyTaskssss;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int toplam=0;
        System.out.println("küçük sayıyı giriniz");
        int sayı1= input.nextInt();
        System.out.println("buyuk sayıyı giriniz");
        int sayı2= input.nextInt();
        for (int i=sayı1;i<=sayı2;i++)
            toplam+=i;
        System.out.println("toplam = " + toplam);

    }
}
