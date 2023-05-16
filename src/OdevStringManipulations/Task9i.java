package OdevStringManipulations;

import java.util.Scanner;

public class Task9i {
    public static void main(String[] args) {
/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
		 */
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime= input.nextLine();
        if (kelime.length()%2==0)//çift karakterli olma şartı
        { System.out.println(kelime.substring(0, kelime.length() / 2));}
        else System.out.println("girilen metnin ilk yarısı bulunamaz");



    }
}
