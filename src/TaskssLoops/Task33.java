package TaskssLoops;

import java.util.Scanner;

public class Task33 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = input.nextInt();
        Scanner Input =new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int Sayi = Input.nextInt();
        int x= 0;
        for (int i = 1; i<=Sayi/2; i++)
        {
            if (Sayi % i == 0)
            {
                x+=i;
            }
        }
        if (x==Sayi)
            System.out.println("Mükemmel Sayi");
        else
            System.out.println("Mükemmel Sayi degil");
    }




    }
