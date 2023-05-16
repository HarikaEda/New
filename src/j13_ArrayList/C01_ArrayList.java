package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {
 /*
     Array List genel Tanimi:

            ArrayList<Type> arrayListName = new ArrayList<Type>();
                 List<Type> arrayListName = new ArrayList<>();

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde Class olmalidir
                - ArrayList<int> hatali bir tanimlamadir. Type Wrapper class gibi object türünden olmalidir

            2.  - Arrayler degistirilemez sabit bir .length;'de tanimlanir.
                - ArrayList'ler degistirilebilir size(); belirleme zorunlulugu olmadan tanimlanır.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

    List declarations(tanımlama) :
    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.

    key word: List<Wrapper Class> name=

    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
    List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
    List<wrapper Class> name = new ArrayList<>() *****doğru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
    ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

    List'e ilk değer atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    Array'ler Arrayy.toString(arrayAdi); ile print edilir.

    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.

 */
        //public static void main(String[]args) {


            //List create etme ve değer atama..
            ArrayList<Integer> listSayi = new ArrayList<>();//boş bir integer type list tanımlandı
            //1.yol add();method
            System.out.println("listSayi= " + listSayi);//[]
            listSayi.add(31);//liste ilk eleman olarak 31 eklenddi
            listSayi.add(46);
            listSayi.add(79);
            listSayi.add(44);
            listSayi.add(2);
            listSayi.add(1);
            listSayi.add(63);
            listSayi.add(46);//list eleman tekrarını dublicate kabul eder.
            System.out.println("listSayi = " + listSayi);//[31,46,79,44,2,1,63,46]
            //2.yol-> Arrays.asList():çuval
            ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Almanya", "Güba", "Polkonya", "Dingiltere", "Amerihonya"));
            System.out.println("ulkelist=" + ulkelist);

            //3.yol->Listof():çuval
            ArrayList<String> isimList = new ArrayList<>(List.of("Aydın", "Cihat", "İsmail", "Ceren", "Furkan", "Tuğba"));
            System.out.println("isimList=" + isimList);// ""

            //list print etme...
            //sout(listName);

            ArrayList<Integer> rakamlist = new ArrayList<>() {
                {
                    for (int i = 0; i < 10; i++) {
                        add(i);
                    }
                }
            };
            System.out.println("ebıkList = " + rakamlist);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]




    }
}
