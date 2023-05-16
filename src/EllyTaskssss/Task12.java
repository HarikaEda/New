package EllyTaskssss;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.


            Scanner input = new Scanner(System.in);
            System.out.println("string bir ifade giriniz");
            String str =input.nextLine();
            int bosluk = str.indexOf(" ");
            if(bosluk == -1 && !str.isEmpty()) System.out.println("istenen sartlara uygun ");
            else System.out.println("sartlara uygun degildir");




        }
}
