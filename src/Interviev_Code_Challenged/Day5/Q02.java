package Interviev_Code_Challenged.Day5;

import java.util.ArrayList;

public class Q02 {
    public static void main(String[] args) {
        // Create 2D ArrayList which can store String ArrayLists
        // Create 3 ArrayLists which are Employees, Employers, Companies
        // Store this 3 ArrayList in 2D ArrayList

        // String ArrayList'leri depolayabilen 2D ArrayList oluşturun
        // Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
        // Bu 3 ArrayList'i 2D ArrayList'te saklayın
        ArrayList<ArrayList<String>>arrayList1 = new ArrayList<>();
        ArrayList<String>calisanlar = new ArrayList<>();
        calisanlar.add("Harika");
        calisanlar.add("Eda");
        calisanlar.add("İbrahim");
        calisanlar.add("Mehmet");
        calisanlar.add("Mustafa");

        ArrayList<String>Isverenler = new ArrayList<>();
        Isverenler.add("Haluk");
        Isverenler.add("İbrahim");
        Isverenler.add("Elly");

        ArrayList<String>Sirketler = new ArrayList<>();
        Sirketler.add("Apple");
        Sirketler.add("Banana");
        Sirketler.add("Cherry");
        Sirketler.add("Grapes");

        arrayList1.add(calisanlar);
        arrayList1.add(Isverenler);
        arrayList1.add(Sirketler);
        System.out.println("arrayList1 = " + arrayList1);
        System.out.println("arrayList1.size() = " + arrayList1.size());
for (int i = 0; i < arrayList1.size(); i++) {
    System.out.println("arrayList1.get(i).size() = " + arrayList1.get(i).size());
}

    }
}
