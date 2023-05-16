package j10_MetodCreation;

import java.util.Scanner;

public class C04_ATMrunner {static Scanner input=new Scanner(System.in);
   static int bakiye=1500;//herkes için geçerli oldu

//gökteki güneş yapıldıki herkes kullanabilsin***
    public static void main(String[] args){//main bası

 /*baslangıc bakıye $1500 sorgu, para çekme-yatırma ve çıkış işlemlerini yapan bir ATM app create ediniz.*/
sonKarar();
    }//main sonu
    public static void sonKarar(){
        System.out.println("           ***     ");
        System.out.println("***Java Bank'a Hoşgeldiniz***");
        System.out.println("devam için 1'i\nçıkmak için 0'ı tuşlayınız");
        int secim= input.nextInt();
        if (secim==1){
            System.out.println("İşlem menüsü: \nBakiye sorgu->1\nPara çekme->2\nPara yatırma->3\nÇıkış->4");
islemTercihi();
        } else if (secim==0) {
cıkıs();
        }else System.out.println("yanlış veya hatalı giriş yaptınız,tekrar deneyiniz!");





    }public static void islemTercihi(){
        System.out.println("Bir işlem seçiniz");
        int işlemSecicimi= input.nextInt();
        switch (işlemSecicimi){
            case 1://bakiye sorgu
             bakiyeSorgula();
                System.out.println("işlemlere devam etmek için 1 bitirmek için 0 seçiniz");

                if (input.nextInt()==1){
                    islemTercihi();
                } else if (input.nextInt()==0) {
                   cıkıs();
                }else System.out.println("hatalı giriş yaptınız");
             sonKarar();
                break;
                case 2://para çekme
                    paraCekme();
                    System.out.println("****Para çekme işleminiz gerçekleştiriliyor****");
                    int cekilenMiktar= input.nextInt();
                    if (cekilenMiktar<=bakiye){
                        bakiye-=cekilenMiktar;
                    }else
             sonKarar();
                break;
                case 3://para yatırma
                    System.out.println("***Para yatırma işleminiz gerçekleştiriliyor***");
                    int yatanMiktar= input.nextInt();
                    bakiye+=yatanMiktar;
                    paraYatırma();
                    sonKarar();

                break;
                case 4://çıkış
                 cıkıs();
                break;
            default:
                System.out.println("hatalı tuşlama yaptınız");
        }
    }

    private static void bakiyeSorgula() {  System.out.println("       *****      ");
        System.out.println("güncel ba)kiyeniz: "+bakiye);
    }

    private static void cıkıs() {
        System.out.println("***çıkış işleminiz başarı ile yapılmıştır,yine bekleriz***");
    }

    private static void paraYatırma() {     System.out.print("Yatırmak istediğiniz miktarı giriniz : ");
        int yatanMiktar= input.nextInt();
        bakiye+=yatanMiktar;
        System.out.println("Hesabınıza "+yatanMiktar+" geçmiştir");
    }

    private static void paraCekme() {
        System.out.println("****Para çekme işleminiz gerçekleştiriliyor****");
        System.out.println("***çekmek istediğiniz miktarı giriniz***");
        int cekilenMiktar= input.nextInt();
        if (cekilenMiktar<=bakiye){
            bakiye-=cekilenMiktar;

    }




}}//Class sonu
