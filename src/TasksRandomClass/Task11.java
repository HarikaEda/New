package TasksRandomClass;

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        Random rnd=new Random();
        int num= rnd.nextInt(10)-10;
        System.out.println("num = " + num);

    }
}
