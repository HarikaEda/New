package j19_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
//StringBuilder create etme
        //1.yol
        StringBuilder sb1=new StringBuilder();

        System.out.println("sb1.length() = " + sb1.length());//0
        System.out.println("sb1.capacity() = " + sb1.capacity());//16
        sb1.append("Murat ");//murat value eklendi
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//16
        System.out.println("sb1.length() = " + sb1.length());//5
sb1.append("Eda zengin ol inşallah ").append(1453).append(true);
        System.out.println("sb1 = " + sb1);//MuratEda zengin al inşallah1453true
        System.out.println("sb1.capacity() = " + sb1.capacity());//70 oldu,capacity aşiminda yeni capacity=eskicapacity*2+2
        //2.yol
        StringBuilder sb2=new StringBuilder("Eda'ya hızlıca bir offer");//initial ilk değer atandı
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());//39
        System.out.println("sb2.length() = " + sb2.length());//23
        /*
        initial edilen sb capacity=16+ ilk değer lenhth olarak */
//trimTosize-capacity de lenth fazlası character siler
        sb2.trimToSize();
        System.out.println("sb2.trimTosize sonrası = " + sb2.capacity());//23
        //3.yol

        StringBuilder sb3=new StringBuilder(17);//initial edilmemiş ama capacity değeri atanmiş

        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.capacity() = " + sb3.capacity());
        System.out.println("sb3.length() = " + sb3.length());
        sb3.append("Edaya senior offer çekk...");
        System.out.println("sb3 = " + sb3);//
        System.out.println("sb3.capacity() = " + sb3.capacity());//36

        //Sbdeki istenen index characteri alma...;

        System.out.println("sb3.charAt(16) = " + sb3.charAt(16));
        StringBuilder sb4=new StringBuilder();
        StringBuilder sb5=new StringBuilder();
        System.out.println("sb4.equals(sb5) = " + sb4.equals(sb5));
        boolean sb4sb5EşitMi=sb4==sb5;
        System.out.println("sb4==sb5 = " + (sb4 == sb5));//false

        //StringBuilderdeki belirli aralık kararter alma:

        System.out.println("sb3.subSequence(7,27) = " + sb3.subSequence(7, 20));//7,8,9,10...20ye kadar parçalıyor

        System.out.println("sb3.substring(12) = " + sb3.substring(12));
        System.out.println("sb3.substring(7,20) = " + sb3.substring(7, 20));

//sb daki istenen aralık kararter silme:
         sb3.deleteCharAt(10);
        System.out.println("sb3.deleteCharAt(9) = " + sb3.deleteCharAt(9));
        System.out.println("9. karakter silindikten sonra sb3 = " + sb3);

//sb'daki istenen aralık index kararter silme:
        System.out.println("sb3.delete(3,7) = " + sb3.delete(3, 7));
//sb'a istenen character veya veri ekleme-girdi-

 System.out.println("sb3.insert(1,sb2,3,10) = " + sb3.insert(1, sb2, 3, 10));//sb2 nin (3-9)10 dahil değil al sb3 ün 1 ine insert et

//ekleeee
        System.out.println("sb3.insert(5,sb1) = " + sb3.insert(5, sb1));

//sb daki istenen index eleman characteri update (set)etme:
        System.out.println("sb1 set öncesi = " + sb1);
        sb1.setCharAt(13,'$'); //sb1 13. index dolar characteri ile update edildi
        System.out.println("sb1 set sonrası = " + sb1);

//sb daki istenen indexe birden çok karakter eklemek..
        System.out.println("sb1 replace öncesi = " + sb1);
        System.out.println("sb1.replace(3,13,\"abidik gubidik\") = " + sb1.replace(3, 13, "abidik gubidik"));
        System.out.println("sb1 replace sonrası = " + sb1);
//sb objesinin String variable a convert(çevirme) etme...

        StringBuilder sb7=new StringBuilder("Ismail Javatar");
        System.out.println("sb7 = " + sb7);
        System.out.println("sb7.toString().toUpperCase() = " + sb7.toString().toUpperCase());
        System.out.println("sb7 = " + sb7);

        String name="selam";//selam
        StringBuilder sb8=new StringBuilder(name);//String variable SB a atandı
        System.out.println("sb8 = " + sb8);//selam
      /*compare to:methodunu iki sb eşitliğini kontrol etmek için ilk karakterden itibaren tum characterleri karıştırır.<
      Eş,t karakterler için herhengi bir return vermezken farklı karakterler için ascıı ileri veya geri olduğunu print eder
      tüm karakterler eşitese için
      sb10.com





        */
    }
}
