package j05_IfStatement.Tasks_İf;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		/*
		Task->
		Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		“Eşkenar üçgen" yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen"
		yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen" print eden code create ediniz.
		 
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("1. kenar uzunluğunu giriniz");
		int kenar1= input.nextInt();
		System.out.println("2. kenar uzunluğunu giriniz");
		int kenar2= input.nextInt();
		System.out.println("3. kenar uzunluğunu giriniz");
		int kenar3= input.nextInt();
if (kenar1==kenar2||kenar3==kenar2||kenar3==kenar1){
	System.out.println("ikiz kenar üçgen");}
else if (kenar1==kenar2&&kenar2==kenar3&&kenar1==kenar3) {
	System.out.println("eş kenar üçgen ");

}else System.out.println("çeşit kenar üçgen");
/*if (kenar1 == kenar2 && kenar2 == kenar3 && kenar1 == kenar3) {
            System.out.println("Eşkenar üçgen");
        } else if (kenar1 == kenar2 && kenar2 != kenar3 && kenar3 != kenar1) {
            System.out.println("İkizkenar üçgen");
        } else if (kenar1 != kenar2 && kenar2 != kenar3 && kenar1 != kenar3) {
            System.out.println("Çeşitkenar üçgen");*/
        }



	}
