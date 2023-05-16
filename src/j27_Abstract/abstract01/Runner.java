package j27_Abstract.abstract01;

public class Runner {
    public static void main(String[] args) {
Civic c1=new Civic();
c1.kapı();
c1.motor();
c1.koltuk();
//bu haliyle run edebiliriz

        Honda c2=new Honda() {
            @Override
            public void motor() {

            }

            @Override
            void kapı() {

            }

            @Override
            void koltuk() {

            }
        };
        c2.isim="Type";
        c2.kapı();
        c2.koltuk();
        c2.motor();
        c2.sunroof();

    }
}
