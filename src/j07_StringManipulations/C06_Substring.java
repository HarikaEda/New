package j07_StringManipulations;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {
    /*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */
String str="madem geldin dünyaya otur çalış javaya ";
        System.out.println(str.substring(10));
        System.out.println(str.substring(10,17));
//str deki son 10 karakteri print eden code creat ediniz.
        System.out.println(str.substring(str.length()-10));
        System.out.println(str.substring(0,10));//0,1,2,3,...9
//str deki ilk karakteri print eden code
        System.out.println(str.substring(0,1));//m
//str deki son karakteri
        System.out.println(str.substring(str.length()-1));
//ödev:girilen 4 harfli kelimeyi tersten print eden code creat ediniz.kale

        Scanner input=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime= input.nextLine();
            String str1="kelime";
    }

        private static String tersYaz(String kelime) {
                System.out.println(tersYaz(kelime));
 return kelime;






        }}



