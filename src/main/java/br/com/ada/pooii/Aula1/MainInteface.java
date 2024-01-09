package br.com.ada.pooii.Aula1;

public class MainInteface {

    public static void main(String[] args) {

//        Funcionario jorge = new Funcionario("Jorge", 1200, "vendedor");
//        System.out.println("Jorge Bonus: " + jorge.getBonus());
//
//        Funcionario maria = new Funcionario("maria", 1500, "gerente");
//        System.out.println("Maria Bonus: " + maria.getBonus());

    }
}

abstract class Funcionario {

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
    //CRIANDO NOVAS CLASSES:

    class Vendedor extends Funcionario {

        //Constructor matching super - criado automaticamente:
        public Vendedor(String nome, double salario) {
            super(nome, salario);
        }

        @Override
        public double getBonus() {
            return this.salario * 0.2;
        }
    }

    class Gerente extends Funcionario {

        public Gerente(String nome, double salario) {
            super(nome, salario);
        }
        @Override
        public double getBonus(){
            return this.salario * 0.3;
        }
    }
