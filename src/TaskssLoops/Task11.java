package TaskssLoops;

public class Task11 {
    public static void main(String[] args) {
  /*
        A//1. satıra 1 harf
        A B//2. satıra 2 harf
        A B C//3. satıra 3 harf
        A B C D
        A B C D E
        A B C D E F
        şekli print eden code create ediniz.  65=A'nın ascıı değeri

        */
        int harf=65;
        for (int kat = 0; kat <6 ; kat++) {
            for (int daire = 0; daire <=kat ; daire++) {
          System.out.print((char) (harf+daire)+" ");
            }
            System.out.println();//HZ. dumy
        }
        }
          /*  System.out.println();}
       Scanner input = new Scanner(System.in);
        int toplam = 0;//işleme etki etmeyecek boş bir kutu tanımlandı

        for (int i = 1; i <= 5; i++) {//1 den 5 e kadar bir artımlı tekrar tanımlandı
            System.out.print(i + ". sayı giriniz : ");
            int sayi = input.nextInt();
            if (sayi <= 10 || sayi >= 20) {//girilen 5 sayının 10 ile 20 arası olmama şartı
                toplam += sayi;//10 ile 20 arası olmayan sayılar toplama eklendi
            }//if sonu
        }//for sonu
        System.out.println("girilen sayıların 10 20 arası hariç toplamı : "+toplam);*/






}
