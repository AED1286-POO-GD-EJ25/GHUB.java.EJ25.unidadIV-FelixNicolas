package desacoplar;

public class Alumno  implements Comparable<Alumno>{
    //Atributo
    private String nombre;
    private int edad;
    private double notaPromedio;
    
    //Constructor

    public Alumno(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    //propiedades
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public double getNotaPromedio() {
        return notaPromedio;
    }


    public void setNotaPromedio(double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }

    @Override
    public String toString() {
        return nombre + ", " + edad + ", " + notaPromedio ;
    }

    @Override
    public int compareTo(Alumno o) {
        return this.edad-o.edad;
    }

    

    
    
}
