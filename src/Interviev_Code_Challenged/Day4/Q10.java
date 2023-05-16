package Interviev_Code_Challenged.Day4;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        // indexi tek sayi olan karakterleri yazdiran bir code create ediniz

            Scanner scanner = new Scanner(System.in);
            System.out.print("bir metin giriniz :");
            String str = scanner.nextLine();
            for (int i = 1; i <str.length(); i+=2) {

                    System.out.print(str.charAt(i));
                }
            }

        }

