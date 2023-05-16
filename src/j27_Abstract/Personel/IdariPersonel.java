package j27_Abstract.Personel;

public class IdariPersonel extends Personel{
    @Override
    public void maasHesapla() {
        System.out.println("günde 2 saat coding yapar");
    }

    @Override
    public void sigorta() {
        super.sigorta();
        System.out.println("sigorta yapıldı");
    }

    @Override
    public void maasBilgisi() {
        System.out.println("saati 200 tl");
    }
}
