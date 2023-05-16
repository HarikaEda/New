package j12_Arrays.ArrayTasks;

import java.util.Scanner;

public class Task08_8 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
int arr[]=new int[7];
        Scanner input=new Scanner(System.in);
        System.out.println("eleman giriniz");
for (int i=0;i<7;i++){
arr[i]= input.nextInt();

}
for (int i=0;i<7;i++){
    if (i%2==1){
        System.out.print("girdiğiniz elemanların tek sayı olanları : "+arr[i]+" ");
    }
}
    }
}
