package Figuras;

public class Prisma extends FiguraGeométrica {
    private double largo; // Atributo que identifica el largo del prisma
    private double ancho; // Atributo que identifica el ancho del prisma
    private double altura; // Atributo que identifica la altura del prisma
 
    public Prisma(double largo, double ancho, double altura) {
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;
        this.setVolumen(calcularVolumen()); 
        this.setSuperficie(calcularSuperficie());
    }

    public double calcularVolumen() {
        double volumen = largo * ancho * altura;
        return volumen;
    }

    public double calcularSuperficie() {

        double superficie = 2.0 * (largo * ancho + largo * altura
            + ancho * altura);
        return superficie;
    }
}
