package Estudos;

import java.util.ArrayList;
import java.util.Arrays;

public class arraysVsArrayList {
    public static void main(String[] args) {

        // [0] [1] [2] [3]

        //Declarando ARRAY:
//      String[] friendsArray = new String[4];  (2 formas de declarar)
        String[] friendsArray = {"Jhon", "Ana", "Sue", "Beth"};

        //Declarando ARRAY LIST:
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList ("jhon", "ana", "sue", "beth")); //as.List - mutaveis

        //Imprindo:

        // valor na posicao: //Get elemente
        System.out.println(friendsArray[0]);
        System.out.println(friendsArrayList.get(0));

        //tamanho array: //Get size
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());

        //Adicinando elementos ao ArrayList (Não pode ser feito em Arrays) //Ad element
        friendsArrayList.add("Ágata");

        //Set an element ([posição], "elemento")
        friendsArray[0] = "Carol";
        friendsArrayList.set(0, "Carol");
        System.out.println(friendsArrayList.get(0));
        System.out.println(friendsArray[0]);

        //Remove an element (Can't do with Arrays)
        friendsArrayList.remove(0);
        System.out.println(friendsArrayList.get(0));

        //Print
        System.out.println(friendsArray); //Memoria do array
        System.out.println(friendsArrayList);

        //For each loop - ARRAY
        /**for (type variableName : arrayName) {
            // code block to be executed
        }*/

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}

/** https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html*/

