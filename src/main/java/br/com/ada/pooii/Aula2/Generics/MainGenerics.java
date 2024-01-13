package br.com.ada.pooii.Aula2.Generics;

import br.com.ada.pooii.Aula2.Generics.Caixa;

//Generic é um recurso que foi implementado no Java 1.5
// que permite escrever códigos mais seguros e fáceis de ler pelo fato de utilizar menos cast (conversão de um objeto em outro).

public class MainGenerics {

    public static void main(String[] args){

        //GENERICS

        //Declarando o TIPO desejado
        Caixa<String> box = new Caixa<String>("abc");

        //Chamando o Metodo
        box.imprimir();
    }
}
