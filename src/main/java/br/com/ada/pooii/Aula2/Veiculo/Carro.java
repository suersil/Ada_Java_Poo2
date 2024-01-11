package br.com.ada.pooii.Aula2.Veiculo;

public class Carro implements Veiculo, VeiculoMotorizado {
    @Override
    public void ligar() {
        System.out.println("Ligando o Carro");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o Carro");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Aumentando a Velocidade");
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
