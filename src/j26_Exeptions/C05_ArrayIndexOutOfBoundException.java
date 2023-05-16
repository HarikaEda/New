package j26_Exeptions;

public class C05_ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
     // ArrayIndexOutOfBoundException: arraylerde olmayan index elemanı ile işlem yapıldığında oluşan RTE
     int sayi[]={33,58,31,44,2,63,21};
        System.out.println(sayi[5]);//63
        //System.out.println(sayi[12]);
try {
    System.out.println("sayi[12]="+sayi[12]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("olmayan eleman istendi");

}
        System.out.println("app gayet başarılı..");
    }
}
