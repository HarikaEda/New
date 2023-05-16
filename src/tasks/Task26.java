package tasks;

import java.util.Scanner;

public class Task26 {static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
// task-> Girilen bir ifadenin tekrarlı karakterleri yalnızca 1 kez print eden METHOD create ediniz
// input-> javacanlara selam olsun
// output-> javcnlr selamou

        tekrarsızPrint();

    }

    private static void tekrarsızPrint() {
        System.out.println("String bir ifade giriniz");
        String str= input.nextLine();
        String tekrarsız="";
        for (int i=0;i<str.length();i++){
            if (!tekrarsız.contains(str.substring(i,i+1))){
           tekrarsız+=""+str.charAt(i);
            }
        }
        System.out.println(tekrarsız);

    }


}
