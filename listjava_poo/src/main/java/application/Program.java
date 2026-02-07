package application;

import entites.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();;

        System.out.print("How many employee will be registered? ");
        int n = sc.nextInt();



        sc.close();
    }
}
