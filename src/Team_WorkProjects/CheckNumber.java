package Team_WorkProjects;

import java.util.Scanner;

public class CheckNumber {

    /*
        Given an int check the number is even or not

        if the number is even print true

        if the number is odd print false

        result should be true or false.

     */


     /*
        int data type number verildiğinde, number  çift-tek kontrol eden code create ediniz

        Eğer number çift ise  print true

        Eğer number tek ise  print false



     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        //bu satırdan önceki kodlari değiştirmeyiniz
if (number % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }






    }
}