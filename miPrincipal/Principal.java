package miPrincipal;
import fecha.*;
import abstractas.Circulo;
import abstractas.Rectangulo;
import abstractas.Triangulo;
import abstractas.FiguraGeometrica;
import genericos.Caja;
import genericos.Utilidades;

public class Principal {
    
    public static void main(String[] args) {
        Animal []animales = new Animal[4];
        animales[0]= new Animal();
        animales[1]= new Perro();
        animales[2] = new Gato();
        animales[3] = new Pajaro();

        int arreglo[] = new int[2]; //creando un arreglo de enteros
        arreglo[0]=2;
        //arreglo[1]= "Maria";
        //arreglo[1]=5.1; No es posible
        arreglo[1]=(int)5.1;

        for (int i=0; i<animales.length;){
            animales[i++].hacerSonido();
        }

        Animal animal1 ;
        Perro perro1 = new Perro();
        animal1 = perro1;
        //perro1 = animal1; no es posible
        perro1 = (Perro)animal1;

        Object obj = new FechaDetallada("3/12/2008");

        System.out.println("fec="+fec); //invoca al constructor de fec
        System.out.println(("obj="+obj));

        //crear un arreglo de objetos tipo Object

        Object arr[] = { new Fecha("2/10/1970"),
                         new FechaDetallada(23,12,1948),
                         new String("Esto es una cadena"),
                         new Integer(34) };
                         
        MuestraConjunto.mostrar(arr);

        //probar las clases Abstractas

        Circulo c = new Circulo(3.0);
        Rectangulo r = new Rectangulo(10.5,21.11);
        Triangulo t = new Triangulo(2,4);

        System.out.println(c);
        System.out.println(r);
        System.out.println(t);
        
        FiguraGeometrica arreglo2[] = {
                                        new Circulo(23),
                                        new Rectangulo(12,4),
                                        new Triangulo(2,5)
                                     };
        double prom = FiguraGeometrica.areaPromedio(arreglo2);

        System.out.println("Promedio = "+prom);

        //clases geneticas

        Caja<String> miCaja = new Caja<>();
        miCaja.setContenido("Lucia");
        System.out.println(miCaja);

        Caja<Integer> miCaja2 = new Caja<>();
        miCaja2.setContenido(100);
        System.out.println(miCaja2);

        Caja<Double> miCaja3 = new Caja<>();
        miCaja3.setContenido(3.1416);
        System.out.println(miCaja3);

        Caja<Gato> miCaja4 = new Caja<>();
        miCaja4.setContenido(new Gato());
        System.out.println(miCaja4);

        //metodos estaticos

        Integer arrayEnteros[] = {10,25,50,89,105,2};

        String arrayString[] = {"Lupita","Juan","Pedro"};

        Double []arrayDoble ={4.5,8.9,90.999,1.5};

        Utilidades.imprimirArray(arrayEnteros);
        Utilidades.imprimirArray(arrayString);
        Utilidades.imprimirArray(arrayDoble);






        
        

       


         

    }
       

}