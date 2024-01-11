package br.com.ada.pooii.Aula2.ExcVeiculo;

public class Bicicleta implements Veiculo {

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Pedalando mais forte");
    }

    @Override
    public void frear() {
        System.out.println("Freando");
    }

}
