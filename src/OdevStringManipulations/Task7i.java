package OdevStringManipulations;

import java.util.Scanner;

public class Task7i {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */
        Scanner input=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String karakter=input.next();
        System.out.println("index numarasını giriniz ");
        int index= input.nextInt();
        karakter.charAt(index);
        if (index>0&&index>=karakter.length()){
            System.out.println("karakter.charAt(index)");}else System.out.println("harfi yazdırmaz");






    }
}
