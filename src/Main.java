import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static ArrayList<Login> arrLogin = new ArrayList<>();
    public static ArrayList<Student> arrStudent = new ArrayList<>();
    public static ArrayList<Faculty> arrFaculty = new ArrayList<>();
    public static void main(String[] args) {
        //create instance for Student, Admin and Faculty class
        Student student = new Student();
        Admin admin = new Admin();
        Faculty faculty = new Faculty();

        //preload login info for an admin, a student and a faculty to the login arraylist
        Login loginAdmin = new Login (1, "MC Admin",  "admin@mc.edu","adminpass");
        Login loginS1 = new Login (1, "Student 1",  "s1@mc.edu","s1pass");
        Login loginF1 = new Login (1, "Faculty 1",  "f1@mc.edu","f1pass");
        Collections.addAll(arrLogin, loginAdmin,loginS1, loginF1);

        //Welcome message
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
                        admin.welcomeMsg();
                        break;
                    case "f":
                        faculty.welcomeMsg();
                        break;
                    case "s":
                        student.welcomeMsg();
                        break;
                    default:
                        break;
                }
                break;
            case "n":
                break;
        }
    }


}
