package Loop03_DoWhileLoop;

public class C01_DoWhileloop {
    public static void main(String[] args) {
/*
While loop-> önce sart konrol edilir eğer  sart sonucu true alınırsa body action çalışır
do-While loop-> önce body action çalışır sonra şart kontrol edilir.Sart true ise loop devam eder.
sart false ise döngü kırılır ve döngüden sonraki ilk satır çalışır.
do-While loop->  game app. de daha çok kullanılır.
Trick: while loop sart sağlanmazsa hiç çaılşmayabilir ama do-while sart sağalasın sağlamasın
en az bir kez çalışır..

 */
     int yas=41;
    // while (yas>40){System.out.println("ismail bey:)yaşınız:"+yas+"gayet başarılı");
         yas--;

     do { System.out.println("ismail bey:)yaşınız:"+yas+"gayet başarılı");
        yas--;}while (yas>40);





    }
}
