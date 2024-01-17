package Estudos.WildCard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Criando uma Lista, adicionando valores, chamando o metodo printList

        List<String> nome = new ArrayList<>();   //Criando List
        nome.add("Sue");                         //Add valores
        nome.add("Fer");
        printList(nome);                         //Chamando o metodo

        List<Double> altura = new ArrayList<>();
        altura.add(1.57);
        altura.add(1.74);
        printList(altura);

        ArrayList<String> apelidos = new ArrayList<>();
        apelidos.add("chica");
        printer(apelidos);
    }

    //WildCard <?>
    private static void printList (List<?> list){
        System.out.println("Imprimindo printList: " + list);

    }
    static void printer (ArrayList<?> a){                     // posso passar o nome que eu quiser entre ()
        System.out.println("Imprimindo printer: " + a);
    }
}



