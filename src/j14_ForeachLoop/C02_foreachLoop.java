package j14_ForeachLoop;

public class C02_foreachLoop {
    public static void main(String[] args) {
// task array elamanlarının çarpımını print eden code create ediniz...-> with for-each

        int arr[][] = {{2, 3}, {4}, {5, 6, 7}};
        int Carpim = 1;
        for (int[] w: arr)
            for( int y : w) Carpim *= y;
        System.out.println(Carpim);


    }
}
