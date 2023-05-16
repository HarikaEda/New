package Loop01_FoorLoop;

public class C03_NestedLoop {
    public static void main(String[] args) {
     /* bir loop body'de {loop} farklı bir loop tanımlanmasıyla oluşan code blok'a nested loop denir
     * iç loop dış loop'un her step'inde tekrar çalışır.En içteki döngü bitmeden dışdöngü bitmez.ilk önce en iç loop run olur */
       /* for (int apt=1;apt<=10;apt++){for (int dr=1;dr<6;dr++){
            System.out.println("apt:"+apt+"için daire:"+dr);*/

        for (int i=1;i<10;i++){for (int j=1;j<i;j++){
            System.out.print("*");}
            System.out.print("#");}






        }}














