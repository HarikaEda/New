package Interviev_Code_Challenged.Day5;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Q01 {
    public static void main(String[] args) {
//  PART 1
        // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
        // and add all elements from ArrayList to Set

        // ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
        // ve tüm öğeleri ArrayList'ten Set'e ekleyin

        // PART 2
        // create a method that takes Set<Character> and varargs of char as parameters
        // and adds all chars to the set

        // Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
        // ve tüm karakterleri sete ekleyin

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(20);
        list.add(10);
        System.out.println("list = " + list);
        Set<Integer> set = new HashSet<>();
        Set<Character> characterSet = new HashSet<>();
        System.out.println("set = " + set);
        arrayListtenSetOlustur(list);
        String setCharacter = "";
        //karaktertenSetOlustur(setCharacter, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'e', 'c', 'a');
        System.out.println("setCharacter = " + setCharacter);
    }
    private static void karaktertenSetOlustur(Set<Character>set, Character...chars) {
        for (Character c : chars) {
            set.add(c);
        }
        System.out.println("set = " + set);
    }
    private static void arrayListtenSetOlustur(ArrayList<Integer> list) {
        Set<Integer>set=new HashSet<>();
        for (int sayii : list) {
            set.add(sayii);
        }
        System.out.println("set = " + set);
    }
}
