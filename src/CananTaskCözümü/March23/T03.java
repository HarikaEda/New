package CananTaskCözümü.March23;

import java.util.Scanner;

public class T03 {
    // Taş kağıt makas oyunu

    // tas 1> makas 3
    // makas > kağıt 2
    // kağıt > taş

    // iki oyuncu da taş, kağıt, makastan birini seçer, 3 olan kazanır
    public static void main(String[] args) {


        int birinciOyuncuToplamPuan = 0;
        int ikinciOyuncuToplamPuan = 0;
        Scanner input = new Scanner(System.in);
while (birinciOyuncuToplamPuan<3&&ikinciOyuncuToplamPuan<3) {
    System.out.println("1.oyuncunun seçimi : ");
    System.out.println("oyunda taş için 1'i\nkağıt için 2'yi\nmakas için 3'ü seçin");
    int birinciSecim = input.nextInt();
    System.out.println("2.oyuncunun seçimi : ");
    System.out.println("oyunda taş için 1'i\nkağıt için 2'yi\nmakas için 3'ü seçin");
    int ikinciSecim = input.nextInt();
    if (birinciSecim == ikinciSecim) {
        System.out.println("Berabere");
    } else if ((birinciSecim == 1 && ikinciSecim == 3) || (birinciSecim == 2 && ikinciSecim == 1) || (birinciSecim == 3 && ikinciSecim == 2)) {
        birinciOyuncuToplamPuan++;
        System.out.println("1.oyuncu puan aldı");
    } else {
        ikinciOyuncuToplamPuan++;
        System.out.println("2.oyuncu puan aldı");
    }
}
        if (birinciOyuncuToplamPuan == 3) {
            System.out.println("oyun bitti, birinci oyuncu kazandı");
            System.out.println("Puan listesi: ");
            System.out.println("Birinci oyunun puanı: "+ birinciOyuncuToplamPuan +
                    " İkinci oyuncu toplam puanı: " + birinciOyuncuToplamPuan);
        } else if (ikinciOyuncuToplamPuan== 3) {
            System.out.println("oyun bitti, ikinci oyuncu kazandı");
            System.out.println("Puan listesi: ");
            System.out.println("Birinci oyunun puanı: "+ birinciOyuncuToplamPuan +
                    " İkinci oyuncu toplam puanı: " + ikinciOyuncuToplamPuan);
        }
}


    }

