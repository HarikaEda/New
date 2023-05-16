package j12_Arrays.ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task04_4 {
    public static void main(String[] args) {
// task-> girilen bir int array elamanlarından  ortlaamadan buyuk olan eleman sayısını print eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.print(" kaç elemanlı array istirsin : ");
        int arrayBoyut = input.nextInt();
        int arr[] = new int[arrayBoyut];//girilen eleman kadar boş array create edildi

        for (int i = 0; i < arrayBoyut; i++) {
            System.out.print(i + ". index array elemanınını giriniz : ");
            arr[i] = input.nextInt();
        }
        System.out.println("array : " + Arrays.toString(arr));
int arrToplam=0;
for (int i=0; i<arrayBoyut;i++){
    arrToplam+=arr[i];
}int arrOrtalama=arrToplam/arrayBoyut;
int counter=0;//ortalamayı geçen arr elemanlarını sayan sayac
        for (int i=0;i<arrayBoyut;i++){
            if (arr[i]>arrOrtalama){counter++;}
        }
        System.out.println("counter = " + counter);
    }
}
