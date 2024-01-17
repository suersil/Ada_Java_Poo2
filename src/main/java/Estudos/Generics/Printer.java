package Estudos.Generics;
public class Printer <T> {

    //Atributo
    T thingToPrinter;

    //Construtor
    public Printer (T thingToPrinter) {
        this.thingToPrinter = thingToPrinter;
    }

    //Metodo
    public void print(){
        System.out.println(thingToPrinter);
    }



}
