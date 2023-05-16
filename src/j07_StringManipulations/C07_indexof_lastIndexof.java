package j07_StringManipulations;

import java.util.Scanner;

public class C07_indexof_lastIndexof {
    public static void main(String[] args) {
/* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/
        String str="madem geldin dünyaya otur çalış javaya ";
        System.out.println(str.indexOf(':'));//40
        System.out.println(str.indexOf("':)"));//
        System.out.println(str.indexOf("x"));//-1,olmayan karakter old için -1 verdi
        System.out.println(str.indexOf("ya"));//16
//trik: birden çok karakter veya string için ->ilk okunan değerin indeksiniverir.
/** lastIndexOf()
 *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
 *  indexOf un sondan olan hali fakat index numaraları değişmez.
 *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
 *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
 */
        System.out.println(str.indexOf(("ya")));//16
        System.out.println(str.lastIndexOf("ya"));//36
        System.out.println(str.lastIndexOf("x"));//-1
/*   /* indexOf()
          char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
          Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
          contains den farkı indexini verir, contains ise true false
        */

      // String str = "madem geldin dünyaya otur çalış JAVA'ya :)";

        System.out.println(str.indexOf(':'));//40
        System.out.println(str.indexOf(":)"));//40
        System.out.println(str.indexOf("x"));//-1-> x olamdığı için -1 verir
        System.out.println(str.indexOf("ya"));//16
        // Trick-> olmayan karakter için index -1 return eder
        // Trick-> birden çok karakter veya string için -> ilk okunan değerin indexiniverir
   /* lastIndexOf()
         String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         indexOf un sondan olan hali fakat index numaraları değişmez.
         lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */
        // "madem geldin dünyaya otur çalış JAVA'ya :)";
        System.out.println(str.indexOf("ya"));//16
        System.out.println(str.lastIndexOf("ya"));//37
        System.out.println(str.lastIndexOf("x"));//-1
        System.out.println(str.lastIndexOf(":"));//40
        // */
        /*girilen st bir ifadenin asa.sartları saglamasını kontrol eden code create ediniz
        * girilen ifade java içermiyor
        * girilen ifade 1 adet java içeriyor
        * girilen ifadede 1 den cok java içeriyor
       */
        Scanner input=new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String cumle= input.nextLine();
        if (cumle.indexOf("java")==-1){
            System.out.println("java içermiyor");
        } else if (cumle.indexOf("java")==cumle.lastIndexOf("java")) {
            System.out.println("1 tane java içeriyor");}else System.out.println("birden çok java içeriyor");

        }


    }


