package j17_PassByValue;

public class C04_PassByValue {static double etiketFiyatı = 100;
   static double indirimOranı = 0.1;
    public static void main(String[] args) {
/*
eger bir method'a yapılan değişiklik kalıcı olsun istenirse
1.değişklik  yapılan variable'lar static olarak tanımlanır.
 */


            etiketFiyatı = 100;//güneş değeri 100 atandı
            indirimOranı = 0.1;
            System.out.println("indirim öncesi etiketFiyatı = " + etiketFiyatı);//100.
            // indir(etiketFiyatı, indirimOrani);//meth. call->90.0
            indirPsiz();//meth. call-> 90
            indirimOranı=0.25;

            //  indir(etiketFiyatı, indirimOrani);//meth. call->75.0
            indirPsiz();//meth. call-> 67.5
            indirimOranı=0.5;

            // indir(etiketFiyatı, indirimOrani);//meth. call->50.0
            indirPsiz();//meth. call-> 33.75

            System.out.println("indirim sonrası etiketFiyatı = " + etiketFiyatı);//100.0
        }//main sonu

        private static void indirPsiz() {
            etiketFiyatı*=(1-indirimOranı);
            System.out.println("p'siz methodda etiket fiyatı : "+etiketFiyatı);
        }

        private static void indirPli(double etiketFiyatı, double indirimOrani) {
            etiketFiyatı*=(1-indirimOrani);
            System.out.println("indirilmiş etiket fiyatı : " + etiketFiyatı);
        }



}//calss sonu
