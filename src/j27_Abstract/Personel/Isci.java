package j27_Abstract.Personel;

public class Isci extends Personel {
    @Override
    public void maasHesapla() {
        System.out.println("günde 8 saat çalışır");
    }

    @Override
    public void maasBilgisi() {
        System.out.println("işçiye asgari ücret verilir");
    }
}
