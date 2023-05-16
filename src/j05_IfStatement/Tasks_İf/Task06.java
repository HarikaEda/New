package j05_IfStatement.Tasks_İf;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("cinsiyetinizi giriniz");
		String cinsiyet = input.next();
		System.out.println("yaşınızı giriniz");
		int yas= input.nextInt();
		if (cinsiyet.equals("erkek")) {
			if (yas < 18) {
				System.out.println("erkek çocuk");

			} else System.out.println("adam");
		} else if (yas < 18){
			System.out.println("kız çocuk");
	}else System.out.println("kadın");}}
