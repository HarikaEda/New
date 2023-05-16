package j32_Enum.enum03;

import java.util.ArrayList;
import java.util.Arrays;

public enum Runner {
    ;

    public static void main(String[] args) {
    /*  TASK :
1- Bir Kitap calss'i create ediniz, fields : name ve kategori(Enum)
2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
3- 3 kitap tanımlayınız bir ArrayList e atınız.
4- bir kategoriye gore listeletiniz.

*/
        Kitap ktb1 = new Kitap();
        ktb1.name = "Leyla mecnunun nesi oluyor";
       // ktb1.kategori = "roman";
        ktb1.tur=Kategori.ROMAN;

        Kitap ktb2 = new Kitap();
        ktb2.name = "Küşleme";
        //ktb2.kategori = "rooman";
        ktb2.tur=Kategori.ROMAN;

        Kitap ktb3 = new Kitap();
        ktb3.name = "Halukça";
        //ktb3.kategori = "Roman";
        ktb3.tur=Kategori.ROMAN;

        ArrayList<Kitap> kutuphane = new ArrayList<>(Arrays.asList(ktb1, ktb2, ktb3));
//kitap objesi atanmış Kitap data type ArrayList tanımlandı
       // for (Kitap k : kutuphane) {
           // if (k.kategori.equalsIgnoreCase("roman")) {
                //System.out.println(k.name);
           // }
//roman  kelimesi yanlış yazıldığı için burada bug oluştu,halbuki 3 tane roman varken 2 tanesini veriyor bana
            //böyle sıkıntılar yaşanmaması için enum kullanılır,roman herkese göre roman olmalıdır,o değişmemelidir
        for (Kitap k:kutuphane) {
            if (k.tur==Kategori.ROMAN) {
                System.out.println(k.name);
            }

        }

        }
    }
