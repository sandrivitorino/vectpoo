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

        for(int i=0; i<n; i++){
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while(hasId(list, id)){
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();


            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        //outra forma de buscar a posição: Integer pos = positionId(list, idSalary);

        if(emp == null){
            System.out.println("This id does not exist!");
        }
        else{
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for(Employee e : list){
            System.out.println(e);
        }

        sc.close();
    }


    public static Integer positionId(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;

    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
