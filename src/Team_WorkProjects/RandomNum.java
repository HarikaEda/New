package Team_WorkProjects;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {
   /* Given a positive integer num name is max ,
    create a random number between 0 to max
    output should be int  */
    /*
     Girilen sayı ile 0 arasında random bir sayi elde eden code create ediniz.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.parseInt(scanner.nextLine());
        // bu satırdan önceki kodları değiştirmeyiniz
       Random rnd=new Random();
       int number= rnd.nextInt(scanner.nextInt());//burada hata alıyorum




    }
}

