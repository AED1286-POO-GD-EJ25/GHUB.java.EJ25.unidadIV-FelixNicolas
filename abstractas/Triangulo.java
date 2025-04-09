package abstractas;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo() {
        super();
        base = 0;
        altura = 0;
    }

    public Triangulo(double b, double h) {
        super();
        this.base = b;
        this.altura = h;
    }

    public Triangulo(double x, double y, double b, double h) {
        super(x, y);
        this.base = b;
        this.altura = h;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
