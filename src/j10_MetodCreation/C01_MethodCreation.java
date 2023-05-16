package j10_MetodCreation;

public class C01_MethodCreation {/*
       code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
       main method'a call edip run etmek uygulamanın test edilmesi main tanance ve reusable açısından tercih edilir.
       1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
       parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

       str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                             bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                             bana rapor olarak ne getirdigini bilmem lazim (true/false)

       2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

       3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
          de oldugu gibi
          disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
          deklare edilmeli

          method call edildiğinde  Parametre olarak
          declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
   */
    public static void main(String[] args) {
        topla();
        topla1(23,58);
        System.out.println(topla1(23,58));
        System.out.println(topla1(12,34));
        System.out.println(topla1(50,38));
        System.out.println(topla1(27,63));
        System.out.println(topla1(47,53));
        System.out.println(topla1(41,39));
        topla2(45,1.5,"JavaCan");
    /*
    bir method main blok dışına create ediliri main blok'a call edilmezse method run olmaz
    best Practice-> method'lar main bloktan sonra create edilir.
     */
        System.out.println(topla3());//toplam :54


    }

    private static String topla3() {//parametresiz void method create edildi
        int a = 23;
        int b = 31;
        return "toplam: " + (a + b);


    }

    private static void topla2(int sayi,double boy,String name) {//3 tane farklı parametreli void method
        System.out.println((sayi + boy));
        System.out.println("hoşgeldiniz : "+name);

    }

    private static int topla1(int a,int b) {//iki int type parametreli int return method
        return (a + b)/2;//topla1 metodu sana verilecek iki int değeri topla ve 2 ye bölerek return et

    }

    private static void topla() {
        int a=23;
        int b=58;
        System.out.println(a+b);
        System.out.println("topla metodundan selam");
    }

}