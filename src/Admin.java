public class Admin extends Login {
    public Admin() {
    }

    public Admin(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    public void welcomeMsg(){
        System.out.println("Welcome Admin");
    }
}
