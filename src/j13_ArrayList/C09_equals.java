package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C09_equals {
    public static void main(String[] args) {
   //equals->iki listin hem index hem de value olarak eşitliğini kontrol eder true false return eder
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        ArrayList<String> ulkelist2 = new ArrayList<>(Arrays.asList("Almanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist2.equals(ulkelist) = " + ulkelist2.equals(ulkelist));
        ArrayList<String> ulkelist3 = new ArrayList<>(Arrays.asList("Almanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        System.out.println("ulkelist3.equals(ulkelist2) = " + ulkelist3.equals(ulkelist2));


    }
}
