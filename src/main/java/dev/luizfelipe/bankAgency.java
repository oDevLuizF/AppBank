package dev.luizfelipe;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class bankAgency {

    static Scanner reader= new Scanner(System.in);
    static ArrayList<Account> accountBank;
    static User user = new User();
    public static void main(String[] args) {
        accountBank = new ArrayList<Account>();
        operation();

    }
     public static void operation(){
            int options;

         System.out.println("----------------------------------------------");
         System.out.println("-------------------BEM-VINDO------------------");
         System.out.println("----------------------------------------------");
         System.out.println("---------QUAL-OPERAÇAO-DESEJA-REALIZAR?-------\n");
         System.out.println("|       1- Criar Conta:                       |");
         System.out.println("|       2- Depositar:                         |");
         System.out.println("|       3- Sacar:                             |");
         System.out.println("|       4- transferir:                        |");
         System.out.println("|       5- Listar:                            |");
         System.out.println("|       6- Sair:                              |");
         options = reader.nextInt();

         switch (options){
             case 1:
                 createAccount();
                 break;
             case 2:
                 deposit();
                 break;
             case 3:
                 withdraw();
                 break;
             case 4:
                 transfer();
                 break;
             case 5:
                 list();
                 break;
             case 6:
                 System.out.println("Bye Bye, Obrigado por usar o AppBank");
                 System.exit(0);
                 break;
             default:
                 System.out.println("Ooçao invalida!");
                 operation();


         }
     }






}
