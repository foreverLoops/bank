// Admin class will extend User

public class Admin extends User {
    
    // constructor to initialize admin
    public Admin (int id, String name, String email){
        super(id,name,email); // call User constructor
    }

    // Overriding abstract method from User to display Admin
    @Override
    public void displayInfo() {
        System.out.println("Admin ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
