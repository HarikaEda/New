package tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {

    /*
   Task->  Saati saniyeye çeviren  method create ediniz
    */
        Scanner input=new Scanner(System.in);
        System.out.println("bir saat giriniz");
        int saat= input.nextInt();
        System.out.println(saniyeCevir(saat));

    }

    private static int saniyeCevir(int saat) {
        return (saat * 60 * 60);


    }
}
