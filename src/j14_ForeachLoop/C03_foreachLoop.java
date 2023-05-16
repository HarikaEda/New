package j14_ForeachLoop;

import java.util.ArrayList;

public class C03_foreachLoop {
    public static void main(String[] args) {
// task-> iki string array eleamanlarının ortak olmasını kontrol eden code create ediniz..with for-each
        String arr1[] = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String arr2[] = {"musty", "gülsüm", "ayşe", "enise", "cüneyt", "ciğdem"};
        ArrayList<String>ortakList=new ArrayList<>();
        for (String str1:arr1){
            for (String str2:arr2) {if (str1.equalsIgnoreCase(str2)){
ortakList.add(str1);
            }

            }

        }

if (ortakList.isEmpty()){
    System.out.println("ortak eleman yok");
}else System.out.println("ortak eleman : "+ortakList);

    }
}
