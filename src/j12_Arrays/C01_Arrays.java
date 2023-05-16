package j12_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
   /*
Array (Dizi): Java'da birden fazla aynı type variable depolamak (store etmek) icin kullanilan bir objedir.
Array tanımlamak için:
1- data type (Bir array'in icerisinde sadece ayni data tipinden variable omalıdır.)
2- length (length array'e depolanacak  max eleman sayisini belirtir ve length'den  fazla eleman  koyulursa RTE verir)

 Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */
        //Array declaration
        int a;//declare edilen ancak assaignment (atama)   yapılmayan primitive variable
        int arr[];//  declare edilen ancak assaignment (atama) yapılmayan int type array
        //ataması yapılmayan bir array herhangi bir action alınamaz CTRE verir
        String isimArr[] = {"Yusuf", "Murat", "Ceren", "*Vedat", "**Suzan", "Abdi"};//declare ve assaignment edilmiş
        int sayiArr[] = new int[5];//declare edilmiş length 5 girilmiş int yype array
//Arraya eleman update -ekleme-etme
        sayiArr[1] = 25;
        sayiArr[0] = 46;
        sayiArr[2] = 31;//2. indexe 31 value atandı
        sayiArr[1] = 2;//array elemanları unique olmak zorunda değil,tekrarlı eleman barındırabilir
        sayiArr[3] = 2;
        sayiArr[4] = 46;
        //Array eleman sayısı->length boyut
        System.out.println("sayiArr.length = " + sayiArr.length);//5
        System.out.println("isimArr.length = " + isimArr.length);//6
        int kacİsim = isimArr.length;
        System.out.println("kacİsim = " + kacİsim);
        System.out.println("isimArr[son eleman] = " + isimArr[isimArr.length - 1]);
        isimArr[isimArr.length - 1] = "son eleman bükücü Abdi";
        //Array eleman kontrol...->Array doğrudan sout komutu ile print edilirse ref.değeri verir
        //Array Arrays.toString ile sout edilir
        System.out.println("isimArr = " + isimArr);//array non primitive data olduğu için referans değer print eder
        System.out.println(Arrays.toString(isimArr));
        for (int i1 = 0; i1 < isimArr.length; i1++) {//bad practice
            System.out.println(isimArr[i1] + " ");

            //Task->sayıArr cift index elemanları print eden code print ediniz
            System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));
            for (int i = 0; i < sayiArr.length; i++) {
                if (i % 2 == 0) {
                    System.out.println(sayiArr[i]);

                }

            }
        }
        System.out.println();//dummy
//Task-> isimarrar de 5karakterden fazla olan elemanları prınt eden code create ediniz
        for (int i = 0; i < isimArr.length; i++) {//array index ile tekrarlama yapar
            if (isimArr[i].length() > 5) {
                System.out.println(isimArr[i] + " ");
            }
        }

//task: isimArr de 6 karakterden az olan elemanı saklayan arrayı print eden code create ediniz
        int yeniArrayBoyut = 0;
        String yeniArr[] = new String[yeniArrayBoyut];
        for (int i = 0; i < isimArr.length; i++) {//array index ile tekrarlama yapar
            if (isimArr[i].length() < 6) {
                yeniArrayBoyut++;
            }
          for (int j=0;j<yeniArr.length;j++){
              if (isimArr[i].length()<6){
                  yeniArr[j]=isimArr[i];
                  j++;
              }
          }
            System.out.println(yeniArrayBoyut);
            System.out.println(Arrays.toString(yeniArr));
//array eleman sıralama natural,alfabetik
            System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));
            Arrays.sort(isimArr);
            System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));
        }

        }


    }
