package CananTaskCözümü.March23;

import java.util.Scanner;

public class T02 {
    /*
     * Kullanicidan gelen datayi methodda parametre olarak alan
     * ve datanın 2'nin kuvveti olup olmadığını
     * kontrol eden PowersofTwo(num) methodu create ediniz.
     *
     *
     * input = 2
     * output = true
     *
     *
     * input2 = 10
     * output = false
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int num= input.nextInt();
        PowersofTwo(num);
        System.out.println(PowersofTwo(num));
    }

    private static boolean PowersofTwo(int num) {
        boolean ikininKuvvetiMi=false;
        for (int i=1; i<=num; i=i*2) {

            if (num==i) {
                ikininKuvvetiMi=true;
                break;
            }
            if (num<i) {

                break;
            }

        }

        return ikininKuvvetiMi;
    }
}
