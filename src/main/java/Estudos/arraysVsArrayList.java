package Estudos;

import java.util.ArrayList;
import java.util.Arrays;

public class arraysVsArrayList {
    public static void main(String[] args) {

        // [0] [1] [2] [3]

        //Declarando ARRAY:
//      String[] friendsArray = new String[4];  (2 formas de declarar)
        String[] friendsArray = {"jhon", "ana", "sue", "beth"};

        //Declarando ARRAY LIST:
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("jhon", "ana", "sue", "beth")); //as.List - mutaveis

        //Imprindo:

        // valor na posicao:
        System.out.println(friendsArray[0]);
        System.out.println(friendsArrayList.get(0));

        //tamanho array:
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());
    }
}
