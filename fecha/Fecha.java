package fecha;

public class Fecha {
    //atributos
    private int dia;
    private int mes;
    private int anio;
    //constructores
    public Fecha(){
        this.dia=1;
        this.mes =1;
        this.anio = 1900;
    }
    public Fecha(int dia, int mes,int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public Fecha(String s){
        //buscamos la primera coincidencia de /
        int pos1 = s.indexOf('/');

        //buscamos la ultima posicion del /
        int pos2 = s.lastIndexOf('/');

        //procesar el dia
        String sDia = s.substring(0, pos1);
        this.dia = Integer.parseInt(sDia);

        //procesamos el mes
        String sMes = s.substring(pos1+1,pos2);
        this.mes = Integer.parseInt(sMes);

        //procesamos el anio
        String sAnio = s.substring(pos2+1);
        this.anio = Integer.parseInt(sAnio);

    }
    //metodo personalizado
    //Metodos personalizados
    //suma dias a una Fecga
    public void addDias(int d){
        //convertir la fecha a dias y luego sumarle d
        int sum = fechaToDias()+d;

        //la fecha resultante (sum) se separa en dia,mes y año
        diasToFecha(sum);

    }
    private int fechaToDias(){
        return anio*360+mes*30+dia;
    }
    private void diasToFecha(int i){
        //duvidimos por 360 y obtenemos el año
       this.anio = (int)i/360;
        //del resto o residuo de la division anterior
        //podremos obtener el mes y el dia
        int resto = i % 360;
        //el mes es el resto dividido entre 30
       this.mes = (int) resto/30;
        //el resto de la division anterior son los dias
        this.dia = resto % 30;
        //ajuste por si el dia quedo en cero
        if (dia ==0){
            dia = 30;
            mes--;
        }
        //ajuste por el mes quedo en cero
        if (mes ==0){
            mes = 12;
            anio--;
        }
    }

    //getter y setter
    public int getDia(){
        return this.dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public int getMes(){
        return this.mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public int getAnio(){
        return this.anio;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    @Override
    public String toString(){
        return this.dia+"/"+mes+"/"+anio;
    }
    //sobrecarcarga el metodo equals que hereda de object
    @Override
    public boolean equals(Object o){
        Fecha otra = (Fecha)o; //convierte el argumento o que es tipo Object a tipo Fecha a traves de una operacion de cast
        return (this.dia ==otra.dia) && (this.mes ==otra.mes) && (this.anio==otra.anio) ;


    }
    
}
