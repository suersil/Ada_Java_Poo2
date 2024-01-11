package br.com.ada.pooii.Aula2.ExcShape;

public class Triangulo implements Shape{
    @Override
    public double CalcularArea() {
        double areaTriangulo;
        int altura = 5;
        int base = 5;

        areaTriangulo = altura * base / 2;
        return areaTriangulo;
    }
}
