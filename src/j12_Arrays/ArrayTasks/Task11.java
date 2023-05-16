package j12_Arrays.ArrayTasks;

public class Task11 {
    public static void main(String[] args) {//avarage of array
 /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */
        //Kodu aşağıya yazınız.

        int arr[] = new int[]{12, 14, 21, 23, 10, 4};
        int toplam = 0;
        for (int i = 0; i < arr[i]; i++) {
            toplam += arr[i];
        }
        System.out.println("arr ortalama = " + toplam / arr.length);
    }
}
