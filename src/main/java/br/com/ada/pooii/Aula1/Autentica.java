package br.com.ada.pooii.Aula1;

//CRIANDO INTERFACE:
public interface Autentica {
    boolean autentica (String senha);

    //DEFAULT - para criar novos metodos sem que as outras classes que implementam essa interface precisem  sobrescrever/implementar esse metodo
    default boolean autenticaDefault(String senha) {
        return autenticaPrivate(senha);
    }

    static boolean autenticaStatico(String senha) {
        return senha.equals("123");
    }

    private boolean autenticaPrivate(String senha) {
        return senha.equals("123");
    }

}
