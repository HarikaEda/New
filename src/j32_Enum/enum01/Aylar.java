package j32_Enum.enum01;

public enum Aylar {//fields genellikle alt alta yazılır...
    OCAK,
    ŞUBAT,
    MART,
    NİSAN,
    MAYIS,
    HAZIRAN,
    TEMMUZ,
    AĞUSTOS,
    EYLUL,
    EKİM,
    KASIM,
    ARALIK;
//main method açabiliriz..Ancak tavsiye edilmez runnera bağlamak gerekir
    public static void main(String[] args) {
        System.out.println("enumdan selamlar");//bad practice,ama enum clasda main açılabilir

    }


}
