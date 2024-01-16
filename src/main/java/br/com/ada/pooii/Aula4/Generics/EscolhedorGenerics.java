package br.com.ada.pooii.Aula4.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class EscolhedorGenerics <T> {

    private List<T> array;

    public EscolhedorGenerics(List<T> array) {
        // prefira listas a array
        // sempre tentar eliminar os alertas
        //this.array = array;
        this.array = array;
    }

    public T escolhe() {
        // obtendo um numero randomico
        Random random = new Random();
        int numeroRandomico = random.nextInt(array.size());

        // escolhi, baseado no numero randomico, um valor no array
        T retorno = this.array.get(numeroRandomico);

        // retornei o objeto escolhido
        return retorno;
    }

}
