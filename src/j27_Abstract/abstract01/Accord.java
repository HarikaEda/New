package j27_Abstract.abstract01;

public abstract class Accord extends Honda {
    @Override
    public void motor() {//override edilmiş ->abs parentten zorunlu implement edilmiş concrete meth.

        System.out.println("Agam 2.0 turbo çok yakar çabuk kaçar\nHız felakettir");
    }

    @Override
    void kapı() {//override edilmiş ->abs parentten zorunlu implement edilmiş concrete meth.
        System.out.println("agam vakumlu kapı çarpmasın ");
    }

    @Override
    void sunroof() {//override edilmiş ->abs parentten zorunlu olmayan  concrete meth.
        System.out.println("Agam cuğara yakınca sunroof açmayı unutma ");
    }

    @Override
    void koltuk() {//override edilmiş ->abs parentten zorunlu implement edilmiş concrete meth.
        System.out.println("Agam deri koltuk ter yapar pişik olmayasan :( ");
    }



    }
