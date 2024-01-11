package br.com.ada.pooii.Aula2.ExcVeiculo;

public class Moto implements Veiculo, VeiculoMotorizado {
    @Override
    public void ligar() {
        System.out.println("Ligando a Moto");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a Moto");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Freando");
    }

    @Override
    public Integer getVelocidadeMax() {
        return 150;
    }
}
