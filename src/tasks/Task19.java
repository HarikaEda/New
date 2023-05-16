package tasks;

public class Task19 {
    public static void main(String[] args) {
        /*
   task->
   INTERVIEW SORUSU !!!
   1'den 100'e kadar hic rakam  kullanmadan sayilari print eden METHOD create ediniz
    */
sayılarıYazdır(100);





    }

    private static void sayılarıYazdır(int sayı) {
        if (sayı>0){
            sayılarıYazdır(sayı-1);
            System.out.print(sayı +" ");
        }
    }

}
