package j13_ArrayList.ArrayListTasks02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Haluk","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */
        ArrayList<String >isimler=new ArrayList<>(Arrays.asList("Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        Scanner input=new Scanner(System.in);
        String s=isimler.set(3,"Kerem");
        System.out.println("s = " + s);
        isimler.set(8,"Ahmet");
        System.out.println("isimler = " + isimler);
        isimler.set(3,s);
        System.out.println("isimler = " + isimler);

    }//??????????????????????????????????????????????????????
}
