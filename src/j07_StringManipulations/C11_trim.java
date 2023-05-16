package j07_StringManipulations;

public class C11_trim {
    public static void main(String[] args) {
 /*
  trim()-> İstediğimiz String'in başında veya sonunda varolan boşluk (space)'leri temizler.
*/
String str="       javacanlara selam olsun :)       ";
        System.out.println("str = " + str);
       System.out.println("str.length() = " + str.length());
        System.out.println("str.trim() = " + str.trim());
       System.out.println("str.trim().length() = " + str.trim().length());


    }
}
