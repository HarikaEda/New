package j11_Debugging;

public class j11_Debugging {
    public static void main(String[] args) {
   /*
Debug yapiyorsan, kodu anlamadin demektir.
Debug yaparken kodu anlamiyorsan, nasil debug yapilir, onu anlamadin demektir.
Debug yaparken kodu anladigini dusunuyorsan, aslinda debuga ihtiyacin olmadigini anladin demektir.
Debug etmek kodun mental bir modelinin eksikligine isarettir...


İki durumda debugger gerekli olabilir:
*  Mevcut kod devralındığında.
*  Yeni kod yazıldığında.
her iki durumda da debugger çalıştırmamaya dikkat edilmeli.
Amac sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.
*/
method01();

    }//main sonu

    private static void method01() {
        System.out.println("   **** method01 çalışıyor****    ");//method entry
        for (int i=0;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println();//dummy
        System.out.println("   ***method 2 call ediliyor***   ");
        method02();
        System.out.println("   ***method3 call ediliyor***   ");
        method03();

        System.out.println("    ***method bitti***    ");//method exit

    }

    private static void method03() {
        System.out.println("   **** method03 çalışıyor****    ");//method entry
        for (int y=0;y<=5;y++){
            System.out.print(y+" ");
        }
        System.out.println();//dummy

    }

    private static void method02() {
        System.out.println("   **** method02 çalışıyor****    ");//method entry
        for (int x=0;x<=7;x++) {
            System.out.print(x + " ");
        }
        System.out.println();//dummy
    }
}
