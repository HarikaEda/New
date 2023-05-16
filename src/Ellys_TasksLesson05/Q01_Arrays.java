package Ellys_TasksLesson05;

import java.util.Scanner;

public class Q01_Arrays {
    public static void main(String[] args) {
        //Type a method to check if an int Array is symmetrical or not.
        Scanner input = new Scanner(System.in);
        int boyut=0;
        System.out.print("boyut = ");
        boyut = input.nextInt();
        int A[] = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.printf("A[%d]=",i+1);
            A[i] = input.nextInt();
        }
        for (int i = 0; i < boyut / 2;i++){
            if (A[i]!=A[boyut-1-i]){//simetrik elemanlar eşitlik kontrolü
            boyut=0;
            break;}
        }
        if (boyut==1){
            System.out.println("A Arrayi simetriktir");
        }else System.out.println("A arrayi simetrik değildir");
        input.close();
    }
}
