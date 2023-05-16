package Team_WorkProject02;

public class maxNumber {
    public maxNumber(int[][] arr) {
    }
     /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

        print the max number from the 2d array

     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

         int 2D arrayinin max number print eden code create ediniz.

     */


    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {2,3,1}, {5,5,5}, {2,10,3}};
        maxNumber max = new maxNumber(arr);
        System.out.println(max);
        System.out.println(max.maxNumber());



    }

    private boolean maxNumber() {
        return false;
    }


}


