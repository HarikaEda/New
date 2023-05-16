package j26_Exeptions;

import java.util.Scanner;

public class C01_AritmetikExeption {
    public static void main(String[] args) {
        // AritmetikExeption: mat işlemlerde oluşan Run time exeption type'dır
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int sayi1 = input.nextInt();
        System.out.println("2. sayıyı giriniz");
        int sayi2 = input.nextInt();
        //int bolum=sayi1/sayi2;//aritmetik exeption
        //System.out.println("bölme işlemi sonucu = " +bolum);
        try {//dene->hatanın olma ihtimali olduğu block->istisnai durum
            int bolum = sayi1 / sayi2;
            System.out.println("bölme işlemi sonucu = " + bolum);
            System.out.println("try block'dan selam");
        } catch (ArithmeticException e) { //hz Adem
            System.out.println("sıfır böler mi hiç" + e.getMessage());
            System.out.println("catch 1. block'dan selaaaammm");

        }catch (ArrayIndexOutOfBoundsException ebikgabık){
            System.out.println("catch 2. block'dan selaaaammm");

       // }catch (Exception falanFila e){//parent  Hz Adem bütün exeptionları kapsar

            System.out.println("Hz Adem'den selam");
        }

        finally {//sonunda bunu yap block->catch blocklardan sonra mutlaka çalışması istenen aksiyon için tanımlanır
/*
try - catch içinde yapılan işlemlerden sonra mutlaka çalışması gereken block varsa finally  blok tanımlanır.
hata alınır ama finaly tanımlanırsa catch çalışmasa bile
pr akışı devam eder.finally block hata olsa da olmasa da calışır.
Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
 */

            System.out.println("finally blockdan selaaammm");


        }
        System.out.println("bu mesajı okuduysan app çalıştı");

    }


}