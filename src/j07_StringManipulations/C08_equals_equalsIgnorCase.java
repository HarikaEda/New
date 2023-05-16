package j07_StringManipulations;

public class C08_equals_equalsIgnorCase {
    public static void main(String[] args) {
        /* equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *  equals() method'u verilen iki String'in içeriğinin birbirine eşit olup olmadığını kontrol eder.
         * == karşılaştırma operatörü ise verilen iki String objesinin değerinin yanında reference(adres)'lerine de bakar.
         * Aynı değere sahip olsa da farklı iki objeyi == ile karşılaştırdığımızda sonuç FALSE olur.

         * equalsIgnorecase()//buuyk küçük harf önemli değil
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.

        String str1="hello";
        String str2="Hello";
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str2.equals(str1) = " + str2.equals(str1));
        System.out.println("str1.equalsIgnoreCase(str2) = " + str1.equalsIgnoreCase(str2));
        str2="hello";
        System.out.println("str1.equals(str2) = " + str1.equals(str2));*/
       String s1="clarusway";//->string pool-gömlek cebinden cıkan para
        String s2="clarusway";//str pool-göm ceb cıkan para
        String s3=new String("clarusway");//st data type obj non primitive heap memory(cüzdan)
        String s4=new String("clarusway");//
        System.out.println("s1==s2");//true s1-s2 aynı st pooldan referans degeri aynı
        System.out.println("s1.equals(s2) = " + s1.equals(s2));//
        System.out.println("s3==s4 = " + s3 == s4);
        System.out.println("s3.equals(s4) = " + s3.equals(s4));
        String sA="Kadir";
        String sB="";
        sB=sA+"";
        System.out.println("sB = " + sB);
        System.out.println("sA = " + sA);
        System.out.println("sA==sB =");//herseyine baktı sa da bir de hiçlik var o nedenle false cıktı
        System.out.println(sA.equals(sB));//equals da son degerine bakılır

// equals() methodu sadece String'lerin degerlerini karsilastirir
// bu ornekte sA ile sB nin degerleri AYNI oldugu icin true dondurur
        /*
String s1 = "text"; kullanımı, eğer varsa, string sabit havuzunda (string constant pool) bir örneği yeniden kullanır.
Yoksa havuz içerisinde yeniden alan oluşturur. Bu durum Java'ya özgü Java Sanal Makinesi (JVM) tarafından gerçekleştirilen bir durumdur.

s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir. s3 ve s4 ise farklı nesneleri ifade eder.
s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır ve  String constant pool üzerinde aynı adresi gösterirler.
Böylece ekrana TRUE yazdırır.
s1.equals(s2) ifadesi ise, nesneler içerisindeki değerleri (clarusway) karşılaştırdığı için ekrana TRUE yazdırır.
Bildiğimiz gibi == operatörü hafızadaki adresleri karşılaştırır, s3 ve s4 birbirinden farklı nesneler oldukları
için farklı adreslerde tutulurlar.  Bu yüzden s3 == s4 ifadesi ekrana FALSE yazdırır.
s3.equals(s4) ifadesi ise, nesneler içerisindeki değerleri (clarusway) karşılaştırdığı için ekrana TRUE yazdırır.
        */






    }
}
