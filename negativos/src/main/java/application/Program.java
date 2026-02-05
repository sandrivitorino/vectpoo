package application;

//import entites.Negative;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Negative negativo = new Negative();

        System.out.print("Quantos numeros voce vai digitar?: ");
        int n = sc.nextInt();

        int [] vect = new int [n];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            vect[i] = sc.nextInt();
        }

        System.out.println("Negativos: ");
        for(int i = 0; i < n; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }


        sc.close();
    }
}
