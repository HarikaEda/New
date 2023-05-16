package J99_Lambda.Tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class C10_LambdaObject {
    private static C10_Univercity t;

    public static void main(String[] args) {
        C10_Univercity u01 = new C10_Univercity("Bogazici", "Matematik", 571, 73);
        C10_Univercity u02 = new C10_Univercity("Istanbul", "Matematik", 622, 77);
        C10_Univercity u03 = new C10_Univercity("Marmara", "Hukuk", 1453, 52);
        C10_Univercity u04 = new C10_Univercity("Itu", "uçak muh.", 333, 63);
       C10_Univercity u05 = new C10_Univercity("Yıldız Teknik", "Gemi ", 216, 55);

        List<C10_Univercity> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));

        System.out.println("   task01  ");
        System.out.println(controlNotOrt74Byk( unv)); // Agam unv notOrt 74 den buyuk deeel
        System.out.println("   task02  ");
        System.out.println(control110azOlmayanOgrcsayisi( unv)); // Unv öğrenci sayısı 110 dan fazla
        System.out.println("   task03  ");
        System.out.println(controlMathBol(unv)); // Unv en az bir bolum Matematik bulundurur¬
        System.out.println("   task04  ");
        System.out.println(printOgrcSayisiTersSıra(unv)); //
        System.out.println("   task05  ");
task05(unv);
        System.out.println("   task06  ");
task06(unv);
        System.out.println("   task07  ");
task07(unv);
        System.out.println("   task08  ");
task08(unv);
        System.out.println("   task09  ");
        task09(unv);
        System.out.println("   task10  ");
        task10(unv);
        System.out.println("   task11  ");
        task11(unv);
    }//main sonu
    // Task01-> notOrt'larının 74'den buyuk oldg control eden code create ediniz...
    public static String controlNotOrt74Byk(List<C10_Univercity> unv){

        return unv.stream().allMatch(t->t.getNotOrt()>74)?"Agam unv notOrt 74 den  buyuk ":"Agam unv notOrt 74 den buyuk deeel";

    }
    //task02->ogrc sayilarinin   110 den az olmadigini  kontrol eden code create ediniz.
    public static String control110azOlmayanOgrcsayisi(List<C10_Univercity> unv){
        return unv.stream().allMatch(t->t.getOgrcSayisi()>=110)?
                "Unv öğrenci sayısı 110 dan fazla":
                "Unv öğrenci sayısı 110 dan az";
    }

    //task03->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden code create ediniz.
    public  static  String controlMathBol(List<C10_Univercity> unv){
        return unv.stream().anyMatch(t->t.getBolum().contains("Mat"))?
                "Unv en az bir bolum Matematik bulundurur":
                "Unv en az bir bolum Matematik bulundurmaz";
    }

    //task04->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static List<C10_Univercity> printOgrcSayisiTersSıra(List<C10_Univercity> unv){
        return unv
                .stream()
                .sorted(Comparator.comparing(C10_Univercity::getOgrcSayisi).reversed())//akışelamanları ogrcSayisina göre ters sıralandı
                .collect(Collectors.toList());//akışdaki elemanlar liste atandı
    }
    //task05->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print eden code create ediniz..

    public static void task05(List<C10_Univercity> unv){
        unv.stream().sorted(Comparator.comparing(C10_Univercity::getNotOrt).reversed()).limit(3)
                .collect(Collectors.toList())//akıştaki elemanlar boş liste atandı
                .forEach(System.out::println);
    }
    //task06-> ogrc sayisi en az olan 2. universite'yi  print eden code create ediniz.
    public static void task06(List<C10_Univercity> unv){
        System.out.println(unv.stream().sorted(Comparator.comparing(C10_Univercity::getOgrcSayisi)).limit(2).skip(1)
                .collect(Collectors.toList()));//akıştaki elemanlar boş liste atand
    }
//skip 1 yapınca ilkini atlayıp 2. yi verir.

    //task07-> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print eden code create ediniz.
    public static void task07(List<C10_Univercity> unv){
        int sonuc = unv.stream()
                .filter(t->t.getNotOrt()>63)
                .map(t->t.getOgrcSayisi())
                .reduce(0,(a,b)->(a+b));
     //2.yol
        System.out.println(unv.stream().filter(t -> t.getNotOrt() > 63).mapToInt(t -> t.getOgrcSayisi())//akıştaki el data type parametredeki ınt göre update edildi
                .sum());//akıştaki elemanlar toplandı

    }
    //task08-> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini print eden code create ediniz.
    public static void task08(List<C10_Univercity> unv){
        System.out.println(unv.stream().filter(t -> t.getOgrcSayisi() > 333).mapToDouble(t -> t.getNotOrt())
                .average());

    }
    //task09-> "matematik" bolumlerinin sayisini  print eden code create ediniz...
    public static void task09(List<C10_Univercity> unv){
        System.out.println(unv.stream().filter(t -> t.getBolum().contains("Mat"))
                .count());//akış elemanları saydırıldı
    }
    //task10-> Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu print eden code create ediniz...
    public static void task10(List<C10_Univercity> unv){
        System.out.println(unv.stream().filter(t -> t.getOgrcSayisi() > 571).mapToInt(t -> t.getNotOrt())
                .max());//akıştaki elemanların en buyuyğu alındı

    }
    //task11-> Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu print eden code create ediniz...
public static void task11(List<C10_Univercity> unv){
    System.out.println(unv
            .stream().filter(t -> t.getOgrcSayisi() < 1071).mapToInt(t -> t.getNotOrt())
            .min());//akıştaki elemanların en kucugu alındı

}


}






















