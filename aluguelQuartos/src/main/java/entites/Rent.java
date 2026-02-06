package entites;

public class Rent {
    private String name;
    private  String email;

    //criando construtor basico
    public Rent(){

    }

    public Rent(String email, String name) {
        this.email = email;
        this.name = name;
    }

    //adicionando getters e setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + ", " + email;
    }
}
