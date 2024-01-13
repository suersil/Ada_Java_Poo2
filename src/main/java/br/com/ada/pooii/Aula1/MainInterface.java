package br.com.ada.pooii.Aula1;

/**
    Interface nada mais que uma espécie de contrato de regras que uma classes deve seguir em um determinado contexto.
    Como em Java não existe herança múltipla, a interface passa a ser uma alternativa.
 */
public class MainInterface {

    public static void main(String[] args) {

//        Funcionario jorge = new Funcionario("Jorge", 1200, "vendedor");
//        Funcionario maria = new Funcionario("maria", 1500, "gerente");

        Vendedor vendedor = new Vendedor("jorge", 1000);
        Gerente gerente = new Gerente("Maria", 2000);

        System.out.println("Jorge Bonus: " + vendedor.getBonus());
        System.out.println("Maria Bonus: " + gerente.getBonus());

        autentica(vendedor, vendedor.getSenha());
    }

    public static void autentica(Autentica a, String senha){

        a.autenticaDefault(senha);

        if (a.autentica(senha)){
            System.out.println("Autenticado");
        } else {
            System.out.println("Não autenticado");
        }
    }
}







