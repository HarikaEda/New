package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;

public class C12_replaceAll_fill {
    public static void main(String[] args) {
   //replaceall();-> listte belirli bir elemanı bir elemana update eder

        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist = " + ulkelist);
        System.out.println("Collections.replaceAll(ulkelist,\"Güba\",\"PataGonya\") = " + Collections.replaceAll(ulkelist, "Güba", "Patagonya"));
        System.out.println("ulkelist = " + ulkelist);
        System.out.println("ulkelist.set(1,\"ebikgabık\") = " + ulkelist.set(1, "ebikgabık"));
       //fill()->tum elemanları istenen değere update eder
        Collections.fill(ulkelist,"Edaİstan");
        System.out.println("ulkelist = " + ulkelist);







    }
}
