package ObjetoFile;

public class User {

    public String name;
    public int edad;
    private String admin;

    public User() {
    }

    public User(String name, int edad, String admin) {
        this.name = name;
        this.edad = edad;
        this.admin = admin;
    }

    // getters and setters, toString() .... (omitted for brevity)
}