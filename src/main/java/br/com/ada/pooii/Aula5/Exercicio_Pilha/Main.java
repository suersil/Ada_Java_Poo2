package br.com.ada.pooii.Aula5.Exercicio_Pilha;

public class Main {
    public static void main(String[] args) {

        StackImplementacao <String> stringStack = new StackImplementacao<>();
        stringStack.push("Sue");
        stringStack.push("Ana");
        stringStack.push("Paula");

        //POP
        System.out.println("POP: ");
        String nome = stringStack.pop();
        System.out.println(nome);

        nome = stringStack.pop();
        System.out.println(nome);

        //PEEK
        System.out.println("PEEK: ");
        nome = stringStack.peek();
        System.out.println(nome);

        nome = stringStack.peek();
        System.out.println(nome);

        //IS EMPTY
        System.out.println("IS EMPTY: ");
        boolean nome1 = stringStack.isEmpty();
        System.out.println(nome1);



    }
}
