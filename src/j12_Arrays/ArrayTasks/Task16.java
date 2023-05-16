package j12_Arrays.ArrayTasks;

public class Task16 {
    public static void main(String[] args) {//advens array get sum
        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */
        //Kodu aşağıya yazınız.
String str="$12 $23 $10 $2 $5 $2";
String[]y=str.split(" ");
int sum =0;
for (int i=0;i<str.length();i++){
    System.out.println(sum +=Integer.parseInt( y[i].substring(1)));
    System.out.println("sum = " + sum);
}




    }
}
