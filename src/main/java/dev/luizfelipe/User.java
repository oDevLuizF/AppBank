package dev.luizfelipe;

public class User {
    private static int counter = 1;
    private String name;
    public String email;
    private String cpf;



    public User(String name, String cpf, String email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        counter +=1;

    }


//getters e setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public  String toString(){
        return "\nName: " + this.getName() +
                "\nCpf: " + this.getCpf() +
                "\nEmail: " + this.getEmail();
    }
}