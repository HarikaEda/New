package OdevSwitchCase;

public class Task8 {
    public static void main(String[] args) {
 /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.
        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro
todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;
   "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:
      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise
      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.

       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.

        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("***** seyahat şirketimize hos geldiniz *****");
        System.out.println("Frankfurt : 60 km \nKoln : 80\n 20 Km basına 5 euro ucretlendirme yapılır :) ");
        System.out.print("yolculuk yapacagınız sehri seciniz : ");
        String hedef = scan.next().toUpperCase();//sehir buyuk harfe update edildi
        double bakıye = 100;
        double frUcret = (60 / 20) * 5;
        double klUcret = (80 / 20) * 5;*/

    }}
    /*Scanner input=new Scanner(System.in);
        System.out.println(" Seyahat şirketimize hoş geldiniz.");
                System.out.println("Frankfurt:60 km \nKoln:80 km:\n 20 km başina 5 euro ücretlendirme yapilir");
                System.out.println("Yolculuk yapacagınız şehri giriniz");
                System.out.println("secim");
                String secim = input.next().toUpperCase();

                int bakiye=100;
                int frucret=(60/20)*5;
                int klucret=(80/20)*5;
                switch (secim){
                case "Frankfurt" :
                System.out.println("Rota");
                System.out.println("Kaç kişilik bilet almak istiyorsunuz Max 2 kişilik bilet alabilirsiniz");
                int yolcuSayisi = input.nextInt();
                switch (yolcuSayisi) {
                case 1:
                case 2:
                System.out.println("Frankfurt " + "frucret*2");
                break;
                }       System.out.println("Seyahat bilgileriniz");
                System.out.println(secim+" "+yolcuSayisi+" "+frucret);

                case "Köln":
                System.out.println("Rota");
                System.out.println("Kaç kişilik bilet almak istiyorsunuz Max 2 kişilik bilet alabilirsiniz");
                int yolcuSayisi1 = input.nextInt();
                switch (yolcuSayisi1) {
                case 1:
                case 2:
                case 3:
                System.out.println("Köln"+"klucret*3");
                break;
                }
                System.out.println("Seyahat bilgileriniz");
                System.out.println(secim+" "+yolcuSayisi1+" "+klucret);
default:
        System.out.println("hatalı giriş yaptınız :");
        break;

        }


        }*/
