package Interviev_Code_Challenged.Day5;

public class Q05 {
    public static void main(String[] args) {
       // create a method that accepts an int
        // and returns twice of that int
        // overload this method with wrapper class: Integer

        // int kabul eden bir metot yarat
        // ve bu int'nin iki katını döndürür
        // bu yöntemi wrapper sınıfıyla overload et : Integer
int sayi=5;
Integer sayi1=16;
        System.out.println("katla(sayi) = " + katla(sayi));
        System.out.println("katla(sayi1) = " + katla(sayi1));

    }

    private static Integer katla(Integer sayi1) {
        return sayi1*2;
    }

    private static int katla(int sayi) {
        return sayi*2;
    }
}
