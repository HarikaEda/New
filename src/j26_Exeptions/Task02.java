package j26_Exeptions;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
 /*
Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
edip mainde kontrol ediniz.

Trick->
sicaklikKontrol(int sıcaklık){
 throw new IOException("AGAM haba buz gibi dışarı çıkma");
  */
        Scanner input=new Scanner(System.in);
        System.out.println("hava sıcaklığını giriniz");
        int havaSıcaklık= input.nextInt();
        try {
            sicaklikKontrol(havaSıcaklık);
        } catch (Exception e) {
            System.out.println(e.getMessage()+"hava buuzzzzzz");
        }
        System.out.println("app harika");

    }//main sonu
    public  static  void sicaklikKontrol(int sıcaklık)throws IOException{
        if (sıcaklık<10){
       throw new IOException("hava buz gibi dışrı çıkma");

    }else System.out.println("hava gayet güzel");

       }
   }
