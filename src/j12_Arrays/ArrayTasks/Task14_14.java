package j12_Arrays.ArrayTasks;

public class Task14_14 {
    public static void main(String[] args) {
   /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
         verilen Stringde bulunan rakamların toplamını print eden parametreli METHOD create ediniz.
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */String x="ade1r4d3";
        task14(x);


        }


    private static void task14(String x) {
        int toplam=0;
        for (char y:x.toCharArray()) {
            if (Character.isDigit(y))
                toplam+=Integer.parseInt(y+"");
            System.out.println("toplam = " + toplam);


        }
}
}
