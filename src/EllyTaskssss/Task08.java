package EllyTaskssss;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
        String name1="harika";
        String name2="ibrahim";
        if (name1.length()%2==0){
        System.out.println(name2.charAt(name1.length()/2));}
        else System.out.println("name1 çift sayılı olmadığı için ortasına yerleştiremedik.");

      /*  Scanner input=new Scanner(System.in);
        System.out.println("1. kelimeyi giriniz");
        String name1= input.next();
        System.out.println("2. kelimeyi giriniz");
        String name2= input.next();
        if (name1.length()%2==0){
            System.out.println(name1.substring(0,3)+name2+name1.substring(3,6));
        }else System.out.println("name 1 çift sayılı karaktere sahip olmadığı için name 2 yi ortasına yerleştiremedik");
*/
    }
}
