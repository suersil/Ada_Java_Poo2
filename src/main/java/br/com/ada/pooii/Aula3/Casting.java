package br.com.ada.pooii.Aula3;

import java.util.ArrayList;
import java.util.List;

public class Casting {
    public static void main(String[] args) {

      /*  Casting - to convert a data Type to another Type.

        IMPLICIT Casting - happens automatically when converting from a narrower range data type to a wider range data type.
         -> converting an int to a double/float/long

       */

            double d1 = 4;        // int -> double  - Declarando um double para guardar um valor int (Casting Automatico)
            double d2 = 5.7f;     // float -> double
            long l1 = 100;        // int -> long


       /* EXPLICIT Casting - doesn't happen automatically. Should be done by the programmer when converting from a wider to a narrower data type.
         -> converting a double/float/long to an int
       */
        //  int i1 = 4.5; - ERROR  (int é menor que double) - Explicit cast should be used in this case:
            int i1 = (int) 4.5;  //Some data will be lost -> 4.5 = 4;
            int i2 = (int) 8L;   // 8L = 8;

        //Codigo Aula

        long id = 123;
        String idString = "123-abc";
        int idInt = 456;

        List ids = new ArrayList();
        ids.add(id);
        ids.add(idString);
        ids.add(idInt);

        // ClassCastException

        if (ids.get(1) instanceof Long) {
            Long idLong2 = (long) ids.get(1);
            System.out.println(idLong2);
        }

        if (ids.get(2) instanceof Long || ids.get(2) instanceof Integer) {
            Integer i = (Integer) ids.get(2);
            Long idLong2 = (long) i;
            System.out.println(idLong2);
        }
    }
}
