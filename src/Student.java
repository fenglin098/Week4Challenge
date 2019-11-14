public class Student extends Login{

    public Student() {
    }

    public Student(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    public void welcomeMsg(){
        System.out.println("Welcome Student");
    }
}
