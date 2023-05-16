package j07_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
/*charAt() metodu parametre int olarak girilen indexteki char değerini return eder.
*************index değeri her zaman 0 dan başlar*************
 */
String name="Harika eda";
        System.out.println(name.charAt(5));//java saymaya 0 dan başlar
        char karakter = name.charAt(7);//karakter sayısından fazla sayı girinca rte verir code kırılır.index boyutunu geçmiş demektir.
        System.out.println("harikanın 7. = " + karakter);//m bir ifadenin
//string bir ifadenin son karakteri length-1.index'tir---0 ilk karakteri verir.
        System.out.println(name.length()-1);

//task:girilen String bir ifadenin ortadaki karakterini ifade eden code creat ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
String str=input.nextLine();
      if (str.length() %2!=0);{
            System.out.println(str.charAt(str.length()/2));}

        }


    }
