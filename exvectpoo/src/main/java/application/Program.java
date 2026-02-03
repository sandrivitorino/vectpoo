package application;

import entites.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);

        }
        double sum = 0.0;
        //usando length para especificar o tamanho(quantidade) de vezes a ser contado(a)
        for(int i = 0; i < vect.length; i++){
            //usando get.Price para pegar apenas os preços e fazer a soma
            sum += vect[i].getPrice();
        }

        // criando variavel avg para calcular a media dos produtos
        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();

    }
}
