package j05_IfStatement.Tasks_İf;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        /*
Task->
 Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana "Milenyum"
Eğer yıl 100’e bulunuyorsa ekrana "Yüzyıl"else if
Eğer yıl 10’a bulunuyorsa ekrana "Onyıl" print eden code create ediniz.if else
 */
        Scanner input = new Scanner(System.in);
        System.out.println("agam yıl giresen:");
        int yil = input.nextInt();
        if (yil < 0) {
            System.out.println("agam negatif yil mi olur:(\nadam gibi yil gir:");
        }
        if (yil % 1000 == 0) {
            System.out.println("milenyum");
        } else if (yil % 100 == 0) {
            System.out.println("yüz yıl");
        } else if (yil % 10 == 0) {
            System.out.println("on yıl");
        }
    }

}
