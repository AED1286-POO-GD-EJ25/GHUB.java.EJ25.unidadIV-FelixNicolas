package desacoplar;
public class TelefonoCelular extends Telefono implements Comunicador{
    @Override
    public void enviarMensaje(String mensaje){
        System.out.println("Mensaje enviado por telefono celular: "+ mensaje);
    }
}