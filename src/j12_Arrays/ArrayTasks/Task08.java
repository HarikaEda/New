package j12_Arrays.ArrayTasks;

public class Task08 {
    public static void main(String[] args) {//array min value
/*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
                */

        // Kodu aşağıya yazınız..

int arr[]={14,19,5,21};
        int min=arr[0];
for (int i=0;i<arr.length;i++){
    if (arr[i]<min){
        min=arr[i];
    }
    System.out.println("min = " + min);
}

    }
}
