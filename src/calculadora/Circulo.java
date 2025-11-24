package calculadora;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double calcularArea(){
        System.out.println("A área do circulo é: ");
        return Math.PI * raio * raio;
    };

}
