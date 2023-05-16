package Team_WorkProjects;

import java.util.Scanner;

public class GetTotal {

      /*

        Given three positive Strings
        remove all the non numeric numbers.
        change the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be == 65;

        NOTE : if the output less then 0 change output to -1
     */
    /*
    verilen String variable'da sayı değerlerinin toplamını print eden code create ediniz

        Ornek:
       String num1 = "$15";
       String num2 = "$20";
       String num3 = "$30";
       output ----> 65;
       NOT : Eğer output 0 dan küçük ise outputu -1 e cevir

   */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String allElements = scanner.nextLine();

        String[] elements = allElements.split(" ");

        String num1 = elements[0];

        String num2 = elements[1];

        String num3 = elements[2];

        // bu satırdan önceki kodlari değiştirmeyiniz
        // String num1,num2,num3 kullanın
        int num1Int = Integer.parseInt(num1);
        int num2Int = Integer.parseInt(num2);
        int num3Int = Integer.parseInt(num3);

        int total = num1Int + num2Int + num3Int;

        System.out.println(total);

    }


}



