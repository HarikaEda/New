package j12_Arrays.ArrayTasks;

public class Task21 {
    public static void main(String[] args) {
    /* TASK :
		ayna check sorusu: verilen Arrayın Aynı array olmasını kontrol eden code create ediniz
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
        int arr[] = {1, 2, 7, 4, 4, 3, 2, 1};
        String dizininB="";
        String dizininS="";
        for (int i=0;i<arr.length/2;i++){
            dizininB+=String.valueOf(arr[i]);

        }for (int i=arr.length-1;i>=arr.length/2;i--){

            if (dizininB.equals(dizininS)){
                System.out.println("ayna dizisidir");
            }else System.out.println("ayna dizisi değildir");
        }















    }
}
