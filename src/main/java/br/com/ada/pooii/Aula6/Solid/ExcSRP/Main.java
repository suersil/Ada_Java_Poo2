package br.com.ada.pooii.Aula6.Solid.ExcSRP;

public class Main {
    public static void main(String[] args) {
        TratarPedido tratarPedido = new TratarPedido();
        tratarPedido.atualizar(1, new Pedido<>(1));
    }
}
