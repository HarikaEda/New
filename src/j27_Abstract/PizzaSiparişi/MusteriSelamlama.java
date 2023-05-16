package j27_Abstract.PizzaSiparişi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MusteriSelamlama {

    static Date dt = new Date();
    static Calendar takvim = Calendar.getInstance();
    SimpleDateFormat df = new SimpleDateFormat();

    public static String MusteriSelamla() {
        takvim.setTime(dt);
        int saat = takvim.get(Calendar.HOUR_OF_DAY);
        if (saat > 8 && saat < 12) {
            return "Günaydın Efendim";
        } else if (saat >= 12 && saat < 16) {
            return "Tünaydın Efendim";
        } else if (saat >= 16 && saat < 21) {
            return "İyi Akşamlar Efendim";
        } else return "iyi Geceler Efendim";

    }
}