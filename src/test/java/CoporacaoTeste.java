import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CoporacaoTeste {

    @Test
    public void deveRetornarMilitares(){
        Corporacao corporacao = new Corporacao();
        corporacao.matricular("Ricardo", "Soldado");
        corporacao.matricular("Alexandre", "Soldado");
        corporacao.matricular("André", "Soldado");
        corporacao.matricular("Carlos", "Sargento");
        corporacao.matricular("Felipe", "Tenente");

        List <String> saida = Arrays.asList(
                "Militar{nome='Ricardo', patente='Soldado'}",
                "Militar{nome='Alexandre', patente='Soldado'}",
                "Militar{nome='André', patente='Soldado'}",
                "Militar{nome='Carlos', patente='Sargento'}",
                "Militar{nome='Felipe', patente='Tenente'}");

        assertEquals(saida, corporacao.obterMilitares());

    }

    @Test
    public void deveRetornarTotalPatentes(){
        Corporacao corporacao = new Corporacao();
        corporacao.matricular("Ricardo", "Soldado");
        corporacao.matricular("Alexandre", "Soldado");
        corporacao.matricular("André", "Soldado");
        corporacao.matricular("Carlos", "Sargento");
        corporacao.matricular("Felipe", "Tenente");

        assertEquals(3, PatenteFactory.getTotalPatentes());

    }

}
