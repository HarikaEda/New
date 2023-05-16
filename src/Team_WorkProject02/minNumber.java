package Team_WorkProject02;

public class minNumber {
    public minNumber(int[][] arr) {
    }
          /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

        print the min number from the 2d array
     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

         int 2D arrayinin min number print eden code create ediniz.

     */




    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {2,3,1}, {5,5,5}, {2,1,3}};
        System.out.println(new minNumber(arr));
        System.out.println(minNumber2(arr));
        


    }

    private static boolean minNumber2(int[][] arr) {
            return false;
    }
}