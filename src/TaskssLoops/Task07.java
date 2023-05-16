package TaskssLoops;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
     /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */
        Scanner input=new Scanner(System.in);
        System.out.println("bir boyut giriniz");
        int boyut= input.nextInt();
for (int d=1;d<=boyut;d++){
    for (int y=1;y<=boyut;y++){if (d==y){ System.out.print("1 ");}else
    {System.out.print("0 ");}

    }
    System.out.println(" ");
}


    }}
