package br.com.ada.pooii.Aula3.ExercicioGenerics;
import java.util.ArrayList;
import java.util.List;

public class MinhaLista <T , U> {

    //Final - porque tem que ser uma Constante
    private final List<T> elementos = new ArrayList<>();
    private final List<U> id = new ArrayList<>();

    // adicionar (T elemento)
    public void adicionar(T elemento) {
        this.elementos.add(elemento);
    }

    //T Obter (int Indice)
    public T obter(int indice) {

        if (indice >= 0 && indice >= elementos.size()) {
            T objetoEncontrado = this.elementos.get(indice);
            return objetoEncontrado;
        }
//        throw new IndexOutOfBoundsException("Posição Invalida");
        return null;

    }

    //Int Indice (U identificador)

    // boolean contem (T elemento)
    public boolean contem(T elemento) {
//        boolean isElementosNaLista = this.elementos.contains(elemento);
//        return isElementosNaLista;

        for (int i = 0; i < this.elementos.size(); i++) {
            T elementoDaPosicao = this.elementos.get(i);
            if (elemento.equals(elementoDaPosicao)) {
                return true;
            }

        }
        return false;
    }
}
