package br.com.ada.pooii.Aula1;

public abstract class Funcionario {

    //ATRIBUTOS
//   private String nome;
//   private double salario;
//  private String cargo;
    protected String nome;
    protected double salario;

    //CONSTRUTOR
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
//      this.cargo = cargo;        }
    }

    //METODO
    public abstract double getBonus();

//        double resultado = 0.0;
//        if (this.cargo.equalsIgnoreCase("vendedor")) //IgnoreCase = Para ignorar letras Maiusculas ou Min.
//        {
//            resultado = this.salario * 0.2;   // = 20%  - 1.2 = salario + bonus
//        } else if (this.cargo.equals("gerente")){
//            resultado = this.salario * 0.3;
//        }
//            return resultado;

}