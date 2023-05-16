package Ellys_TasksLesson04;

public class Q02_WhileDoWhile {
    public static void main(String[] args) {
// girilen sayının basamaklarındaki rakamların toplamını bulunuz.
     int sayi=-2562;
        System.out.println(basamakToplamı(sayi));

    }
    public static int  basamakToplamı(int sayi) {
int toplam=0;
while (sayi!=0){
toplam+=sayi%10;
sayi/=10;}

        return toplam;

    }
}
