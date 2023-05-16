package J99_Lambda.Tutorial.LambdaCodeChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class C01_IntList_StreamOrnekleri {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        // S1:listi aralarinda bosluk birakarak yazdiriniz
        System.out.println("\ntask01");
        list.stream().forEach(System.out::println);
        // S2: sadece negatif olanlari yazdir
        System.out.println("\ntask02");
        System.out.println(list.stream().filter(x -> x < 0).collect(Collectors.toList()));
        // S3: pozitif olanlardan yeni bir liste olustur
        System.out.println("\ntask03");
        System.out.println(list.stream().filter(x -> x > 0).collect(Collectors.toList()));
        // S4: list in elemanlarin karelerinden yeni bir list olusturalim
        System.out.println("\ntask04");
        System.out.println(list.stream().map(x -> x * x).collect(Collectors.toList()));
        // S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
        System.out.println("\ntask05");
        System.out.println(list.stream().map(x -> x * x).distinct().collect(Collectors.toList()));
        // S6: listin elemanlarini kucukten buyuge siralayalim
        System.out.println("\ntask06");
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        // S7: listin elemanlarini buyukten kucuge siralayalim
        System.out.println("\ntask07");
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        // S8: listin elemanlarini pozitif olanlardan yeni bir list olusturalim
        System.out.println("\ntask08");
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).filter(x -> x > 0).collect(Collectors.toList()));
        // S9: listin elemanlarini pozitif olanlardan yeni bir list olusturalim
        System.out.println("\ntask09");
        System.out.println(list.stream().filter(t -> t > 0).sorted().collect(Collectors.toList()));
        // S10: listin elemanlarini toplamini bulalim
        System.out.println("\ntask10");
        System.out.println(list.stream().filter(t -> t > 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
        System.out.println("\ntask11");
        System.out.println(list.stream().filter(t -> t > 0).map(x -> x * x * x).filter(x -> x % 10 == 5).collect(Collectors.toList()));

        // S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
        System.out.println("\ntask12");
        System.out.println(list.stream().filter(t -> t > 0).map(x -> x * x * x).filter(x -> x % 10 == 5).sorted().collect(Collectors.toList()));

        // S10: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
        System.out.println("\ntask13");
        System.out.println(list.stream().filter(t -> t > 0).map(x -> x * x).filter(x -> x % 10 != 5).collect(Collectors.toList()));

        // S10 :list elemanlarini toplamini bulalim
        System.out.println("\ntask14");
        System.out.println("toplam = "+list.stream().reduce((x, y) -> x + y));
        // S6: listin elemanlarini kucukten buyuge siralayalim
        System.out.println("\ntask15");
        list.stream().sorted().forEach(System.out::println);
        // S7: listin elemanlarini buyukten kucuge siralayalim
        System.out.println("\ntask16");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
        System.out.println("\ntask17");
        System.out.println(list.stream().filter(t -> t > 0).map(t -> t * t * t).filter(t -> t % 10 == 5).collect(Collectors.toList()));

        // S7: listin elemanlarini buyukten kucuge siralayalim
        System.out.println("\ntask18");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
        System.out.println("\ntask19");
        System.out.println(list.stream().filter(t -> t > 0).map(t -> t * t).filter(t -> t % 10 == 5).collect(Collectors.toList()));
        // S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
        System.out.println("\ntask20");
        System.out.println(list.stream().filter(t -> t > 0).map(t -> t * t).filter(t -> t % 10 != 5).collect(Collectors.toList()));
        // S10 :list elemanlarini toplamini bulalim
        System.out.println("\ntask21");
        System.out.println(list.stream().reduce((x, y) -> x + y));
        // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim
        System.out.println("\ntask22");
        System.out.println(list.stream().filter(t -> t < 0).peek(t -> System.out.println("negatifler: " + t)).map(t -> t * t)
                .peek(t -> System.out.println("kareler: " + t)).collect(Collectors.toList()));
        // S12 : listeden 5 den buyuk  sayi var mi? -anyMatch
        System.out.println("\ntask23");
        System.out.println(list.stream().anyMatch(t -> t > 5));
        // S13 : listenin tum elemanlari sifirdan kucuk mu? -allMatch
        System.out.println("\ntask24");
        System.out.println(list.stream().allMatch(t -> t < 0));
        // S14: listenin 100 e esit elemani yok mu? -noneMatch
        System.out.println("\ntask25");
        System.out.println(list.stream().noneMatch(t -> t <100));
        // S15: listenin sifira esit elemani yok mu? - noneMatch
        System.out.println("\ntask26");
        System.out.println(list.stream().noneMatch(t -> t < 0));
        // S16:  listenin ilk 5 elemanini topla? - limit(5)
        System.out.println("\ntask27");
        System.out.println(list.stream().limit(5).reduce((x, y) -> x + y));
        // S17:  listenin ilk 5 elemanini topla? - limit(5)
        System.out.println("\ntask28");
        System.out.println(list.stream().limit(5).reduce((x, y) -> x + y));
       
    /*
     peek () 'in Javadoc sayfası şöyle diyor: " Bu yöntem, temelde, öğeleri bir
    ardışık düzen içinde belirli bir noktadan geçerken görmek istediğiniz
    yerde hata ayıklamayı desteklemek için vardır . Ara islemdir.. yapilam islemi gormek icin kullanilir

     */
        // S12 : listeden 5 den buyuk  sayi var mi? -anyMatch

        // S13 : listenin tum elemanlari sifirdan kucuk mu? -allMatch

        // S14: listenin 100 e esit elemani yok mu ? -noneMatch

        // S15: listenin sifira esit elemani yok mu? - noneMatch

        // S16:  listenin ilk 5 elemanini topla? - limit(5)

        // S17: listenin son bes elemaninin  listele -skip long



    }


}



