package j15_Varargs;

public class C01_Varags {
    public static void main(String[] args) {
/*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....

        }

           1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
          2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli

  */
//diva tek olur,sonda olur
  int say1=46;
  int say2=27;
  int say3=58;
  int say4=34;
  //task1:verilen 2 int value toplayan method
    toplam1(say1+say2);
    toplam2(say3+say2);
   toplam3(say3+say4);
//task2:verilen 3 int value toplayan method create ediniz

//task3://Task03-> verilen String value'lerin en cok karaktere sahip olanı print METHOD create ediniz..
//System.out.println("   ***   Task03  ***   ");
  enyuzunString("javacan","javatar","sefil");
  enyuzunString("javaslan","javatarih","perfect");
  enyuzunString("Aydın","qa tester eda");

    }//main sonu

  private static void enyuzunString(String ...str) {
      String uzuuunnString="";
    for (String w:str) {if (w.length()>uzuuunnString.length()){



    }

    }





  }

  private static void toplam3(int i) {


  }

  private static void toplam2(int i) {
  }

  private static void toplam1(int say1 ) {
    System.out.println("toplam = " + say1);
  }


}
