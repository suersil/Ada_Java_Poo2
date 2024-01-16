package br.com.ada.pooii.Aula4.Generics;

import java.util.Random;

//Numero Randomico
public class Escolhedor {

    private Object[] arrayParaEscolha;

    public Escolhedor(Object[] arrayParaEscolha) {
        this.arrayParaEscolha = arrayParaEscolha;
    }

    public Object escolhe() {
        // obtendo um numero randomico
        Random random = new Random();
        int numeroRandomico = random.nextInt(arrayParaEscolha.length);

        // escolhi, baseado no numero randomico, um valor no array
        Object retorno = this.arrayParaEscolha[numeroRandomico];

        // retornei o objeto escolhido
        return retorno;
    }
}
