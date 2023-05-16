package j12_Arrays;

public class C07_MdArrays {
    public static void main(String[] args) {
//Task-> int arr3[][]={
//                {3,5},//0. kat
//                {12,13,15},//1. kat
//                {103,107,111,121},//2. kat
//        }; array elamanları toplamını print eden code create ediniz

int toplam=0;
        int arr3[][]={
              {3,5},//0. kat
                {12,13,15},//1. kat
               {103,107,111,121} };

        for (int i = 0; i < arr3.length; i++) { // her kat için
            for (int j = 0; j < arr3[i].length; j++) { // o kattaki elemanlar için
                toplam += arr3[i][j]; // toplamak icin icine atti
            }

        }
        System.out.println("toplam = " + toplam);
  //task:arrayın tum elemanlarını carpan coed create ediniz.
        int arr[][]={
                {3,5},//0. kat
                {2,4,1},//1. kat
                {6,1,2,2},//2. kat
        };
        int crpm=1;//arr elemanların çarpımı içn boş kutu tanımlandı
        for (int kat = 0; kat < arr.length; kat++) {
            for (int daire = 0; daire < arr[kat].length; daire++) {
                crpm*=arr[kat][daire];
            }
        }
        System.out.println("arr elemanların çarpımı: "+crpm);//2880
  // Task:   sayi arr son eleman carpımını print eden code create ediniz.

        int carpım=1;
        for (int i = 0; i < arr.length; i++){
                carpım*=arr[i][arr[i].length-1];
        }
        System.out.println("carpım = " + carpım);
    }

}
