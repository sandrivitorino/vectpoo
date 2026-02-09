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

        //percorrendo a matriz
        for(int i = 0; i <n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        //achando a diagonal principal
        System.out.println("Main diagonal: ");
        for(int i=0; i<n; i++){
            System.out.print(mat[i][i] + " ");
        }

        sc.close();
    }
}
