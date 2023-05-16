package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_sort_reverse {
    public static void main(String[] args) {
  //sort()->list elemanlarını naturel sıralama yapar
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist = " + ulkelist);
        Collections.sort(ulkelist);
        //System.out.println("ulkelist = " + ulkelist);//reverse()method list elemanlarını index sırasına göre return eder(tersten)
        ArrayList<String> citylist = new ArrayList<>(Arrays.asList("Angara", "Gonya", "Maraş", "Ayıntap", "Süvas"));//çuval

Collections.reverse(citylist);
        System.out.println("citylist = " + citylist);//ters index sıra


    }
}
