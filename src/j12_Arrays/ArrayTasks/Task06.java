package j12_Arrays.ArrayTasks;

public class Task06 {
    public static void main(String[] args) {//array contains
/*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */
        //Kodu aşağıya yazınız..
String  arr[]={"Apple","Orange","Banana","Pineaapple"};
for (int i=0;i< arr.length;i++){
    if (arr[i].contains("Apple")){
        System.out.println(arr[i].contains("Apple"));
        break;
    }
}

    }
}
