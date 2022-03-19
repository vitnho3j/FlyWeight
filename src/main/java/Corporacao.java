import java.util.ArrayList;
import java.util.List;

public class Corporacao {

    private List<Militar> militares = new ArrayList<>();

    public void matricular(String nomeMilitar, String nomePatente){
        Patente patente = PatenteFactory.getPatente(nomePatente);
        Militar militar = new Militar(nomeMilitar, patente);
        militares.add(militar);
    }

    public List<String> obterMilitares(){
        List<String> saida = new ArrayList<>();
        for (Militar militar : this.militares){
            saida.add(militar.obterMilitar());
        }
        return saida;
    }

}
