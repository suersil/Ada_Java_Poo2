package br.com.ada.pooii.Aula6.Solid.ExcSRP;

public class TratarPedido {

    public Pedido buscarPedido(long id) {
        System.out.println("Buscando Pedido " + id);
        return new Pedido(1);

    }
    public void salvar(Pedido pedido) {
        System.out.println("Salvando Pedido no Banco de Dados " + pedido);

    }
    public void atualizar(long id, Pedido pedido) {
        System.out.println("Atualizando Pedido no Banco de Dados " + id + "," + pedido);

    }
    public void deletar(long id) {
        System.out.println("Deletando Pedido");

    }
}
