package j12_Arrays.ArrayTasks;

public class Task05 {
    public static void main(String[] args) {//array with for if
        /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */
        //Kodu aşağıya yazınız.
        int sayiArr[] = {5, 6, 8, 12, 14, 19};
        int toplam = 0;
        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i] % 2 == 0) {
                toplam=sayiArr[i]+toplam;
                System.out.print("toplam = " + toplam);

            }else System.out.println(sayiArr[i]*-1);
        }
    }
}