package j19_StringBuilder;

public class Task03 {
    public static void main(String[] args) {

        String numbers = "012345678";
        System.out.println(numbers.substring(1,3));         // 12
        System.out.println(numbers.substring(7,7));         // null
        System.out.println(numbers.substring(7));           // 78



    }
}
