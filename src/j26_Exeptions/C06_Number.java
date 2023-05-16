package j26_Exeptions;

public class C06_Number {
    public static void main(String[] args) {


        //num format excwption:
        String icardi = "1905";
        System.out.println("icardi = " + icardi);

        System.out.println("icardi+ 1903 = " + icardi + 1903);
        int wanda=Integer.parseInt(icardi);
        System.out.println("wanda = " + wanda);
        System.out.println(" wanda+1907="+(wanda +1907));

        String  id="98765432l";
        // int invalidID=Integer.parseInt(id);// RTRE -> NumberFormatException
        //  System.out.println("invalidID = " + invalidID);// RTRE -> NumberFormatException
        int invalidID;
        try {
            invalidID=Integer.parseInt(id);
            System.out.println("Agam bu satırı okuduysan code exception fırlatmadı ");
            System.out.println();
        }catch (NumberFormatException e) {
            id="987654321";
            invalidID=Integer.parseInt(id);
            System.out.println("alsana yeni ıd : "+invalidID);
            System.out.println("Agam bu satırı okuduysan code exception fırlattı ama handle ettik");
        }
        System.out.println("AGAM bu printi okuduysan app. gayet başarılı dewamkeee");

    }
}
