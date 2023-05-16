package J99_Lambda.Tutorial;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class C11_textRead {
    public static void main(String[] args) throws IOException {
//TASK 01 --> Edaaa dosyasini okuyunuz.(Console'a print eden code create ediniz.
        System.out.println("\nTASK 01 --> Edaaa dosyasini okuyunuz.");
        Path dosya=Path.of("/Users/harikaedaozdemir/IdeaProjects/JavaStudy/src/J99_Lambda/Tutorial/Edaaa");
        //erişilecek dosya yolu tanımlandı
        Stream<String>dosyaAkışı= Files.lines(dosya);
       // Files.lines("/Users/harikaedaozdemir/IdeaProjects/JavaStudy/src/J99_Lambda/Tutorial/Edaaa").forEach();
dosyaAkışı.forEach(System.out::println);

        //TASK 02 --> Edaaa.txt dosyasini map okuyunuz.(Console'a buyuk harflerle print eden code create ediniz.
        System.out.println("\nTASK 02 --> Edaaa dosyasini okuyunuz.");

        Files.lines(dosya).map(s -> s.toUpperCase())//akıştaki elemanlar buyuk harfe update edildi
                .forEach(System.out::println);

        //TASK 03 --> Edaaa dosyasindaki ilk satiri kucuk harflerle print eden code create ediniz.
        System.out.println("\nTASK 03 --> Edaaa dosyasini okuyunuz.");
        Files.lines(dosya).map(s -> s.toLowerCase())//akıştaki elemanlar kucuk harfe update edildi
                .limit(1).forEach(System.out::println);

//TASK 04 --> Edaaa dosyasinda "basari" kelimesinin kac satirda gectiginiz print eden code create ediniz.
        System.out.println("\nTASK 04 --> Edaaa dosyasini okuyunuz.");
        System.out.println(Files.lines(dosya).filter(t -> t.contains("Basari"))//akıştaki elemanlar kucuk harfe update edildi
                .count());//burada satır saydırıyoruz basari kelime sayısı değil

    }
}
