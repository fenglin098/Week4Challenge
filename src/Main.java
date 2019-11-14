import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Login login = new Login ();

        System.out.println("Welcome to Montgomery College System!\nWould you like to login? (Y/N)");
        Scanner sc = new Scanner(System.in);
        String answerLogin = sc.next().toLowerCase();
        String answerRole;
        switch (answerLogin){
            case "y":
                System.out.println("Would you like to login as an (A)dmin, (F)aculty, or (S)tudent?");
                answerRole = sc.next();
                switch (answerRole){
                    case "a":
                        Admin admin = new Admin();
                        admin.welcomeMsg();
                        break;
                    case "f":
                        Faculty faculty = new Faculty();
                        faculty.welcomeMsg();
                        break;
                    case "s":
                        Student student = new Student();
                        student.welcomeMsg();
                        break;
                }
                break;
            case "n":
                break;
        }
    }


}
