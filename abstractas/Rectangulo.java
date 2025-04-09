package abstractas;

public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo() {
        super();
        base = 0;
        altura = 0;
    }

    public Rectangulo(double b, double h) {
        super();
        this.base = b;
        this.altura = h;
    }

    public Rectangulo(double x, double y, double b, double h) {
        super(x, y);
        this.base = b;
        this.altura = h;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
