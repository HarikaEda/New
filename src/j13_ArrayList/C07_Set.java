package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C07_Set {
    public static void main(String[] args) {
  //set()->listin istenen indexe istenen elemanını update set eder->şu indexin şu elemanını şu yap...
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist.set() = " + ulkelist.set(3,"Patgonya"));
//al bu da eskisi diye eski elemanı yazdırır,eleman değişiyor
        System.out.println("ulkelist = " + ulkelist);//set sonrası
        //System.out.println("ulkelist.set(33,\"Patgonya\") = " + ulkelist.set(33, "Patgonya"));RTE veriyor
//ulkelist.set(3,"a",5"b");cte verri,çoklu parametre girilemez


    }

}
