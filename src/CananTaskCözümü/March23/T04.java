package CananTaskCözümü.March23;

import java.util.Arrays;
import java.util.Scanner;

public class T04 {
/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime
		 * olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan
			* Java code create ediniz
			isAnagram("listen", "Silent") ==> true
			*
			* listen
			* silent
			*
			*
		 */
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Kelime giriniz:");
    String kelime1=input.nextLine();
    System.out.println("Kelime giriniz:");
    String kelime2=input.nextLine();
    isAnagram(kelime1,kelime2);
    System.out.println(isAnagram(kelime1,kelime2));
}
    private static boolean isAnagram(String kelime1, String kelime2) {
    boolean isAnagram =true;
    char[] arr1=kelime1.replace(" ","").toLowerCase().toCharArray();
    char[]arr2=kelime2.replace(" ","").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
      /* if (arr1.length!=arr2.length){
           isAnagram=false;
       }
       for (int i=0;i<arr2.length;i++){
           if (arr1[i]!=arr2[i]){
               isAnagram=false;
               break;
           }
       }

        return isAnagram;*/

        return Arrays.equals(arr1,arr2);//2. yöntem
    }


    }


