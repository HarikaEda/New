package j27_Abstract.abstract01;

public abstract class Honda {//abs.parent class

    public abstract void motor(); //bodysiz implement zorunlu method.

    Honda()//abs-> body'siz implemet zorunlu meth.
    {

    }

    void sunroof() {//concrete-> body'li call edilebilir meth.

        System.out.println("Agam keyfini bilirsen sunroofu açarsan böğrüne maaşallah yazdırırsın ");
    }
    abstract  void  kapı();//abs-> body'siz implemet zorunlu meth.

    abstract  void koltuk();//abs-> body'siz implemet zorunlu meth.
    //abs. class concrete variable tanımlanır mı?->evet

    String isim = "murat bey";
    //abs. class abs. variable tanımlanır mı?->o-la-mazzzz
    // abstract String str="javaCAN";
    //final void finalMethod();//final bodysiz meth. tanımlanamaz
    //final abstract void finalMethod();//abstract meth. final olamaz
    //privite abstract void priv();abs meth. kısıtlanamaz..
    //static void gunes();//static concrete meth bodysiz olmaz..
    //static abstract void gunes();//abs static meth.. olamaz
    //
}

