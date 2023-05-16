package j12_Arrays.ArrayTasks;

public class Task07 {
    public static void main(String[] args) {//array max value
 /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here

int arr[]=new int[]{12,2,5,15,8};
int max=arr[2];

        for (int i = 0;i<arr.length;i++){
          //if (arr[i]>max){max=arr[i];}
            max=Math.max(max,arr[i]);
      }
        System.out.println("max = " + max);
    }
}
