package TaskssLoops;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
 /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */

        Scanner input=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime= input.nextLine();
        System.out.println("bir harf giriniz");
      char harf=input.next().charAt(0);
        int harfsayisi=0;//işleme etki etmeyecek başlangıc değeri 0 olan değer atandı.
        for (int i=0;i<kelime.length()-1;i++){if (kelime.charAt(i)==harf);harfsayisi++;
            System.out.println("girdiğiniz kelime" + harfsayisi+ "tane"+ harf+ "içerir");
        }}

    /*Scanner input = new Scanner(System.in);
        System.out.println("agam bir ifade giresen : ");
    String str = input.nextLine();//javacan
​
        System.out.print("agam hangi harfi saydıracaksın :");
    char harf=input.next().charAt(0);//a
​
    int harfSayisi=0;//işleme etki etmeyecek başlangıc değeri 0 olan bir int atandı
​
        for (int i = 0; i <=str.length()-1 ; i++) {//str ilk harf olan index 0 dan son harf olan length()-1 indexe kadar tekrar tanımlandı
        if (str.charAt(i)==harf) {//tekrardan gelen ifaden her bir harfini istenen harfe eşitliğini kontrol eder
            harfSayisi++;
        }
    }
​
        System.out.println("agam giridigin  ifade : "+str+" de istediğin harf :"+harf+harfSayisi+" kadar var");
​
        ​*/


    }

