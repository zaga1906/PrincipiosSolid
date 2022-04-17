package principle.dependencyinversion.correct;

import java.util.List;

public class Repository {

    public static List<String> getData(){
        List listaDatos = MongoDB.find("{}");

        // podriamos cambiar a una base de datos SQLite y la clase controller no se daria por enterada.
        // ArrayList listaDatos = SQLite.query("SELECT * FROM data");

        return listaDatos;
    }
}
