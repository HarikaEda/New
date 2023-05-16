package EllyTaskssss;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        // Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum
        // tamsayilari toplayip, sonucu yazdiran bir program yaziniz
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = scan.nextInt();
        System.out.print("Enter second number : ");
        int second = scan.nextInt();
        int sum =0 ;

        for (int i = first; i<=second; i++) {
            sum+=i;
        }

        System.out.println("sum = " + sum);




    }
}
