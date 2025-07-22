package patronobservador;

public class PatronObservador {
    public static void main(String[] args) {
        CanalNoticias canal = new CanalNoticias();

        Suscriptor s1 = new Suscriptor("Ana");
        Suscriptor s2 = new Suscriptor("Carlos");

        canal.agregarSuscriptor(s1);
        canal.agregarSuscriptor(s2);

        canal.nuevaNoticia("Nuevo eclipse solar mañana a las 10 AM");

        canal.eliminarSuscriptor(s1);

        canal.nuevaNoticia("Terremoto leve sacude la costa central");
    }
}
