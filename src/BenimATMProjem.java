import java.util.Scanner;

public class BenimATMProjem { static Scanner input=new Scanner(System.in);
    static int bakiye=1500;
    public static void main(String[] args) {

    System.out.println("*****JAVA BANK'a Hoşgeldiniz*****");
    System.out.println("lütfen yapmak istediğiniz işlemi seçiniz");
    System.out.println("Bakiye sorgulamak için 1'i\nPara yatırmak için 2'yi\nPara çekmek için 3'ü\nÇıkış yapmak için 4'ü tuşlayınız");
    int secim=input.nextInt();
if (secim==1){
    bakiyeSorgulama();
} else if (secim==2) {paraYatırma();

} else if (secim==3) {paraCekme();

}else cıkıs();

    }//main sonu
     private static void bakiyeSorgulama() {
        System.out.println("            *****             ");
        System.out.println("işleminiz gerçekleştiriliyor lütfen bekleyiniz");
        System.out.println("Bakiyeniz : " +bakiye);
    }
    private static void paraYatırma(){
        System.out.println("yatırmak istediğiniz miktarı giriniz");
        int yatanMiktar=input.nextInt();
        int guncelBakiye = bakiye += yatanMiktar;
        System.out.println("***işleminiz başarıyla gerçekleştirilmiştir***");
        System.out.println("Güncel bakiyeniz : " + guncelBakiye);

    }
    private static void paraCekme(){
        System.out.println("Çekmek istediğiniz miktarı giriniz");
        int cekilenMiktar=input.nextInt();
        if (cekilenMiktar>bakiye){
            System.out.println("yetersiz bakiye");
        }else bakiye-=cekilenMiktar;
    }
    private static void cıkıs(){
        System.out.println("***çıkış işleminiz başarıyla gerçekleştirilmiştir***");
    }


}//Class sonu














