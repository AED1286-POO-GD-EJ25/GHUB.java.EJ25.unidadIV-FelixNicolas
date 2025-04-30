package fecha;

public class FechaDetallada extends Fecha{
    private static String meses[] = {"Enero",
                                    "Febrero",
                                    "Marzo",
                                    "Abril",
                                    "Mayo",
                                    "Junio",
                                    "Julio",
                                    "Agosto",
                                    "Septiembre",
                                    "Octubre",
                                    "Noviembre",
                                    "Diciembre" };
    //constructores
    public FechaDetallada(){
        super();

    }
    public FechaDetallada(int d,int m, int a){
        //invocamos al constructor del padre
        super(d,m,a);
        
    }
    public FechaDetallada(String s){
        super(s);
    }

    @Override
    public String toString(){
        return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();

    }
    
}
