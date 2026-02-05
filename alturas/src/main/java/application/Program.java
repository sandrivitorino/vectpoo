package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        int [] vect = new int[n];

        for(int i = 0; i > n; i++){
            System.out.println("Dados da 1a pessoa: ");
            System.out.println("Nome: ");

        }




        sc.close();
    }
}
