package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    void main(){
        //lista nao aceita tipos primitivos.ex(int)

        List<String> list = new ArrayList<>();

        //adicionando elementos na lista
        list.add("lilica");
        list.add("vonvit");
        list.add("clara");
        list.add(2, "nãnã");//adicionando em uma posição especifica

        System.out.println(list.size());

        //removendo elementos da lista
        list.remove("lilica");
        list.remove(1);

        for(String x : list){
            System.out.println(x);
        }
    }
}
