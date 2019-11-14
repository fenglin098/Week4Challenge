import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static ArrayList<Login> arrLogin = new ArrayList<>();
    public static ArrayList<Student> arrStudent = new ArrayList<>();
    public static ArrayList<Faculty> arrFaculty = new ArrayList<>();
    public static ArrayList<Class> arrCourse= new ArrayList<>();
    public static ArrayList<Enrollment> arrEnrollment= new ArrayList<>();


    //create instance for Student, Admin and Faculty class
    public static Student student = new Student();
    public static Admin admin = new Admin();
    public static Faculty faculty = new Faculty();
    public static Class course = new Class();
    public static Enrollment enrollment = new Enrollment();
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
        System.out.println("Options:\n1 = Add Student\n2 = Add Faculty\n3 = Edit Student\n4 = Edit Faculty\n5 = Add Class\n6 = Edit Class\n7 = Enroll Student\n8 = Hire a Faculty\n9 = View All Information\nEnter \"q\" to quit");
        int answerOption = sc.nextInt();
        switch (answerOption) {
            case 1:
                System.out.println("Please enter student name: ");
                String inputSN = sc.next();
                inputSN += sc.nextLine();
                student.setName(inputSN);
                System.out.println("Please enter student email: ");
                String inputSE = sc.next();
                student.setEmail(inputSE);
                System.out.println("Please enter student ID");
                int inputSID = sc.nextInt();
                student.setId(inputSID);
                arrStudent.add(student);
                break;
            case 2:
                System.out.println("Please enter faculty name: ");
                String inputFN = sc.next();
                inputFN += sc.nextLine();
                faculty.setName(inputFN);
                System.out.println("Please enter faculty email: ");
                String inputFE = sc.next();
                faculty.setEmail(inputFE);
                System.out.println("Please enter faculty ID");
                int inputFID = sc.nextInt();
                faculty.setId(inputFID);
                arrFaculty.add(faculty);
                break;
            case 3:
                System.out.println("Please enter the ID of the student you would like to edit: ");
                int editSID = sc.nextInt();
                System.out.println("What is the new name of the student?");
                String editSN = sc.next();
                editSN += sc.nextLine();
                for (Student s : arrStudent) {
                    if (s.getId() == editSID) {
                        s.setName(editSN);
                    }
                }
                break;
            case 4:
                System.out.println("Please enter the ID of the faculty you would like to edit: ");
                int editFID = sc.nextInt();
                System.out.println("What is the new name of the faculty?");
                String editFN = sc.next();
                editFN += sc.nextLine();
                for (Faculty f : arrFaculty) {
                    if (f.getId() == editFID) {
                        f.setName(editFN);
                    }
                }
                break;
            case 5:
                System.out.println("Please enter the new course title: ");
                String inputCTitle = sc.next();
                inputCTitle += sc.nextLine();
                course.setCourseTitle(inputCTitle);
                System.out.println("Please enter the new course ID: ");
                int inputCID = sc.nextInt();
                course.setCourseID(inputCID);
                System.out.println("Please enter the new course description: ");
                String inputCDescription = sc.next();
                inputCDescription += sc.nextLine();
                course.setDescription(inputCDescription);
                arrCourse.add(course);
                break;
            case 6:
                System.out.println("Please enter the ID of the course you would like to edit: ");
                int editCID = sc.nextInt();
                System.out.println("What is the new title of the new course?");
                String editCTitle = sc.next();
                editCTitle+=sc.nextLine();
                for (Class c: arrCourse ){
                    if (c.getCourseID()==editCID){
                        c.setCourseTitle(editCTitle);
                    }
                }
                break;
            case 7:
                System.out.println("Please enter the Course ID: ");
                int enrollmentCSID = sc.nextInt();
                System.out.println("Please enter the Student ID: ");
                int enrollmentSID = sc.nextInt();
                System.out.println("Please enter the enrollment date: ");
                String enrollmentDate = sc.next();
                for (Enrollment e: arrEnrollment){
                    if (e.getEnrolledCID()==enrollmentCSID){
                        e.setEnrolledSID(enrollmentSID);
                        e.setEnrolledDate(enrollmentDate);
                    }
                }
                break;
            case 8:
                System.out.println("Please enter the Course ID: ");
                int enrollmentCFID = sc.nextInt();
                System.out.println("Please enter the Faculty ID: ");
                int enrollmentFID = sc.nextInt();
                System.out.println("Please enter the enrollment date: ");
                String enrollmentDateF = sc.next();
                for (Enrollment e: arrEnrollment){
                    if (e.getEnrolledCID()==enrollmentCFID){
                        e.setEnrolledFID(enrollmentFID);
                        e.setEnrolledDate(enrollmentDateF);
                    }
                }
                break;
            case 9:
                System.out.println("All Students:\n");
                for (Student s: arrStudent){
                    System.out.println("Student ID: "+s.getId());
                    System.out.println("Student name: "+s.getName());
                }

                System.out.println("All Faculty:\n");
                for (Faculty f: arrFaculty){
                    System.out.println("Faculty iD: "+f.getId());
                    System.out.println("Faculty name: "+f.getName());
                }

                System.out.println("All Classes:\n");
                for (Class c: arrCourse){
                    System.out.println("Class ID: "+c.getCourseID());
                    System.out.println("Class name: "+c.getCourseTitle());
                    System.out.println("Class description: "+c.getDescription());
                }
                 break;
        }
    }


    public static void loginCheck() {
        boolean IsValid = false;
        do {
            for (Login l : arrLogin) {
                System.out.println("Please enter your email: ");
                String loginEmail = sc.next();
                System.out.println("Please enter your password: ");
                String loginPassword = sc.next();
                if (l.getEmail().equals(loginEmail)) {

                    Login login = l;
                    if (l.getPassword().equals(loginPassword)) {
                        IsValid = true;
                        System.out.println(l.getName() + "has logged in!");
                        break;
                    }else {
                        IsValid = false;
                    }
                } else {
                    IsValid = false;
                    System.out.println("You have entered the wrong email or password. Please try again!");
                }
            }
        }while (!IsValid);

    }






}