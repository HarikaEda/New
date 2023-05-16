package j12_Arrays.ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task02_2 {
    public static void main(String[] args) {
//task-> girilen int array elemanları toplamını print eden code create ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("kaç elemanlı array istersiniz");
        int arrBoyut= input.nextInt();
        int arr[]=new int [arrBoyut];
        for (int i=0;i<arrBoyut;i++){
            System.out.println(i+". index array elemanınnı giriniz");
            arr[i]= input.nextInt();
        }
        System.out.println("arr = " + Arrays.toString(arr));
        int toplam=0;
        for (int i=0;i<arrBoyut;i++) {
            toplam += arr[i];
        }
        System.out.println("toplam = " + toplam);




    }
}
