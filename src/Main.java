import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static ArrayList<Login> arrLogin = new ArrayList<>();
    public static ArrayList<Student> arrStudent = new ArrayList<>();
    public static ArrayList<Faculty> arrFaculty = new ArrayList<>();
    public static ArrayList<Class> arrCourse= new ArrayList<>();
    public static ArrayList<Enrollment> arrEnrollment= new ArrayList<>();
    public static ArrayList<Integer> arrFacultyEnrollment = new ArrayList<>();
    public static ArrayList<Integer> arrStudentEnrollment = new ArrayList<>();
    public static ArrayList<String> arrSEnrollmentDate= new ArrayList<>();
    public static ArrayList<String> arrFEnrollmentDate= new ArrayList<>();

    //create instance for Student, Admin and Faculty class
    public static Student student = new Student();
    public static Admin admin = new Admin();
    public static Faculty faculty = new Faculty();
    public static Class course = new Class();
    public static Enrollment enrollment = new Enrollment();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //preload info for an admin, a student and a faculty to the login arraylist
        Admin admin1 = new Admin(1, "MC Admin", "admin@mc.edu", "adminpass");
        Student s1 = new Student(1, "Student 1", "s1@mc.edu", "s1pass");
        Student s2 = new Student(2, "Student 2", "s2@mc.edu", "s2pass");
        Collections.addAll(arrStudent,s1,s2);
        Faculty f1 = new Faculty(1, "Faculty 1", "f1@mc.edu", "f1pass");
        Faculty f2 = new Faculty(2, "Faculty 2", "f2@mc.edu", "f2pass");
        Collections.addAll(arrFaculty,f1,f2);

        //adding 3 classes of info to the abstract class
        Collections.addAll(arrLogin, admin1, s1, f1, s2, f1);

        //preload info for a course and an enrollment
        Class course1 = new Class(1,"Java1","Welcome to Java!");
        arrStudentEnrollment.add(1);
        arrFacultyEnrollment.add(1);
        arrSEnrollmentDate.add("3/31/19");
        arrFEnrollmentDate.add("4/30/19");
        Enrollment e1 = new Enrollment(1, arrStudentEnrollment,arrFacultyEnrollment,1,arrSEnrollmentDate,arrFEnrollmentDate);
        arrEnrollment.add(e1);

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
                        adminRights();
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
                System.out.println("Goodbye!");
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
                        System.out.println(l.getName() + " has logged in!");
                        break;
                    }else {
                        IsValid = false;
                    }
                } else {
                    System.out.println("You have entered the wrong email or password. Please try again!");
                }
            }
        }while (!IsValid);

    }
    public static void adminRights (){
        String answerOption2;
        do {
            System.out.println("Options:\n1 = Add Student\n2 = Add Faculty\n3 = Edit Student\n4 = Edit Faculty\n5 = Add Class\n6 = Edit Class\n7 = Enroll Student\n8 = Hire a Faculty\n9 = View All Information\nEnter \"q\" to quit");
            int answerOption = sc.nextInt();
            switch (answerOption) {
                //add student
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
                //add faculty
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
                //edit student
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
                //edit faculty
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
                //add class
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
                //edit class
                case 6:
                    System.out.println("Please enter the ID of the course you would like to edit: ");
                    int editCID = sc.nextInt();
                    System.out.println("What is the new title of the new course?");
                    String editCTitle = sc.next();
                    editCTitle += sc.nextLine();
                    for (Class c : arrCourse) {
                        if (c.getCourseID() == editCID) {
                            c.setCourseTitle(editCTitle);
                        }
                    }
                    break;
                //Enroll student
                case 7:
                    System.out.println("Please select the enrollment ID for which you would like to add the student: ");
                    int sEID = sc.nextInt();
                    for (Enrollment e : arrEnrollment) {
                        if (e.getEnrollmentID() == sEID) {
                            System.out.println("Please enter the new Student ID: ");
                            int enrollmentSID = sc.nextInt();
                            arrStudentEnrollment.add(enrollmentSID);
                            System.out.println("Please enter the enrollment date: ");
                            String enrollmentSDate = sc.next();
                            arrSEnrollmentDate.add(enrollmentSDate);
                        } else {
                            System.out.println("Invalid enrollment ID, please go back.");
                        }
                    }
                    break;

                //Enroll faculty
                case 8:
                    System.out.println("Please select the enrollment ID for which you would like to add the faculty member: ");
                    int fEID = sc.nextInt();
                    for (Enrollment e: arrEnrollment){
                        if (e.getEnrollmentID()==fEID){
                            System.out.println("Please enter the new Faculty ID: ");
                            int enrollmentFID = sc.nextInt();
                            arrFacultyEnrollment.add(enrollmentFID);
                            System.out.println("Please enter the enrollment date: ");
                            String enrollmentFDate = sc.next();
                            arrFEnrollmentDate.add(enrollmentFDate);
                        }else{
                            System.out.println("Invalid enrollment ID, please go back.");
                        }
                    }
                    break;
                //Print
                case 9:
                    System.out.println("All Students:\n");
                    for (Student s : arrStudent) {
                        System.out.println("Student ID: " + s.getId());
                        System.out.println("Student name: " + s.getName());
                        System.out.println();
                    }

                    System.out.println("All Faculty:\n");
                    for (Faculty f : arrFaculty) {
                        System.out.println("Faculty iD: " + f.getId());
                        System.out.println("Faculty name: " + f.getName());
                        System.out.println();
                    }

                    System.out.println("All Classes:\n");
                    for (Class c : arrCourse) {
                        System.out.println("Class ID: " + c.getCourseID());
                        System.out.println("Class name: " + c.getCourseTitle());
                        System.out.println("Class description: " + c.getDescription());
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Goodbye");
            }
            System.out.println("Would you like to select another option? (Y/N)");
            answerOption2 = sc.next().toLowerCase();
        } while (answerOption2.equalsIgnoreCase("y"));
    }
}