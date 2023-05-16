package TaskssLoops;

import java.util.Scanner;

public class Task15 {
    public static <str> void main(String[] args) {
/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */
        Scanner input=new Scanner(System.in);
        System.out.println("string bir ifade giriniz");
        String str= input.nextLine();
        int sayac=0;
        int counter=0;
        for (int i = 0; i<=str.length()-1; i++)
    counter+=Character.isDigit(str.charAt(i))?1:0;
        System.out.println(counter);
}




}
