package br.com.ada.pooii.Aula4.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        String[] nomes = {"maria", "joana", "laura", "erica"};
        String nome = (String) new Escolhedor(nomes).escolhe();
        System.out.println(nome.toUpperCase());

        List<String> nomesList = Arrays.asList("maria", "joana", "laura", "erica");
        String nomeEscolhido = new EscolhedorGenerics<>(nomesList).escolhe();
        System.out.println(nomeEscolhido.toUpperCase());

        // SEMPRE PREFIRA LISTAS A ARRAYS

        // arrays e genericos
        // new List<T>[]
        // new List<String>[]
        // new T[]

        // covariantes
        //Object[] arrayDeObjetos = new Long[10];
        //arrayDeObjetos[0] = "maria"; // ArrayStoreException

        // invariante
        //ArrayList<Object> listaDeObjetos = new ArrayList<Long>();

    }
}
