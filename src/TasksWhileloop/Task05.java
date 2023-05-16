package TasksWhileloop;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print eden code create ediniz.
		 */
        Scanner input=new Scanner(System.in);
        System.out.println("ad ve soyadınızı giriniz");
        String name= input.nextLine();
        System.out.print("name = " + name.charAt(0)+" "+name.charAt(name.length()-1)+" ");





    }
}
