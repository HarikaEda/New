package j12_Arrays.ArrayTasks;

public class Task18 {
    public static void main(String[] args) {//2d array

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */
        //Kodu aşağıya yazınız.
        int arr[][]={{5,2,1} , {10,2,3,6} , {1,2}};
        int sum=0;
        for (int i=0;i< arr.length;i++)
            for (int j=0;j<arr[i].length;j++)
sum+=arr[i][j];
        System.out.println("sum = " + sum);

    }
}
