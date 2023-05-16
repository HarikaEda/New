package j05_IfStatement;

public class C01 {
    public static void main(String[] args) {
/* int a=14;
 int b=20;
        if (a < b) {
            System.out.println(a+b);
        }
        if(a==b){
            System.out.println(a*b);}
        int a1=34;
                int b1=20;
                if (a<b){
                    System.out.println(a+b);}else{
                    System.out.println(a*b);
                }*/
        //ıf statement blok belli durum ve aksiyonları belirli sarta bagli
        //olarak calıştırmak için kullanılır


        int abYas=33;
        int msYas=41;
        if (abYas==msYas){
            System.out.println("yasdas arkadaslar :");
            System.out.println("yoksam siz gardas mısınız?");
        }
        //bagımsız if blokları sadece kendi scope(kapsamında)run eder
        //birden fazla if blok hepsinin body calışabilecegi gibi sart saglanmazsa hiçbiri calışmaz.
        if (msYas>=40){
            System.out.println("mıstafa bey 40 yas durt yas :)");}
        if (msYas+abYas>100);
        System.out.println("agam devamkee code sorunsuz calıştı.");//bagımsız bir komut oldu
        //if blokda süslü parantez kullanılmazsa(bad practice)ilk noktalıvirgüle kadar komut if ile calışır
        // sonrası ifden bagımsz calışır.















    }
}
