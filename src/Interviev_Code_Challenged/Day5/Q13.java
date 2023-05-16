package Interviev_Code_Challenged.Day5;

public class Q13 {
    public static void main(String[] args) {
     // Create a method which takes String array as a parameter
        // and prints all the element

            String [] arabalar = {"Honda", "Toyota", "Porsche", "Tesla", "BMW"};
            String [] renkler = {"Mavi", "Kirmizi", "Mor", "Kahverengi", "Sari","Turuncu", "Yesil"};
        strArrHepsi(arabalar,renkler);
    }
    private static void strArrHepsi(String[] arabalar, String[] renkler) {
        for (int i = 0; i < arabalar.length; i++) {
            System.out.println(arabalar[i]);
            for (int j = 0; j < renkler.length; j++) {
                System.out.println(renkler[j]);
               //!!!!!!!!!!!!!!!!!!!
            }

        }
    }
}
