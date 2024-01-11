package br.com.ada.pooii.Aula2.Generics;

public class Caixa <TIPO> {

// <TIPO> é o nome, pode ser diferente.  / Tipo = Generico / Por convenção usa-se T, K, N, E, V etc...

    //Atributo:
    private TIPO obj;

    //Metodos:
    public Caixa(TIPO obj) {
        this.obj = obj;
    }

    public TIPO getObj() {
        return obj;
    }

    public void imprimir() {
        System.out.println(this.obj);
    }

}
