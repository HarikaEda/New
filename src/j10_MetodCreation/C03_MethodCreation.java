package j10_MetodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {
        String javaCAN = "Ahmet Bey";
        String javaTAR = "Ceren Hanım";

        selamVer();//köyümüm amelesi->aynı calssdaki method sadece name ile call edildi->

        C03_MethodDepo.gecmeNotu(55);//komşu koyun amelesini koy ismi ile call edildi->
        System.out.println("javaTAR = " + javaTAR);//
        /*
farklı Class'lardan method call etmek için ClassName.method() yapılır..
staticmethod-> gökteki güneş gibi
ancak aynı Class'dan method doğrudan method name ile call edilir
 */
    }



    private static void selamVer() {
        System.out.println("javaTAR'a selamlar dewamkee :)");
    }


}
