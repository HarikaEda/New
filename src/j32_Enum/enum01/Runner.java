package j32_Enum.enum01;

public class Runner {
    public static void main(String[] args) {
     //task: verilen yılın ayını, numarasına göre kaç gun çektiğini print eden code create ediniz
     //int ay=3;//3. ay kaç gün o nedenle int=3 yaptık
       Aylar ay= Aylar.MART;
//Aylar enum data type ay variable tanımlanıp Aylar enumından MART fields call edilerek atandı..
        System.out.println(ay);//mart
        System.out.println(ay.name());//mart
        System.out.println(ay.ordinal());//2
        switch(ay){
         case OCAK:
             System.out.println("Ocak 31 gundur");
             break;
         case ŞUBAT:
             System.out.println("Şubat 28 gundur");
             break;
         case MART:
             System.out.println("Mart 31");
             break;
         case NİSAN:
             System.out.println("Nisan 30 gundur");
             break;
         case MAYIS:
                 System.out.println("Mayıs 31 gundur");
                 break;
         case HAZIRAN:
                 System.out.println("Haziran31 gundur ");
                 break;
         case TEMMUZ:
                 System.out.println("Temmuz 31 gundur");
                 break;
         case AĞUSTOS:
                 System.out.println("Ağustos 31 gundur");
                 break;
         default:
     }
        System.out.println("code başarılı");


    }


}
