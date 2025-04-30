package desacoplar;

public class ComunicacionManager {
    public static Comunicador crearComunicador(){
        return new PalomaMensajera();
    }
}
