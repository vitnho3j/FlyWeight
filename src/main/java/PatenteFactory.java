import java.util.HashMap;
import java.util.Map;

public class PatenteFactory {

    private static Map<String, Patente> patentes = new HashMap<>();

    public static Patente getPatente(String nome) {
        Patente patente = patentes.get(nome);
        if (patente == null) {
            patente = new Patente(nome);
            patentes.put(nome, patente);
        }
        return patente;
    }

    public static int getTotalPatentes(){
        return patentes.size();
    }

}
