package j05_IfStatement.Tasks_İf;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Bir harf hiriniz");
		String str= input.nextLine();
		if (str.equals("a")){
			System.out.println("Ilk küçük harf");
		} else System.out.println("Ilk küçük harf değil");

if (str.equals("Z")){
	System.out.println("Son büyük harf");
}else System.out.println("Son büyük harf değil");
	}

}
