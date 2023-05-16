package j26_Exeptions;

import java.time.LocalDateTime;

public class Kullanıcı {

    public LocalDateTime kayıtzamanı;
    public String name;
    public String kayıtZamanı;

    public Kullanıcı(String ad, LocalDateTime now) {

    }

    //task 1. stepp
    public class kullanıcı {//kullanıcı obj uretecek kalıphane class -> main olmaz

        String name;//obj de değer alacak inst. var.
        LocalDateTime kayıtZamanı;//obj de değer alacak inst. var.

        public kullanıcı(String name, LocalDateTime kayıtZamanı) {//full p'li teleskopik cons.
            this.name = name;
            this.kayıtZamanı = kayıtZamanı;
        }

        @Override
        public String toString() {//bu class'dan olusturulan obj print etmek için obj datalarını string'e cevirir
            return
                    "name='" + name + '\'' +
                            ", kayıtZamanı=" + kayıtZamanı;
        }
    }

}
