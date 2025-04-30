package abstractas;
public class Circulo extends FiguraGeometrica{
    //atributos
    private double radio;
    //constructores
    public Circulo(){
        super();
    }
    public Circulo(double r){
        super("Circulo");
        this.radio = r;
    }
    public Circulo(double x, double y, double r){
        super("Circulo");
        this.radio = r;
    }
    public double area(){
        return Math.PI * Math.pow(radio,2);
    }
}