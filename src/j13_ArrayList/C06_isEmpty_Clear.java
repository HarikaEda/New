package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C06_isEmpty_Clear {
    public static void main(String[] args) {
  //isEmpty(): listin boş olmasını kontrol eder true false return eder.
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist.isEmpty() = " + ulkelist.isEmpty());
//clear()->listin tum elemanlarını temizler,boşaltır
        ulkelist.clear();
        System.out.println("ulkelist.size() = " + ulkelist.size());
        System.out.println("ulkelist.isEmpty() = " + ulkelist.isEmpty());//clear sonrası


    }





}
