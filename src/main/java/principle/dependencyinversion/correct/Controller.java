package principle.dependencyinversion.correct;

import java.util.List;

public class Controller {

    public static void consultarNombres(){
        List<String> listaNombres =  Repository.getData(); // Solo sabe que esta funcion retirna datos no le importa como los obtiene.
        int i=1;
        for (String nombre : listaNombres) {
            System.out.println(i + ". " + nombre);
            i++;
        }
    }
}
