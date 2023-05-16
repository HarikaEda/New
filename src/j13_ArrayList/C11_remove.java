package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C11_remove {
    public static void main(String[] args) {
    //remove()->listte istenen elemanları siler
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist.remove(\"Angara\") = " + ulkelist.remove("Angara"));
        System.out.println("ulkelist.remove(\"Güba\") = " + ulkelist.remove("Güba"));
        //System.out.println("ulkelist.remove(21) = " + ulkelist.remove(21));//RTEverir
        System.out.println("ulkelist.remove(3) = " + ulkelist.remove(3));
        ArrayList<String> citylist = new ArrayList<>(Arrays.asList("Angara", "Gonya", "Maraş", "Ayıntap", "Süvas"));//çuval

        System.out.println("ulkelist = " + ulkelist);
        ulkelist.addAll(citylist);
        System.out.println("ulkelist = " + ulkelist);
        System.out.println("citylist = " + citylist);
        System.out.println("citylist.removeAll(citylist) = " + citylist.remove(citylist));
        System.out.println("ulkelist.removeAll(citylist) = " + ulkelist.removeAll(citylist));


    }


}
