package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String [] nomes = new String[n];
        int [] idade = new int[n];
        double [] altura = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("idade: ");
            idade[i] = sc.nextInt();
            System.out.print("altura: ");
            altura[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for(int i = 0; i < n; i++){
            sum += altura[i];
        }
        double mediaAltura = sum / n;

        System.out.printf("Altura media: %.2f", mediaAltura);

        sc.close();
    }
}
