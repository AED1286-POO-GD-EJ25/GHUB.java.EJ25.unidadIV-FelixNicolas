package desacoplar;
public class MiApp{
    public static void main(String[] args) {
       /* Comunicador t1= new TelefonoCelular();
        Comunicador t2= new PalomaMensajera();        
        Comunicador t3= new Telegrafo();

        t1.enviarMensaje("HOLA");
        t2.enviarMensaje("HOLAA");
        t3.enviarMensaje("HOLAAA"); */
        Comunicador c = ComunicacionManager.crearComunicador();
        c.enviarMensaje("Holaaaa.<><><><>");
    }
}