package OdevSwitchCase;

public class Task6 {
    public static void main(String[] args) {

        //Task-> Girilen  VIP (Very Important Person) kisaltmasindaki harflerin anlamini print eden code create ediniz
        System.out.println("Very Important person");
        String str="VIP";
        char ch=str.charAt(0);
        switch (ch){
            case 'V':
                System.out.println("**V**"+"Very");
            case 'I':
                System.out.println("**I**"+"Important");
            case 'P':
                System.out.println("**P**"+"Person");
                break;
            default:
                System.out.println("hatalı bir giriş yaptınız");
        }
        System.out.println("Thank You!!!  :))  ");





    }
}
