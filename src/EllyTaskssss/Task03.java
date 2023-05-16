package EllyTaskssss;

public class Task03 {
    public static void main(String[] args) {

        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */
String num1="$13.99";
String num2="$10.55";
    double num1a=Double.parseDouble(num1.substring(1));
      double num2b=Double.parseDouble(num2.substring(1));
        double toplam = (num1a + num2b);
        System.out.println("toplam = " +"$ "+toplam);
     /*num1=num1.replaceAll("\\D","");
     num2=num2.replaceAll(" \\D","");
        System.out.println(num1 + num2);*/
    }
}
