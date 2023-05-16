package Interviev_Code_Challenged.Day5;

import java.util.*;

public class Q04 {
    public static void main(String[] args) {
       // PART 1
        // create a map with groupName as key and groupMembers as value
        // "Group1" = ["Member1", "Member2"]
        // "Group2" = ["Member3", "Member4", "Member5"]


        // BÖLÜM 1
        // anahtar olarak groupName ve değer olarak groupMembers ile bir map oluşturun
        // "Grup1" = ["Üye1", "Üye2"]
        // "Grup2" = ["Üye3", "Üye4", "Üye5"]

        // PART 2
        // find how many members each group has

        // BÖLÜM 2
        // her grubun kaç üyesi olduğunu bul

        HashMap<String, ArrayList<String>>grupVeUyeleri = new HashMap<>();
        ArrayList<String>team1=new ArrayList<>(Arrays.asList("Gamze","Merve","Nil","Karim","Mustafa"));
        ArrayList<String>team2=new ArrayList<>(Arrays.asList("Haluk","İbrahim","Mehmet"));
        grupVeUyeleri.put("Grup1",team1);
        grupVeUyeleri.put("Grup2",team2);
        System.out.println("grupVeUyeleri = " + grupVeUyeleri);
        Collection<ArrayList<String>>values = grupVeUyeleri.values();
        for (ArrayList<String> each : values) {
            System.out.println("each = " + each);
            System.out.println("each.size() = " + each.size());
        }

        {
            
        }



    }
}
