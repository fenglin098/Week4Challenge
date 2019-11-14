import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static ArrayList<Login> arrLogin = new ArrayList<>();
    public static ArrayList<Student> arrStudent = new ArrayList<>();
    public static ArrayList<Faculty> arrFaculty = new ArrayList<>();

    //create instance for Student, Admin and Faculty class
    public static Student student = new Student();
    public static Admin admin = new Admin();
    public static Faculty faculty = new Faculty();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //preload login info for an admin, a student and a faculty to the login arraylist
        Login loginAdmin = new Login(1, "MC Admin", "admin@mc.edu", "adminpass");
        Login loginS1 = new Login(1, "Student 1", "s1@mc.edu", "s1pass");
        Login loginF1 = new Login(1, "Faculty 1", "f1@mc.edu", "f1pass");
        Collections.addAll(arrLogin, loginAdmin, loginS1, loginF1);

        //Welcome message
        System.out.println("Welcome to Montgomery College System!\nWould you like to login? (Y/N)");
        String answerLogin = sc.next().toLowerCase();
        String answerRole;
        switch (answerLogin) {
            case "y":
                System.out.println("Would you like to login as an (A)dmin, (F)aculty, or (S)tudent?");
                answerRole = sc.next();
                switch (answerRole) {
                    case "a":
                        admin.welcomeMsg();
                        loginCheck();
                        break;
                    case "f":
                        faculty.welcomeMsg();
                        loginCheck();
                        break;
                    case "s":
                        student.welcomeMsg();
                        loginCheck();
                        break;
                    default:
                        break;
                }
                break;
            case "n":
                break;
        }
        System.out.println();
        System.out.println("Options:");

    }


    public static void loginCheck() {
        boolean emailIsValid = false;
        boolean pwIsValid = false;
        do {
            for (Login l : arrLogin) {
                System.out.println("Please enter your email: ");
                String loginEmail = sc.next();
                System.out.println("Please enter your password: ");
                String loginPassword = sc.next();
                if (l.getEmail().equals(loginEmail)) {
                    emailIsValid = true;
                    Login login = l;
                    if (l.getPassword().equals(loginPassword)) {
                        pwIsValid = true;
                        System.out.println(l.getName() + "has logged in!");
                        break;
                    }else {
                        pwIsValid = false;
                    }
                } else {
                    emailIsValid = false;
                    System.out.println("You have entered the wrong email or password. Please try again!");
                }
            }
        }while (!pwIsValid || !emailIsValid);

    }
}