package desacoplar;
public class Telegrafo extends Reliquia implements Comunicador{
    @Override
    public void enviarMensaje(String mensaje){
        System.out.println("Mensaje enviado por telegrafo: "+ mensaje);
    }

}