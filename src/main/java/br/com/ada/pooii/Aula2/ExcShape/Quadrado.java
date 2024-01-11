package br.com.ada.pooii.Aula2.ExcShape;

public class Quadrado implements Shape{
    @Override
    public double CalcularArea() {
        double areaQuadrado;
        int altura = 5;
        int base = 5;

        areaQuadrado = altura * base;
        return areaQuadrado;
    }
}
