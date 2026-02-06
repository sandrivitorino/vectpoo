package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    void main(){
        //lista nao aceita tipos primitivos.ex(int)

        List<String> list = new ArrayList<>();

        //adicionando elementos na lista
        list.add("lilica");
        list.add("vonvit");
        list.add("vitorino");
        list.add("clara");
        list.add("lambo");
        list.add(2, "nãnã");//adicionando em uma posição especifica

        System.out.println(list.size());


        //list.remove("lilica"); //removendo um nome

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("----------------------");

        //removendo elementos da lista
        list.remove(1);

        //removendo elementos especificos ex: letra 'v'
        list.removeIf(x -> x.charAt(0) == 'v');
        for(String x : list){
            System.out.println(x);
        }
        System.out.println("----------------------");
        //mostrando o endereço do elemento na lista
        System.out.println("index of Clara: " + list.indexOf("clara"));
        System.out.println("index of vonvit: " + list.indexOf("vonvit"));

        System.out.println("----------------------");

        // IMPRIMINDO ELEMENTOS COMEÇADOS COM "l"
        //1 converte para stream: list.stream()
        //2 fazer a operação lambda desejada: .filter(x -> x.charAt(0) == 'l')
        //voltar pra lista: .collect(Collectors.toList());
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'l').collect(Collectors.toList());
        for(String x : result){
            System.out.println(x);
        }

        System.out.println("----------------------");

        //ENCONTRANDO ELEMENTOS
        //encontre o 1º elemento com a letra "l"
        String name = list.stream().filter(x -> x.charAt(0) == 'l').findFirst().orElse(null);
        System.out.println(name);

    }

}
