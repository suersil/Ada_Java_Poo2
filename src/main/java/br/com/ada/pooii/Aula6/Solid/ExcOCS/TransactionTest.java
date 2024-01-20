package br.com.ada.pooii.Aula6.Solid.ExcOCS;

import java.math.BigDecimal;

public class TransactionTest {
    public static void main(String[] args) {

        TransactionManager manager = new TransactionManager();

        var t1 = new Transaction(new BigDecimal("1000"), "ADA");

        manager.executeTrade(t1);

    }
}
