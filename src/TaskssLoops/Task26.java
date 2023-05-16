package TaskssLoops;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
//task->verilen bir tam sayının rakamları toplamını print eden code create ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= input.nextInt();
        int rakamlarToplamı=0;//boş kutu tanımı
        for (int i=sayi;i>0;i=i/10){//her tekrarda basamak sayısı bir azalan döngü

rakamlarToplamı+=i/10;}
        System.out.println("rakamlarToplamı="+rakamlarToplamı);

    }
}
