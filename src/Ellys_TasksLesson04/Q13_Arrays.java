package Ellys_TasksLesson04;

public class Q13_Arrays {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4
         * Output2 : 5,6,7
         */
        int arr[]={1,2,3,4,5,6,7};
        int toplam=0;
        toplam=1+2+3+4+5+6+7;
        System.out.println("toplam = " + toplam);
        int ortalama=toplam/7;
        System.out.println("ortalama = " + ortalama);
        int sayac=0;
        for (int sayi:arr)
        if (sayi>ortalama)
       {
            sayac++;
        }

        System.out.println("sayac = " + sayac);

    }
}
