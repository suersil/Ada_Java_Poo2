package br.com.ada.pooii.Aula2.Generics;

import br.com.ada.pooii.Aula2.Generics.Caixa;

public class MainGenerics {

    public static void main(String[] args){

        //GENERICS

        //Declarando o TIPO desejado
        Caixa<String> box = new Caixa<String>("abc");

        //Chamando o Metodo
        box.imprimir();
    }
}
