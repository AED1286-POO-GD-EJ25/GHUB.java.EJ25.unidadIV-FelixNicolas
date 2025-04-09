package abstractas;

public abstract class FiguraGeometrica {
    protected double x;
    protected double y;

    public FiguraGeometrica() {
        x = 0;
        y = 0;
    }

    public FiguraGeometrica(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método abstracto que debe ser implementado por todas las clases hijas
    public abstract double calcularArea();
}
