package br.com.ada.pooii.Aula4.Generics.WildCard;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // GENERICS -> WILDCARDS <?>

        // List<Double> != List<Number>     -> "Lista de double" não aparece em "lista de Number"

        //List<Number> list = c(1, 1.2, 2l);
        //List<Double> list = Arrays.asList(1.2, 1.3, 1.4);
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);

        // Integer, Long, Double, Float, Short, Byte <- Number (Sucede)


//        imprimirNumerosComWildcard(list);

//        double resultado = somarListDeNumeros(list);

//        Collections.sort();

//        imprimirNumerosComWildcard(list);

//        System.out.println(resultado);

        /** Hierarquia:

         VEICULO
         CARRO        , MOTO
         CARROELETRICO

         EXTENDS VEICULO
         */

        addPrimeirosCincoNumeros(list);

        System.out.println(list);
    }

    public static void imprimirNumero(Number numero) {
        System.out.println(numero);
    }
    public static void imprimirNumerosSemWildcard(List<Number> numeros) {
        for (Number ngit sta : numeros) System.out.println(n);
    }

    //WILDNUMBER:
    public static <T extends Number> void imprimirNumerosComWildcard(List<T> numeros) {
        for (Number n : numeros) System.out.println(n.doubleValue());
//        for (T t : numeros) System.out.println(t);
//        System.out.println(n);
    }

    // upper bounded wildcard
    public static double somarListDeNumeros(List<? extends Number> numeros) {

        double resultado = 0.0;

        for (Object n : numeros) {
            Number num = (Number) n;
            resultado += num.doubleValue();
        }

        return resultado;
    }

    /**  Hierarquia:

              OBJECT
              NUMBER
     INTEGER, DOUBLE, LONG...
     */


    // LOWER BOUNDED wildcard
    public static void addPrimeirosCincoNumeros(List<? super Integer> numeros) {
        for (int i = 0; i < 6; i++) {
            numeros.add(i);
        }
    }


    // UNBOUNDED wildcard
    public static void swap(List<?> list) {

    }
}
