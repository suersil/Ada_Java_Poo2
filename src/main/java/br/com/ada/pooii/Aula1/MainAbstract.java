package br.com.ada.pooii.Aula1;
public class MainAbstract {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();

        cc.depositar(10.00);

        System.out.println(cc.getSaldo());
    }
}
abstract class Conta {

    //Atributes (encapsulados/wrapper):

    //private String titular; - Mudamos para PROTECTED
    // para podermos usar na classe ContaCorrente que herda(extends) da classe Conta
    protected String titular;

    //private double saldo; -  Mudamos para PROTECTED
    protected double saldo;

    //Methods
    abstract void depositar (double valor);

    abstract void sacar (double valor);

    public double getSaldo() {
        return saldo;
    }
}

class ContaCorrente extends Conta{
    @Override
    void depositar(double valor) {
        this.saldo += valor * 0.95;  //cobrando 5% de juros  //This. ou Super. ambos servem
    }
    @Override
    void sacar(double valor) {
        this.saldo -= valor;
    }
}