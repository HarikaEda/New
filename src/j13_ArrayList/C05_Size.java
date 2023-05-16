package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C05_Size {
    public static void main(String[] args) {
 //size() listin eleman sayısını return eder.arrayin length i gibi
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist.size() = " + ulkelist.size());


    }
}
