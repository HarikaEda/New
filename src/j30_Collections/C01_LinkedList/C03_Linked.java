package j30_Collections.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_Linked {
   public static void main(String[] args) {
      LinkedList<String> ll1 = new LinkedList<String>(Arrays.asList("balcan kebap", "ciğer şiş", "haşhaş kebap", "kilis tava", "küşleme"));
      System.out.println("ll1 ilk hali = " + ll1);
      //linkedList remove
      System.out.println("ll1.remove() = " + ll1.remove());//baştaki elementi çıkarır listten
      System.out.println("ll1.remove(\"çöp şiş\") = " + ll1.remove("çöp şiş"));
      System.out.println("ll1.removeFirst() = " + ll1.removeFirst());//ilk elementi çıkarır
      System.out.println("ll1.removeLast() = " + ll1.removeLast());//son elementi çıkarır
      System.out.println("ll1 = " + ll1);//remov sonrası
      LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("havuc dilimi", "dondurmalı irmik", "triliçe", "künefe", "su muhallebisi"));
      ll1.addAll(ll2);
      System.out.println("ll2 = " + ll2);
      ll1.removeAll(ll2);
      System.out.println("ll1'e ll2 eklenmiş hali = " + ll1);
      System.out.println("ll2.element() = " + ll2.element());
      ll2.get(3);
      System.out.println("ll2 = " + ll2);
      System.out.println("ll2 = " + ll2);
      ll2.getLast();
      System.out.println("ll2 = " + ll2);
   }
}