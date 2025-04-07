package miPrincipal;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    // Constructor vacío
    public Fecha() {}

    // Constructor con parámetros
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public Fecha(String s){
        int pos1 = s.indexOf('/'); // Posición del primer '/'
        int pos2 = s.indexOf('/', pos1 + 1); // Posición del segundo '/'

        String sDia = s.substring(0, pos1);
        this.dia = Integer.parseInt(sDia);

        String sMes = s.substring(pos1 + 1, pos2);
        this.mes = Integer.parseInt(sMes);

        String sAño = s.substring(pos2 + 1);
        this.año = Integer.parseInt(sAño);
    }
    private int fechaToDias() {
    int dias = 0;

    // Calcular los días por los años completos anteriores
    for (int i = 1; i < año; i++) {
        if(esBisiesto(año)){
            dias+=366;
        }else{
            dias+=365;
        }
    }

    // Calcular los días por los meses completos del año actual
    int diasEnMes=0;  
    
    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
        // El mes tiene 31 días
        diasEnMes = 31;
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
        // El mes tiene 30 días
        diasEnMes = 30;
    } else if (mes == 2) {
        // Febrero, tiene 28 días o 29 si es año bisiesto
        if(esBisiesto(año)){
            diasEnMes+=29;
        }else{
            diasEnMes+=28;
        }
    }


    // Añadir los días del mes actual
    dias += (mes-1)*diasEnMes + dia;
    
    return dias;
}
    public void addDias(int diasAAgregar) {
    // Sumar los días completos al año
    while (diasAAgregar > 0) {
        int diasEnMes;
        
        // Si es el último día del mes, avanzamos al siguiente mes
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            diasEnMes = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasEnMes = 30;
        } else if (mes == 2) {
            // Febrero, tiene 28 o 29 días dependiendo si es bisiesto
            if (esBisiesto(año)) {
                diasEnMes = 29;
            } else {
                diasEnMes = 28;
            }
        } else {
            diasEnMes = 0;
        }

        // Si los días a agregar son mayores que los días restantes en el mes actual, avanzamos al siguiente mes
        if (diasAAgregar >= diasEnMes - dia) {
            diasAAgregar -= (diasEnMes - dia);
            dia = 1; // Pasamos al primer día del siguiente mes
            mes++;
            if (mes > 12) { // Si hemos pasado de diciembre, incrementamos el año
                mes = 1;
                año++;
            }
        } else {
            dia += diasAAgregar;
            break;
        }
    }
}

   private void diasToFecha(int i) {
    int añoTemp = 0;
    int diasRestantes = i;

    // Calcular el año y los días restantes
    while (true) {
        int diasEnAño = esBisiesto(añoTemp) ? 366 : 365;
        if (diasRestantes < diasEnAño) {
            break;
        }
        diasRestantes -= diasEnAño;
        añoTemp++;
    }

    this.año = añoTemp;

    // Calcular el mes y el día
    int mesTemp = 1;
    while (true) {
        int diasEnMes = 30;  // Suponiendo que cada mes tiene 30 días
        if (mesTemp == 2 && esBisiesto(añoTemp)) {
            diasEnMes = 29;  // Febrero en año bisiesto
        } else if (mesTemp == 2) {
            diasEnMes = 28;  // Febrero en año no bisiesto
        }
        if (diasRestantes < diasEnMes) {
            break;
        }
        diasRestantes -= diasEnMes;
        mesTemp++;
    }

    this.mes = mesTemp;
    this.dia = diasRestantes;
    
    if (dia == 0) {
        dia = 30;
        mes--;
    }
    
    if (mes == 0) {
        mes = 12;
        año--;
    }
}


    private boolean esBisiesto(int año) {
    if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
        return true;
    }
    return false;
}
    // Getters y Setters
    public int getDia() { return dia; }
    public void setDia(int dia) { this.dia = dia; }

    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; }

    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }

    public String toString(){
        return dia+"/"+mes+"/"+año;
    }
    @Override
    public boolean equals(Object o){
        Fecha otra = (Fecha)o;

        return ((this.dia ==otra.dia) && (this.mes ==otra.mes) && (this.año ==otra.año));
    }
}