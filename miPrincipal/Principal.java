package miPrincipal;
import fecha.*;
import abstractas.*;

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

        

       


         

    }
       

}