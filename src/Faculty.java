public class Faculty extends Login {
    public Faculty() {
    }

    public Faculty(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    public void welcomeMsg(){
        System.out.println("Welcome Faculty");
    }
}
