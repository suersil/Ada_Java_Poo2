package br.com.ada.pooii.Aula1;

public class Cliente implements Autentica {

    private String senha;


    @Override
    public boolean autentica(String senha) {
        return autenticaDefault(senha);
    }

}
