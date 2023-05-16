package j18_ImmutableClass;

import java.util.ArrayList;

public class C02_ImmutableClass {
    public static void main(String[] args) {
/*
        Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
        BigDecimal, BigInteger java'da immutable->değişmez sınıflara örnek olarak gösterilebilir.
          StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
       */
String name="Eda";
        System.out.println("   ***Immutable class***   ");
        System.out.println("method öncesi name : "+name);//eda
        name.concat("QA team lead");
        System.out.println("method call sonrası"+name);//ımmutable class old için variable aynı değildir.
        System.out.println("   ***mutable***   ");
        ArrayList<String>isimList=new ArrayList<>();//boş string type list
        System.out.println("call öncesi isimList = " + isimList);//[]
     isimList.add("Abdi");
     isimList.add("Tuğba");
     isimList.add("Ceren");
        System.out.println("method call sonrası isimList = " + isimList);//[abdi,tuğba,ceren]


    }
}
