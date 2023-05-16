package j12_Arrays.ArrayTasks;

import java.util.Scanner;

public class Task09_9 {
    public static void main(String[] args) {
// Task -> Girilen 5 sayıyı , giriş sırasına göre tersten print eden code create ediniz
        int [] arr= new int[5];

       Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Lütfen array numaralarını giriniz :");
            arr[i]=scan.nextInt();
        }

        // ters çevirme
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }



    }
}
