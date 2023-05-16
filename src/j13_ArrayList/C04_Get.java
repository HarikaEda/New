package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_Get {
    public static void main(String[] args) {//chatAt gibi çalışır
    //get()-> listte girilen elemanı return eder,olmayan eleman için RTE verir
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya","Polkonya"));//çuval
       // ArrayList<String> isimList = new ArrayList<>(List.of("Aydın", "Cihat", "Ismail", "Ceren", "Furkan", "Tugba"));//çuval
        System.out.println("ulkelist.get(3) = " + ulkelist.get(3));


    }
}
