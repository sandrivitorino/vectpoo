package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //instanciando a matriz na memoria:
        int [][] mat = new int [n][n];


        sc.close();
    }
}
