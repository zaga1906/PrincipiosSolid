package principle.dependencyinversion.correct;

import java.util.ArrayList;
import java.util.List;

public class MongoDB {

    public static List<String> find(String query){
        List<String> listaRegistros = new ArrayList<>();
        listaRegistros.add("Edgar");
        listaRegistros.add("Santiago");
        listaRegistros.add("Simon");
        listaRegistros.add("Tatiana");
        return listaRegistros;
    }
}
