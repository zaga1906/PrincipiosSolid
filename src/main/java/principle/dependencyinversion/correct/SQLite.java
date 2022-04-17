package principle.dependencyinversion.correct;

import java.util.ArrayList;
import java.util.List;

public class SQLite {

    public static List<String> query(String query){
        List<String> listaRegistros = new ArrayList<>();
        listaRegistros.add("Edgar");
        listaRegistros.add("Santiago");
        listaRegistros.add("Simon");
        listaRegistros.add("Tatiana");
        return listaRegistros;
    }
}
