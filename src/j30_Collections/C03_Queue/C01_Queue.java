package j30_Collections.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
/*
Queue coll. interface oldg için child calss olan LinkedList ve PriorityQueue
ile obj uretilir.
Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
Cons seçimine göre queue obj özelliklieri belirlenir.
FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.Elemen en sona eklenişr enbaştan silinir

 */
        Queue<String> q1 = new LinkedList<>(Arrays.asList("javacan", "javasu", "javvanur", "javanaz"));
        System.out.println("q1 = " + q1);
        System.out.println("q1.add(\"javatar\") = " + q1.add("javatar"));
        Queue<String> q2 = new PriorityQueue<>(Arrays.asList("biftek", "meyve tabağı", "lüfer"));
        System.out.println("q2 add öncesi = " + q2);
        q2.add("gerdan");
        System.out.println("q2 add sonrası = " + q2);//kendince öncelik verip araya ekler
        System.out.println("q2.peek() = " + q2.peek());//ilk elemanı verir
        System.out.println("q1.peek() = " + q1.peek());
/*
   peek()-> copy-paste gibi ilk elemanı return eder ama silmez :gözetleme
   poll()-> cut-paste gibi ilk elemanı siler ve  return eder : kesme
   element() -> ilk elemanı silmeden return eder.
   remove() -> ilk elemnı siler ve return eder.. :kaldırma

  ahan da Trick kösesinde bugun : poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
  poll ise null return eder.

 */
        q1.clear();
        System.out.println("q1 = " + q1);
        q1.isEmpty();
        System.out.println("q1 = " + q1);
        q1.poll();
        System.out.println("q1 = " + q1);//null
        q1.remove();
       // System.out.println("q1 = " + q1);//NoSuchElementException verdi
        System.out.println("q1.element() = " + q1.element());
        //offer:queue coll.eleman eklemek için kullanılır.Eleman kısıtlaması varsa add() method rte verir.
        //rte fırlatırken offer()null return eder.
        q1.offer("javfer");
        System.out.println("q1 = " + q1);
        System.out.println("code başarılı");

    }
}
