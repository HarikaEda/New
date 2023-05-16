package j24_Encapsulation.Tasks;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("adınızı giriniz");
        String ad= input.nextLine();
        System.out.println("yaşınızı giriniz");
        int yaş= input.nextInt();
        Student ogrenc1=new Student(ad,yaş);
        System.out.println("ogrenc1 name is : " + ogrenc1.getName()+" \n he-she "+ogrenc1.getAge()+" years old . ");



    }
}
