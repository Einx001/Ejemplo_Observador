package patronobservador;

import java.util.ArrayList;
import java.util.List;

public class CanalNoticias {
    private List<Observador> suscriptores = new ArrayList<>();
    private String ultimaNoticia;

    public void agregarSuscriptor(Observador o) {
        suscriptores.add(o);
    }

    public void eliminarSuscriptor(Observador o) {
        suscriptores.remove(o);
    }

    public void nuevaNoticia(String noticia) {
        this.ultimaNoticia = noticia;
        notificarSuscriptores();
    }

    private void notificarSuscriptores() {
        for (Observador o : suscriptores) {
            o.actualizar(ultimaNoticia);
        }
    }
}
