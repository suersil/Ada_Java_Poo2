package br.com.ada.pooii.Aula5.Exercicio_Pilha;

import java.util.ArrayList;
import java.util.List;

public class StackImplementacao<E> implements Stack<E> {

    private final List<E> listaIntena;

    public StackImplementacao(){
        this.listaIntena = new ArrayList<>();
    }

    @Override
    public void push(E elemento) {
        this.listaIntena.add(elemento);

    }

    @Override
    public E pop() {
        //Pegar o ultimo elemento
        if(!isEmpty())
        return listaIntena.remove(listaIntena.size() -1);
        return null;
    }

    @Override
    public E peek() {
        if (!isEmpty())
        return listaIntena.get(listaIntena.size() -1);
        return null;
    }

    @Override
    public boolean isEmpty() {
      //  return listaIntena.size() == 0;
        return listaIntena.isEmpty();  //Metodo proprio do Java
    }

}
