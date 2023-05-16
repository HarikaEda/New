package J99_Lambda.Tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_Sorted {
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));
        System.out.println("\nTASK01");
printCiftElKareBkSıra(sayiList);
        System.out.println("\nTask02");
printTekElemanlarKareKbSıra(sayiList);


    }//main sonu
// Task01-> list çift elemanlarının karelerini k->b sıra ile print eden code create ediniz
public static void printCiftElKareBkSıra(List<Integer> sayiList) {
       sayiList
          .stream()
         .filter(C01_LambdaExpression::ciftMi)
          .map(t->t*t)
           .sorted()//akıştaki karesi alınan elemanlar naturel order yapıldı
           .forEach(System.out::print);
/*
sorted()->

 */}
//Task02-> list tek elemanlarının karelerini b-k-> sıra ile print eden code create ediniz
   public static void printTekElemanlarKareKbSıra(List<Integer> sayiList){
        sayiList
          .stream()
          .filter(t->t%2!=0)
          .map(t->t*t)
          .sorted(Comparator.reverseOrder())//akıştaki elemanlar parametre ->ile sıralandı
          .forEach(System.out::print);
   }



}




