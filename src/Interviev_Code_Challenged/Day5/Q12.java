package Interviev_Code_Challenged.Day5;

public class Q12 {
    public static void main(String[] args) {
        // Print 2D String array using loops
        String[][] arr = new String[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = String.valueOf(i) + " " + String.valueOf(j);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }




    }
}
