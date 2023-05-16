package j12_Arrays.ArrayTasks;

public class Task03 {
    public static void main(String[] args) {//create array3 int
/*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        //Kodu aşağıya yazınız..
int sayiArray[]={25,30,30,35,100};
int toplam=0;
for (int i=0;i<sayiArray.length;i++){
     toplam = sayiArray[i]+toplam;
}
        System.out.println("toplam = " + toplam);


    }
}
