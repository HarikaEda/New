package j27_Abstract.Personel;

public class Runner {
    public static void main(String[] args) {
Isci mrb=new Isci();
    mrb.name="BiloCan";
    mrb.maasBilgisi();
    mrb.maasHesapla();
    mrb.sigorta();
        System.out.println("mrb = " + mrb.name);
IdariPersonel cncx=new IdariPersonel();
cncx.name="Şehsuvar";
cncx.maasBilgisi();
cncx.maasHesapla();
cncx.sigorta();
        System.out.println("cncx = " + cncx.name);

    }
}
