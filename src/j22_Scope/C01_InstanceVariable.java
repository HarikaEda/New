package j22_Scope;

public class C01_InstanceVariable { /*                                     INSTANCE VARIABLE

   1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
      olusturulan variable'lara "instance variable" denir.
   2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
   3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
      Asagida goruldugu gibi "yas" variable'ina deger atamasi yapıldı ama "tecrube" variable'ina yapılmadı
      Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
         "yas" variable'i initialize edildi, digerleri initialize edilmedi.
   4) Initialize edilmeyen "instance variable" lar icin Java "default value" atamasi yapar.
            byte, short, int, long icin default value 0'dir.
            float, double --> default value 0.0'dir.
            char --> default value 0'dir.
            boolean --> default value false'dur.
            String --> default value "null" dir.
            //non statictir,class leveldadır.

*/ //fields..->instance variable
    int yas=48;//default değeri 0
    int tecrübe;//d.d 0
    String name;//def d.null
boolean developerMi;//def d.false
double boy;//def d.0.0
char unvan;//def d.''dir
static  String kurs="clarusway";
static  String language;
    public static void main(String[] args) {//main level
//static int a=17;//local variablede static bloc olamaz,tanımlanamaz...
        int a=17;//initial edilmiş local variable
        System.out.println("a = " + a);
        int b;//initial edilmemiş variable
       // System.out.println("b = " + b);action almaz
       // System.out.println("yas = " + yas);initial edilmemiş instance variable localde action almaz
        System.out.println("static variable kurs doğrudan call edildi= " + kurs);//initial edilmiş static variable dogrudan call edildi
        System.out.println("static variable language doğrudan call edildi== " + language);//initial edilmemiş static variable static bloca dogrudan call edilebilir
b=63;//value ataması yapıldı
        System.out.println("b = " + b);//value ataması yapılan variable action alır..
static_method();//doğrudan call edilebilir..
      //  non_static_method()    doğrudal call edilemez
        C01_InstanceVariable obj=new C01_InstanceVariable();//obj create edildi
        obj.non_static_method();//non_static_method()ancak obje ile call edilebilir çünkü static değildir

        System.out.println("obj.developerMi = " + obj.developerMi);//nnon_static inst. variable static bloca call edilemez
        // ancak obje ile call edilebilir.


    }//main sonu
    public void non_static_method(){//sefil dünyalı..
        System.out.println(" non_static_methoddan selaaammm");
    }
    public static  void  static_method(){//galaksi
        System.out.println("static methoddan selaaammm");
    }





}
