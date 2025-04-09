package abstractas;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo() {
        super();
        radio = 0;
    }

    public Circulo(double r) {
        super();
        this.radio = r;
    }

    public Circulo(double x, double y, double r) {
        super(x, y);
        this.radio = r;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
