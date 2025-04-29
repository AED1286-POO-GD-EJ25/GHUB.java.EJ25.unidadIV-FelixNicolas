package genericos;
public class Caja <T>{
    //Atributos
    private T contenido;

    //propiedades
    public T getConteindo(){
        return contenido;
    }

    public void setContenido(T contenido){
        this.contenido = contenido;
    }

    @Override
    public String toString(){
        return "Contenido de la caja: "+contenido;
    }

}