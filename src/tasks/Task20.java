package tasks;

public class Task20 {
    public static void main(String[] args) {
    /*
    task->
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz
       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */
        System.out.println("$1 $12 €34 €56 $45 €78");
        dolarTopla();
        euroTopla();

    }

    private static void euroTopla() {
        String s="";
        int euro=0;
        for (int i=0;i<s.length();i++)
            euro+=euro;
        System.out.println("s = " + s);
    }

    private static void dolarTopla() {
        int dolar=0;
        String s1 = "";

        for (int i = 0; i<s1.length(); i++)
            dolar+=dolar;
        System.out.println("s1 = " + s1);
    }
}
