package j27_Abstract.PizzaSiparişi;

import java.util.Scanner;

public class PizzaIslemler {
    static Scanner input=new Scanner(System.in);
    static DairePizza dairePizza;
    static DikdortgenPizza dikdortgenPizza;
    static Pizza pizza;


    public void ebikGabık(){
        System.out.println(new MusteriSelamlama() +"Hoşgeldiniz\nPizzanızın şekli nasıl olsun ? ");
switch (secim()){
    case 1:
        System.out.println("pizzanızın boyutunu giriniz");
        if (input.next().equalsIgnoreCase("s")){
            System.out.println("small boy pizza seçtiniz");
        dairePizza=new DairePizza(dairePizza.getYaricap(8));}
        else if (input.next().equalsIgnoreCase("m")){
            System.out.println("medium boy pizza seçtiniz");
        dairePizza=new DairePizza(dairePizza.getYaricap(10));}
        else if (input.next().equalsIgnoreCase("l")){
            System.out.println("large boy pizza seçtiniz");
        dairePizza=new DairePizza(dairePizza.getYaricap(12));}else
            System.out.println("hatalı seçim yaptınız tekrer deneyiniz");

     pizza=new Pizza(dairePizza.pizzaAlanHesapla()*1.5,dairePizza);


        break;
    case 2:
        System.out.println("pizzanızın boyutunu giriniz");
        if (input.next().equalsIgnoreCase("s")){
            System.out.println("small boy pizza seçtiniz");
            dikdortgenPizza=new DikdortgenPizza();}
        else if (input.next().equalsIgnoreCase("m")){
            System.out.println("medium boy pizza seçtiniz");
            dairePizza=new DairePizza(dairePizza.getYaricap(10));}
        else if (input.next().equalsIgnoreCase("l")){
            System.out.println("large boy pizza seçtiniz");
            dairePizza=new DairePizza(dairePizza.getYaricap(12));}else
            System.out.println("hatalı seçim yaptınız tekrer deneyiniz");

        pizza=new Pizza(dairePizza.pizzaAlanHesapla()*1.5,dairePizza);

        System.out.println("");
        break;
    default:
        break;
}
    }
    public static int secim(){
        int secim;
        System.out.println("pizza şekli içn daire ise 1'i\n dikdörtgen için 2'yi seçiniz");
       return secim=input.nextInt();
    }

}
