package Team_WorkProjects;

import java.util.Scanner;

public class TwoString {
     /*
            Given two string by using scanner class and add each other
            if first word last letter is same with second word first letter then remove one of them.

            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */


    /*


    Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini
    kaldırıp kelimeleri birleştiren code create ediniz

   Örnek:      "abc", "cat" --> "abcat"
               "abc", "dog"  -->"abcdog"


     */
    Scanner dp = new Scanner(System.in);

    String  allElements = dp.nextLine();

    String[] elements = allElements.split(" ");

    String s1 = elements[0];

    String s2 = elements[1];

    // code start here use s1 and s2 as words
    // kodu burdan başlatın ve s1 ve s2 kelime olarak kullanın
    /*if (s1.equals(s2)) {
        System.out.println(s1.substring(0, 1) + s1.substring(1, s1.length() - 1));
    } else {
        System.out.println(s1.substring(0, 1) + s1.substring(1, s1.length() - 1) + s2.substring(0, 1) + s2.substring(1, s2.length() - 1));
    }


*/

}
