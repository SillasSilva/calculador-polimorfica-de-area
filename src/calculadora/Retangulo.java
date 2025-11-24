package calculadora;

public class Retangulo extends FormaGeometrica{
    private double altura;
    private double largura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        System.out.println("a área do retangulo é: ");
        return this.largura * this.altura;
    }
}
