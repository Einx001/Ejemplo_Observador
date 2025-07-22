package patronobservador;

public class Suscriptor implements Observador {
    private String nombre;

    public Suscriptor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String noticia) {
        System.out.println(nombre + " ha recibido la noticia: " + noticia);
    }
}
