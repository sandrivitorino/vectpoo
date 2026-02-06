package application;

import entites.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //criando o vetor de 10 posições.
        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            //instanciando o Rent.

            //pode ser feito assim:
            //Rent rent = new Rent(name, email);
            //ou da forma abaixo.
            vect[roomNumber] = new Rent(name, email);

        }

        sc.close();
    }
}
