package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C08_subList {
    public static void main(String[] args) {
   //substring gibi,sublist istenen list parçasını return eder
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        System.out.println("ulkelist.subList(1,4) = " + ulkelist.subList(1, 4));
        ArrayList<String>ebikgabıkList=new ArrayList<>(ulkelist.subList(2,5));//ulkelistin sublisti returnu ebikgabıkliste atandı
        System.out.println("ebikgabıkList = " + ebikgabıkList);
//ulkelist.subList(3);cte verir

    }
}
