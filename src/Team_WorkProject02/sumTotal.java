package Team_WorkProject02;

public class sumTotal {
 /*
        Create String 2D array

        {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */


    /*
        String 2D array oluştur

       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

       String de $ varsa 3.2 ile çarp

       String de € varsa 4.2 ile çarp

       toplamını print eden code create ediniz.

    */
    public static void main(String[] args) {

        // kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin
        String[][] str = {{"$12", "$22", "5$"},{"€9", "€40", "$1", "$2"}, {"€12"}} ;
        double total1 =0;
        double total2=0;
        int dolartop=0;
        int eurotop=0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                if (str[i][j].startsWith("$")) {
                    str[i][j]=str[i][j].substring(1);
                    dolartop = dolartop+(Integer.parseInt(str[i][j]));
                    total1 = 3.2*(dolartop);
                     System.out.println("total1 = " + total1);
                } else if (str[i][j].startsWith("€")) {
                    str[i][j]=str[i][j].substring(1);
                    eurotop= eurotop+Integer.parseInt(str[i][j]);
                    total2 = 4.2*(eurotop);
                     System.out.println("total2 = " + total2);
                }

            }

        }
        double total=total1+total2;
        System.out.println("total = " + total);

    }
}





