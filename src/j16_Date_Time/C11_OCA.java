package j16_Date_Time;

import java.time.LocalDate;
import java.time.Month;

public class C11_OCA {
    public static void main(String[] args) {
/*
 What is the output of the following code?
Asagidaki code'un  ciktisi  nedir?
*/
      LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        //LocalDate = LocalDate.of(2018,Month.FEBRUARY, 29);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
/*
            A. 2018 APRIL 29
            B. 2018 APRIL 30
            C. 2018 MAY 10
            D. Another date.
            E. The code does not compile.
            F. A runtime exception is thrown.
            */

//cevap RTE yani F





    }
}
