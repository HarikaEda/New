package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_İndexOf {
    public static void main(String[] args) {
//indexOf-> List içinde istenen eleman var ise indexini return eder,olmayan için -1 return eder
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya","Polkonya"));//çuval
        //ArrayList<String> isimList = new ArrayList<>(List.of("Aydın", "Cihat", "Ismail", "Ceren", "Furkan", "Tugba"));//çuval
        System.out.println("ulkelist.indexOf(\"Amerigonya\") = " + ulkelist.indexOf("Amerigonya"));
        System.out.println("ulkelist.indexOf(\"Polkonya\") = " + ulkelist.indexOf("Polkonya"));//bastakini return eder(2)
        System.out.println("ulkelist.lastIndexOf(\"Polkonya\") = " + ulkelist.lastIndexOf("Polkonya"));//5
        System.out.println("ulkelist.lastIndexOf(\"Patakonya\") = " + ulkelist.lastIndexOf("Patakonya"));//-1


    }
}
