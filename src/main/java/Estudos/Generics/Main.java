package Estudos.Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

/**
        Generics doesn't work with Primitive only Wrappers Classes.
*/

        //Chamando Metodo e passando () o <tipo> para impressao:

       /* Metodo exemplo Basico
       <Escrever o TIPO para impressao, Double, Integer, String etc...>
       (escrever o Valor que quer imprimir)

        Printer<> printer = new Printer<>();
        printer.print();                          -> Nome objeto declarado acima + nome metodo declarado na classe
        */

        //Chamando o metodo Printer e imprimindo diferentes formas (Int, Double, String), usando Generics<T>:

        Printer <Integer> numInt = new Printer<>(22);
        numInt.print();

        Printer <String> texto = new Printer("Oi");
        texto.print();

        Printer <Double> numDouble = new Printer<>(2.5);
        numDouble.print();

        System.out.println("--------------- ArrayList: -----------------");


        //Ex - Criando um arrayList e adc valores :

//        ArrayList<Cat> cats = new ArrayList<>();
//        cats.add(new Cat());

        /*
        ArrayList<Integer> idades = new ArrayList<>();
        idades.add(new Integer(27));

        Porque nao podemos usar Integer ?? Deprecated ?? Temos que usar a clase "Number"
        ou Criar um "List <Integer>" ao invez "ArrayList"  - E R R A D O
        */

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(27);

        //Usando generics em ArrayList - Criando arrayList e adicionando Valores
        ArrayList <Number> idades = new ArrayList<>();                  // ou Integer, mas não "int"
        idades.add(27);
        idades.add(34);
        idades.add(12);

        ArrayList <String> nomes = new ArrayList<>();
        nomes.add(new String("Suelen"));
        nomes.add(new String("Fernando"));
        nomes.add(new String("Miguel"));

        // Imprimindo ArrayList - usando o Printer (classe):

            Printer <ArrayList> imprimirListNomes = new Printer<>(nomes);
            imprimirListNomes.print();

            Printer <ArrayList> imprimirListIdades = new Printer<>(idades);
            imprimirListIdades.print();

        //Criando e imprimindo List - usando o Printer (classe):

        List<Double> altura = new ArrayList<>();
        altura.add(1.57);
        altura.add(1.74);

            Printer <List> imprimirListAltura = new Printer<>(altura);
            imprimirListAltura.print();

        }
}
