package j05_IfStatement.Tasks_İf;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*Task->
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf"
		 Bu character kucuk harf ise "Kucuk Harf"
		 Bu character harf degil ise "Harf Degil"  print eden code create ediniz.
		*/
		

		/*
		 Logical Operator (Mantik Islemleri)
		 1) And Islemi : Sembolu & veya && dir.&& sembolu daha hizli calisir.Bu yuzden genellikle && kullaniriz
		 						true && true = true
		 						true && false = false
		 						false && true = false
		 						false && false = false
		 2)Or Islemi : Sembolu || dir
		 						true || false = true
		 						true || true = true
		 						false || true = true
		 						false || false = false
		 3)Not Islemi : Sembolu !'dir
		 						!true = false
		 						!false = true
		 						
		 						
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("lütfen bir ifade giriniz");
		char ifade=input.nextLine().charAt(0);
		if (ifade>='A'&&ifade<='Z'){
			System.out.println("büyük harf girdiniz");
		} else if (ifade>='a'&&ifade<='z') {
			System.out.println("küçük harf girdiniz");

		}else if (ifade>='0'&&ifade<='9'){
			System.out.println("rakam giridiniz");
		}else System.out.println("özel karakter girdiniz");


	}

}
