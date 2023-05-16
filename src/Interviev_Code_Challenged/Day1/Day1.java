package Interviev_Code_Challenged.Day1;

import java.util.Arrays;
import java.util.Scanner;

public class Day1 {
    public static class Q01 {
        public static void main(String[] args) {

         /*   Q01_CountsOfCharactersWithArray

         Kullanicidan bir String aliniz.
         String'de var olan her character'in sayisini(kaç adet olduğunu) ekrana yazdiriniz.
         Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
                abaa   ==> a=3  b=1
        */

            Scanner input = new Scanner(System.in);
            System.out.println("bir ifade giriniz");
            String str = input.nextLine();
            int sayac = 0;

            System.out.println("saydırmak istediğiniz harfi giriniz");
            char karakter = input.nextLine().charAt(0);
            for (int i = 0; i < str.length(); i++) {
                if (karakter == str.charAt(i)) {
                    ++sayac;
                }

            }

             System.out.println("Girdiğiniz ifadede : "+karakter+" harfi "+sayac+" tane vardır. ");
    /*Scanner input = new Scanner(System.in);
    for(String str = input.nextLine(); !str.isEmpty(); str=str.replaceAll(str.charAt(0)+"", ""))
        System.out.println(str.charAt(0) + " = " + (str.length() - str.replaceAll(str.charAt(0) + "", "").length()));*/
           Scanner sc=new Scanner(System.in);
            System.out.println("metin giriniz");
            String metin= sc.next();
            String strarr []=metin.split("");
            System.out.println(Arrays.toString(strarr));
    int count=0;








            }


    }

    public static class Q02 {
        public static void main(String[] args) {
           /* Q02_MergeCertainCharacters {
                 Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
                 * return eden metod yaziniz
                 *
                 * Örnek:  input            output
                 *  1 -    elma  2           eaea
                 *  2 -    army  3           ayayay

                 */
            Scanner input = new Scanner(System.in);
            String str = "";
            //MergeCertainCharacters(str);
            System.out.println("Bir kelime giriniz");
            str = input.nextLine();
            System.out.println("kelimenizin ilk ve son karakteri kaç kez yazılsın ? ");
            int n = input.nextInt();


        }//main sonu

       /* private static String MergeCertainCharacters(String str) {
            String ilkKarakter = str.substring(0, 1);
            System.out.println("ilkKarakter = " + ilkKarakter);
            String sonKarakter = str.substring(str.length() - 1);
            System.out.println("sonKarakter = " + sonKarakter);
            int n;
          for (int i = 0; i<n; i++) {
       (str.charAt(0) + str.charAt(str.length() - 1)
    }
            return str;
        }*/
    }

    public static class Q03 {
        public static void main(String[] args) {
          /*  Q03_PrimeNumber {

        Ask user enter a positive number and check if it is prime or not
        Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
         */
            Scanner input=new Scanner(System.in);
            System.out.println("Pozitif bir sayı giriniz");
            int sayi= input.nextInt();
            int sayac=0;
            for (int i=2;i<sayi;i++){
              if (sayi%i==0){
                  ++sayac;
              }

            }

            if (sayac==0){
                System.out.println("girdiğiniz sayı bir asal sayıdır");
            }else System.out.println("girdiğiniz sayı asal sayı değildir");

            System.out.println("sayi = " + sayi);

        }
    }

    public static class Q04 {
        public static void main(String[] args) {
            // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız. ( 4 kez deneme hakkı olsun)
            Scanner input = new Scanner(System.in);
            System.out.println("pın codunu giriniz");
            String pın = "harika123";
            int girişHakkı=4;
            int i;
            for (i = 4; i > 0; i--) {
                System.out.println(i + "deneme hakkınız kaldı");
                if (input.nextLine().equals(pın)){
                    System.out.println("giriş başarılı");
                }else {
                    System.out.println("hatalı giriş");
                    girişHakkı--;
                }

            }

        }
    }

    public static class Q05 {
        public static void main(String[] args) {
           /*Q05_CertainCharacterCount {
               Kullanicidan bir cumle ve bir harf alin, Cumlede harfin kac kere kullanildigini bulup, yazdirin
                 * ORNEK:
                 * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
                 *
                 * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
                 */

            Scanner input=new Scanner(System.in);
            System.out.println("bir cümle giriniz : ");
            String str= input.nextLine();
            System.out.println("saydırmak istediğiniz harfi giriniz : ");
           char harf =input.nextLine().charAt(0);
            int sayac=0;
            for (int i=0;i<str.length();i++){
                if (harf==str.charAt(i)){
                    ++sayac;
                }
            }

            System.out.println("Girdiğiniz ifadede : "+harf+" harfi "+sayac+" tane vardır. ");



            }
    }

    public static class Q06 {
        public static void main(String[] args) {

           /*Q06_FrequencyWithStringVaalueOf {
        Count the frequency of the letters in a given String as the format below:
        Input: String str = "Java is so Good";
        Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
         */
            String str = "Java is so good";
            int[] sayac= new int[str.length()];
            int i, j;

            char string[] = str.toCharArray();

            for(i = 0; i <str.length(); i++) {
                sayac[i] = 1;
                for(j = i+1; j <str.length(); j++) {
                    if(string[i] == string[j]) {
                       sayac[i]++;

                        string[j] = '0';
                    }
                }
            }

            System.out.println("  ");
            for(i = 0; i <sayac.length; i++) {
                if(string[i] != ' ' && string[i] != '0')
                    System.out.println(string[i] + "-" + sayac[i]);
    //        }


        }





        }
    }

    public static class Q07 {
        public static void main(String[] args) {
            /*Create a method that accepts a String as parameter and finds the sum of digits in that String.
            Example:
            input : J4\/4 1$ 34$¥
            output : 16

            Hint:
            Character.isDigit()
            Integer.valueOf()  */
            bulDigit();
    String str="J4\\/4 1$ 34$¥";
            int toplam = 0;

        }

        private static void bulDigit() {
            int toplam=0;
            String str = "J4\\/4 1$ 34$¥";
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    toplam += Integer.valueOf(str.substring(i, i+1));
                }
            }

            System.out.println("toplam = " + toplam);
        }




    }
}
