package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C14_ListConvertArray {
    public static void main(String[] args) {
      //listi arraya çevirme->toArray

  //1.yöntem->toArray(String[0]);to Array()parametre olarak String [0]olarakeklenir
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));//çuval
        String ulkeArr[]=ulkelist.toArray(ulkelist.toArray(new String[0]));
        System.out.println("Arrays.toString(ulkeArr) = " + Arrays.toString(ulkeArr));
//2.yöntem->tanımlanan Arrayin data type Object (Hz Adem)olarak tanımlanır.
    //Trick->Obje class javada tanımlı tüm classların atası olarak tanımlanır..
    //String Integer Double etc.claslar object clasının child(evladı)old için istenen durumda data type olarak kullanılır..
        Object  ulkeArr1 []=ulkelist.toArray();//list elelmanları toArray method ile Object data type ulkeArr atandı
        System.out.println("Arrays.toString(ulkeArr1) = " + Arrays.toString(ulkeArr1));//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]




    }
}
