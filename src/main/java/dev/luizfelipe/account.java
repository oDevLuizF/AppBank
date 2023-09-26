package dev.luizfelipe;

import util.convert.brl.util.utilsBrl;

public class Account {
    private static int contAccount = 1;
    private int numberAccount;
    private User person;
    private double balance = 0.0;


    //contrutor
    public Account(User person) {
        this.numberAccount = contAccount;
        this.person = person;
        contAccount += 1;
    }


    //Getters Setters


    public int getNumberAccount() {
        return numberAccount;
    }
    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public User getPerson() {
        return person;
    }
    public void setPerson(User person) {
        this.person = person;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //metodo toString

    public String toString() {
        return "\nNumero da Conta: " + this.getNumberAccount() +
                "\nNome: " + this.person.getName() +
                "\nCpf: " + this.person.getCpf() +
                "\nEmail: " + this.person.getEmail() +
                "\nSaldo: " + utilsBrl.doubleToString(this.getBalance());

    }


    // metodo de depositar
    public void deposit(Double value){
        if (value < 0) {
            setBalance(getBalance() + value);
            System.out.println("Deposito realizado com sucesso!");
        }else{
            System.out.println("Nao foi possivel realizar o deposito!");

        }
    }

    //metodo de sacar

    public  void withdraw(Double value) {
        if (value > 0 && (this.getBalance() >= value)) {
            setBalance(getBalance() - value);
            System.out.println("Saque realizado com sucesso!");

        } else {
            System.out.println("Nao foi possivel realizar o saque!");
        }
    }

    //metodo de realiazr transeferencia
    public  void transfer(Account accounttodeposit, Double value){
        if (value > 0 && this.getBalance() >= value){
            setBalance(getBalance() - value);

            accounttodeposit.balance = accounttodeposit.getBalance() + value;
            System.out.println("Transferencia realizada com sucesso!");

        }else {
            System.out.println("[ERRO] sua transferencia nao foi realizada!");
        }
    }






}
