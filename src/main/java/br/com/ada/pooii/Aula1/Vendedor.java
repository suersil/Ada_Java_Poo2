package br.com.ada.pooii.Aula1;
public class Vendedor extends Funcionario implements Autentica{

    private String senha;

    //Constructor matching super - criado automaticamente:
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.salario * 0.2;
    }

    //Implementando metodo da Interface - automaticamnete
    @Override
    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }
}