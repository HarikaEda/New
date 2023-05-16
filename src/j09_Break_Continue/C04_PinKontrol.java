package j09_Break_Continue;

import java.util.Scanner;

public class C04_PinKontrol {
    public static void main(String[] args) {
// Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
        Scanner input=new Scanner(System.in);

        String dogruSfre="12345";
        int deneme=0;
        while (deneme<3){
            System.out.println("pin kodunuzu giriniz");
            String pin= input.nextLine();
            if (pin.equals(dogruSfre)){
                System.out.println("şifre doğru");
                break;
            }else {
                System.out.println("hatalı giriş yaptınız,lütfen tekrar deneyiniz");
                deneme++;
            }
            if (deneme==3){
                System.out.println("fazla giriş yaptınız ,daha sonra tekrar deneyiniz");}

        }
      /*  Scanner input = new Scanner(System.in);
        int grsHkk=3;
        String  dgrPin="javaCAN";
        while (true){
            System.out.print("gakgom hele bi pin cizikdiresen ha :");
            if (dgrPin.equals(input.nextLine())) {
                System.out.println("Gakgom böyün ballı günüğndesin haa :)");
                break;
            } else {
                System.out.println("gakgom hele bi daha pin cizikdiresen ha :");;
                grsHkk--;
                System.out.println("Gakgom kalan hakkın : "+grsHkk);
                if (grsHkk == 0) {
                    System.out.println("Gakgom hiç canın kalmadı bekleme yapma DEWAMKEEE ");
                    break;
                }*/








    }
}
