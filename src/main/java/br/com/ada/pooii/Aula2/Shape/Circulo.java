package br.com.ada.pooii.Aula2.Shape;
public class Circulo implements Shape{
    @Override
    public double CalcularArea() {
        double areaCirculo;
        double pI = 3.14;
        int raio = 5;

        areaCirculo = pI * (raio * raio);
        return areaCirculo;

    }
}
