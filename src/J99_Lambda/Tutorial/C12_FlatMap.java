package J99_Lambda.Tutorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class C12_FlatMap {
/*
   Stream.flatMap, adıyla tahmin edilebileceği gibi, bir map ve flat işleminin birleşimidir. Bu, ilk önce elemanlarınıza bir
   fonksiyon uyguladığınız ve daha sonra düzleştirdiğiniz anlamına gelir.
   Stream.map yalnızca akışı düzleştirmeden bir işlevi uygular.

   Bir akışın düzleştirme'in neyi içerdiğini anlamak için, "iki seviye" olan [ [1,2,3],[4,5,6],[7,8,9] ] gibi bir yapı düşünün.
   Bunun düzleştirilmesi, "bir seviye" yapısında dönüştürülmesi anlamına gelir: [ 1,2,3,4,5,6,7,8,9 ].
   flatMap yöntemi, bir akışın her bir değerini başka bir akışla değiştirmenizi sağlar
   ve ardından oluşturulan tüm akışları tek bir akışa birleştirir.

 */
public static void main(String[] args) throws IOException {
    Path dosya = Path.of("/Users/harikaedaozdemir/IdeaProjects/JavaStudy/src/J99_Lambda/Tutorial/Edaaa");
    //erişilecek dosya yolu tanımlandı
    Stream<String> dosyaAkışı = Files.lines(dosya);
    // Files.lines("/Users/harikaedaozdemir/IdeaProjects/JavaStudy/src/J99_Lambda/Tutorial/Edaaa").forEach();
    dosyaAkışı.forEach(System.out::println);
//TASK 05 -> Edaaa dosyasindaki farkli kelimeleri  print ediniz..
    System.out.println("\nTASK 05 --> Edaaa dosyasindaki farkli kelimeleri  print ediniz..");
Files.lines(dosya)
        .map(t->t.split(" "))
        .flatMap(Arrays::stream)
        .distinct()
        .forEach(System.out::println);


    System.out.println("\nTASK 06 --> Edaaa dosyasindaki tum kelimeleri natural order  print ediniz..");
//TASK 06 -> Edaaa dosyasindaki tum kelimeleri natural order  print ediniz..

//TASK 07 -> Edaaa dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.


    System.out.println("\nTASK 07 --> Edaaa dosyasinda \"basari\" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz..");
//TASK 08 -> Edaaa dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
    System.out.println("\nTASK 08 --> Edaaa dosyasinda");

//TASK 09 -> Edaaa dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
    System.out.println("\nTASK 09 --> Edaaa dosyasinda icinde \"a\" harfi gecen kelimeleri print ediniz.");
//TASK 10 -> Edaaa dosyasinda kac /farklı harf kullanildigini print ediniz.
    System.out.println("\nTASK 10 --> Edaaa dosyasinda kac /farklı harf kullanildigini print ediniz.");
//TASK 10 -> Edaaa dosyasinda kac /farklı harf kullanildigini print ediniz.
    System.out.println("\nTASK 10 --> Edaaa dosyasinda kac /farklı harf kullanildigini print ediniz.");
//TASK 11 -> Edaaa dosyasinda kac farkli kelime kullanildigini print ediniz.
    System.out.println("\nTASK 11 --> Edaaa dosyasinda kac farkli kelime kullanildigini print ediniz.");
//TASK 12 -> Edaaa dosyasinda  farkli kelimeleri print ediniz
    System.out.println("\nTASK 12 --> Edaaa dosyasinda  farkli kelimeleri print ediniz.");













}
}
