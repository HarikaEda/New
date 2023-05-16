package Loop02_WhileLoop;

import java.util.Scanner;

public class C03_Whileloop {
    public static void main(String[] args) {
//task:girilen tamsayının pozitif tam bolen sayısını print eden code create ediniz...
//// 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
//// 30 -> 1,2,3,5,6,10,15,30: 30'un 8 tane tam böleni var
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int bisayi= input.nextInt();
        int bolens=1;
        int sayac=0;
        while (bolens<=bisayi){if (bisayi%bolens==0){

        sayac++;}bolens++;
        }
        System.out.println("sayac = " + sayac);




    }
}
