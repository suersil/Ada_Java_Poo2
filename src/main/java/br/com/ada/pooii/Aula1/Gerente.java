package br.com.ada.pooii.Aula1;
public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus(){
        return this.salario * 0.3;
    }
}