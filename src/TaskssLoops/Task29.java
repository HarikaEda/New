package TaskssLoops;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
// task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
        // ornek : Java  output: JaVa

        Scanner Input = new Scanner(System.in);
        for(String Text = Input.nextLine();
            !Text.isBlank();
            Text = Text.replaceFirst("\\w"," "))
            System.out.println();
    }





}
