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

    public String getSenha() {
        return senha;
    }


}



//      EXEMPLO FERNANDO sobre SOBRECARGA:
//    public double getBonus(double multiplier) {
//        return this.salario*multiplier;
//    }
//
//    public String getBonus(String prefix) {
//        return prefix+this.getBonus();
//    }
//
//    public String getBonus(String prefix, double multiplier) {
//        return prefix+this.getBonus(multiplier);
//    }
//        System.out.println("Jorge Bonus 30%: " + jorge.getBonus(0.3));
//        System.out.println("Jorge Bonus 50%: " + jorge.getBonus(0.5));
//        System.out.println("Jorge Bonus Prefixo: " + jorge.getBonus("Parabens: "));
//        System.out.println("Jorge Bonus Prefixo 50%: " + jorge.getBonus("Parabens: ", 0.5));
