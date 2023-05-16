package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C10_Contains {
    public static void main(String[] args) {
 //contains->istenen elemanın varlığını kontrol eder true false return eder
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist.contains(\"Amerigonya\") = " + ulkelist.contains("Amerigonya"));
        System.out.println("ulkelist.contains(\"angara\") = " + ulkelist.contains("angara"));

    }

}
