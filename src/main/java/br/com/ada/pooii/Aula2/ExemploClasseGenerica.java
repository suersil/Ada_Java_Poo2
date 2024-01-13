package br.com.ada.pooii.Aula2;

/* The most commonly used type parameter names are:

    E - Element (used extensively by the Java Collections Framework)
    K - Key
    N - Number
    T - Type
    V - Value
    S,U,V etc. - 2nd, 3rd, 4th types
*/

/**
 * Síntese
 *   Objetivo: Mostrar a utilização de uma classe genérica
 *   Entrada: Nenhuma
 *   Saída: Visualização de cada objeto diferente criado através da ClasseGenerica
 */
public class ExemploClasseGenerica {
    public static void main(String[] args) {
        ClasseGenerica <String> objStr = new ClasseGenerica <String>();
        ClasseGenerica <Integer> objInt = new ClasseGenerica <Integer>();
        ClasseGenerica <Boolean> objBoolean = new ClasseGenerica <Boolean>();
        objStr.setAtributo("String objeto generico");
        objInt.setAtributo(100);
        objBoolean.setAtributo(true);
        //Objetos Criados
        System.out.println("Criado como String : "+objStr.getAtributo());
        System.out.println("Criado como Integer : "+objInt.getAtributo());
        System.out.println("Criado como Boolean : "+objBoolean.getAtributo());
    }
    /**
     * Síntese
     *   Classe com atributo definido como genérico.
     */
    public static class ClasseGenerica < T >{
        private T atributo;
        public T getAtributo() {
            return atributo;
        }

        public void setAtributo(T atributo) {
            this.atributo = atributo;
        }
    }
}
