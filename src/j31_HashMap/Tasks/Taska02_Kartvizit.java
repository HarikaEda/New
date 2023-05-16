package j31_HashMap.Tasks;

public class Taska02_Kartvizit {//Pojo etkin
    //pojo class-> kartvizit obj field ve meth bulunduracak
    //fields
    String  isim;
    String  email;
    String  adres;
    String telefon;
    static int id=100;
    //construct


    public Taska02_Kartvizit(String isim, String email, String adres, String telefon) {
        this.isim = isim;
        this.email = email;
        this.adres = adres;
        this.telefon = telefon;
        this.id++;
    }
    //toString

    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                        ", email='" + email + '\'' +
                        ", adres='" + adres + '\'' +
                        ", telefon='" + telefon + '\'';
    }

}
