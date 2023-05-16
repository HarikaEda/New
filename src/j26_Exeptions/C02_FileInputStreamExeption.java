package j26_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamExeption {
/*
1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmaz.catch block try block exception yakalarsa calışır
2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanımlanabilir.
   aynıa anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
3- parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE

 */
public static void main(String[] args) throws IOException {
//meth signiture level exception java zorunlu ekledi
    //public static void main(String[] args) throws FileNotFoundException {
    //FileInputStream fis=new FileInputStream("/Users/haluk.../IdeaProjects/javaLearn/src/j26_Exceptions/ebikGabık");
    FileInputStream fis= null;
    try {
        fis = new FileInputStream("/Users/harikaedaozdemir/IdeaProjects/javaLearn/src/j26_Exeptions/task");
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
//fis path(yolu) verilen file erişim sağlaya obj.
//FileNotFoundException ->ulaşılması gereken file path(adres yol) yanlışşsa istisnası
    int k;
    while ((k=fis.read())!=-1){//fis.read() meth ile ulaşılan file'daki ascii değerlerin -1 olmama sartı(ascii=-1 olmayan karakter verir)
        System.out.print((char) k);
    }
    System.out.println("AGAM bu printi okuduysan app. gayet başarılı dewamkeee");
}//main sonu



}






