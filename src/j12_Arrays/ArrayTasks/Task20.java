package j12_Arrays.ArrayTasks;

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {//arrayboth ends
  /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.
    Oluşturacağınız int array'i =   ([1, 2, 3, 4])
    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        //Kodu aşağıya yazınız..
int x[]={1,2,3,4,};
int []y={x[0],x[x.length-1]};

        System.out.println(Arrays.toString(y));

    }
}
