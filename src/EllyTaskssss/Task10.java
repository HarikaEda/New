package EllyTaskssss;

public class Task10 {
    public static void main(String[] args) {
// soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

String str="   Java ogrenmek123 Cok guzel@";
         str="   Java ogrenmek123 Cok guzel@      " ;
        System.out.println(str.replaceAll("C", "c").replaceAll("@", "").replaceAll("\\d", "").trim());
    }



}
