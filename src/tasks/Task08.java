package tasks;

import java.util.Scanner;

public class Task08 {static Scanner input=new Scanner(System.in);

   public static void main(String[] args) {

    /*
    Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz
   input: 2023
   output:false
    */

       System.out.println("bir yıl giriniz");
       int yıl= input.nextInt();
        artikYilKontrol();


    }

    private static void artikYilKontrol() {

        boolean artik=false;
        int yıl=0;
        if (yıl%4==0){
            if (yıl%100==0) {
                if (yıl % 400 == 0)
                System.out.println("artık yıl :  " + yıl);
            }else artik=false;

}/*   private static String artikYilHesapla(int yil) {

    return (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0) ?
     "Girilen yıl ARTIK YIL'dır" : "Girilen yıl ARTIK YIL değildir..");*/


}
}