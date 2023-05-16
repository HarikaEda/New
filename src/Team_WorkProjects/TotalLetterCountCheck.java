package Team_WorkProjects;

import java.util.Scanner;

public class TotalLetterCountCheck {
    /* Given a String ,
       if the count of the letter in the String is odd print true else print false */
    /*
     Girilen bir string ifadenin harf saysının tek olmasını kontrol eden code create ediniz.
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        // bu satırdan önceki kodları değiştirmeyiniz
if (word.length()%2!=0){
    System.out.println("true");
}else System.out.println("false");
    }
}

