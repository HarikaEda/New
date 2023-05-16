package j12_Arrays.ArrayTasks;

public class Task10 {
    public static void main(String[] args) {//reverse string

       /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
    String arr="Hello World";
        String x = "Hello World";
        char[] y = x.toCharArray();
        for ( int i = y.length - 1 ; i >= 0 ; i--){
            System.out.print(y[i]);
    }

    }
}
