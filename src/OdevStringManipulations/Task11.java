package OdevStringManipulations;

public class Task11 {
    public static void main(String[] args) {
 /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */
        //Kodu aşağıya yazınız.
String str="apple";
String str1="APPLE";
        System.out.println(str.equalsIgnoreCase("Apple"));
        System.out.println("str1 = " + str1);



    }
}
