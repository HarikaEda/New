package OdevSwitchCase;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
/*
		TASK :
		Girilen note değerinin  aşağıdaki kurallara göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Lütfen gecerli not giriniz" print ediniz

		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.*/
        Scanner input=new Scanner(System.in);
        System.out.print("Notunuzu giriniz : ");
        int not= input.nextInt();
        if (not>=0&&not<50){
            System.out.println("alığınız not D");
        } else if (not>=50&&not<60) {
            System.out.println("aldığınız not C");
        } else if (not>=60&&not<80) {
            System.out.println("aldığınız not B");
        }else if (not<=80){
            System.out.println("aldığınız not A");

    }
        switch (not){
            case 1:
                System.out.println("D");
            break;
            case 2:
                System.out.println("C");
            break;
            case 3:
                System.out.println("B");
            break;
            case 4:
                System.out.println("A");
            break;
            default:
                System.out.println("Hatalı bir giriş yaptınız");
            break;
        }
        System.out.println("code active");


}}
